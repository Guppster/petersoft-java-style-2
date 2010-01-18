package com.petersoft.advancedswing.jmaximizabletabbedpane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;

import com.petersoft.white.CheckBoxUI;

public class JMaximizableTabbedPane extends JTabbedPane implements MouseListener {
	private double scaleRatio = 0.7;
	ImageIcon closeIcon = new ImageIcon(CheckBoxUI.class.getResource("images/JMaximizableTabbedpane/closeIcon.gif"));

	private HashMap<String, Component> maps = new HashMap<String, Component>();

	private boolean isMaximized;

	LayoutManager layout;
	Component[] components;
	JMaximizableTabbedPane originalClosableTabbedPane;
	int originalSelectedIndex;

	final String ENDING_STRING = "    ";
	HashSet<Integer> closableTabIndex = new HashSet<Integer>();

	public HashSet<Integer> getClosableTabIndex() {
		return closableTabIndex;
	}

	public void setClosableTabIndex(HashSet<Integer> closableTabIndex) {
		this.closableTabIndex = closableTabIndex;
	}

	public JMaximizableTabbedPane() {
		this(false);
	}

	public JMaximizableTabbedPane(boolean isMaximized) {
		super();
		this.setUI(new JMaximizableTabbedPaneUI());
		this.isMaximized = isMaximized;
		addMouseListener(this);
	}

	public int getOriginalSelectedIndex() {
		return originalSelectedIndex;
	}

	public void setOriginalSelectedIndex(int originalSlectedIndex) {
		this.originalSelectedIndex = originalSlectedIndex;
	}

	public JMaximizableTabbedPane getOriginalClosableTabbedPane() {
		return originalClosableTabbedPane;
	}

	public void setOriginalClosableTabbedPane(JMaximizableTabbedPane originalClosableTabbedPane) {
		this.originalClosableTabbedPane = originalClosableTabbedPane;
	}

	public boolean isMaximized() {
		return isMaximized;
	}

	public void setMaximized(boolean isMaximized) {
		this.isMaximized = isMaximized;
	}

	public void addTabWithCloseButton(String title, Icon icon, Component component, String tip) {
		super.addTab(title, icon, component, tip);
		this.closableTabIndex.add(this.getTabCount() - 1);
	}

	public void insertTab(String title, Icon icon, Component component, String tooltip, int index) {
		tooltip = "tab" + component.hashCode();
		maps.put(tooltip, component);
		if (!title.endsWith(ENDING_STRING)) {
			title += ENDING_STRING;
		}
		super.insertTab(title, icon, component, tooltip, index);
	}

	public void removeTabAt(int index) {
		Component component = getComponentAt(index);
		maps.remove("tab" + component.hashCode());
		closableTabIndex.remove(index);
		super.removeTabAt(index);
	}

	public JToolTip createToolTip() {
		ImageToolTip tooltip = new ImageToolTip();
		tooltip.setComponent(this);
		return tooltip;
	}

	class ImageToolTip extends JToolTip {
		public Dimension getPreferredSize() {
			String tip = getTipText();
			Component component = maps.get(tip);
			if (component != null) {
				return new Dimension((int) (getScaleRatio() * component.getWidth()), (int) (getScaleRatio() * component.getHeight()));
			} else {
				return super.getPreferredSize();
			}
		}

		public void paintComponent(Graphics g) {
			String tip = getTipText();
			Component component = maps.get(tip);
			if (component instanceof JComponent) {
				JComponent jcomponent = (JComponent) component;
				Graphics2D g2d = (Graphics2D) g;
				AffineTransform at = g2d.getTransform();
				g2d.transform(AffineTransform.getScaleInstance(getScaleRatio(), getScaleRatio()));
				ArrayList<JComponent> dbcomponents = new ArrayList<JComponent>();
				updateDoubleBuffered(jcomponent, dbcomponents);
				jcomponent.paint(g);
				resetDoubleBuffered(dbcomponents);
				g2d.setTransform(at);
			}
		}

		private void updateDoubleBuffered(JComponent component, ArrayList<JComponent> dbcomponents) {
			if (component.isDoubleBuffered()) {
				dbcomponents.add(component);
				component.setDoubleBuffered(false);
			}
			for (int i = 0; i < component.getComponentCount(); i++) {
				Component c = component.getComponent(i);
				if (c instanceof JComponent) {
					updateDoubleBuffered((JComponent) c, dbcomponents);
				}
			}
		}

		private void resetDoubleBuffered(ArrayList<JComponent> dbcomponents) {
			for (JComponent component : dbcomponents) {
				component.setDoubleBuffered(true);
			}
		}
	}

	public double getScaleRatio() {
		return scaleRatio;
	}

	public void setScaleRatio(double scaleRatio) {
		this.scaleRatio = scaleRatio;
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			Component obj = this.getParent();
			while (obj != null) {
				if (obj instanceof JMaximizableTabbedPane_BasePanel) {
					JMaximizableTabbedPane_BasePanel basePanel = (JMaximizableTabbedPane_BasePanel) obj;
					JMaximizableTabbedPane tabbedPane = (JMaximizableTabbedPane) e.getSource();
					int selectedIndex = tabbedPane.getSelectedIndex();
					if (!tabbedPane.isMaximized) {
						JMaximizableTabbedPane newTabbedPane = new JMaximizableTabbedPane(true);
						newTabbedPane.setOriginalClosableTabbedPane(this);
						newTabbedPane.setOriginalSelectedIndex(this.getSelectedIndex());
						// newTabbedPane.setOriginalIcon(this.getIconAt(this.getSelectedIndex()));

						int tempSelectedIndex = this.getSelectedIndex();
						// add all components to newTabbedPane
						Component components[] = new Component[this.getTabCount()];
						String componentsName[] = new String[this.getTabCount()];
						for (int x = 0; x < this.getTabCount(); x++) {
							components[x] = this.getComponentAt(x);
							componentsName[x] = this.getTitleAt(x);
						}
						for (int x = 0; x < components.length; x++) {
							newTabbedPane.addTab(componentsName[x], this.getIconAt(this.getSelectedIndex()), components[x]);
						}
						// end add all components to newTabbedPane
						newTabbedPane.setClosableTabIndex(this.getClosableTabIndex());
						newTabbedPane.setSelectedIndex(tempSelectedIndex);

						JPanel panel1 = new JPanel();
						panel1.setLayout(new BorderLayout());
						panel1.add(newTabbedPane, BorderLayout.CENTER);
						JToolBar eastPanel = new JToolBar();
						JToolBar southPanel = new JToolBar();
						JToolBar westPanel = new JToolBar();
						JToolBar northPanel = new JToolBar();
						eastPanel.setLayout(new BoxLayout(eastPanel, javax.swing.BoxLayout.Y_AXIS));
						southPanel.setLayout(new BoxLayout(southPanel, javax.swing.BoxLayout.X_AXIS));
						westPanel.setLayout(new BoxLayout(westPanel, javax.swing.BoxLayout.Y_AXIS));
						northPanel.setLayout(new BoxLayout(northPanel, javax.swing.BoxLayout.X_AXIS));

						panel1.add(eastPanel, BorderLayout.EAST);
						panel1.add(southPanel, BorderLayout.SOUTH);
						panel1.add(westPanel, BorderLayout.WEST);
						panel1.add(northPanel, BorderLayout.NORTH);

						// get all the tabs
						/*
						 * at this monent, all the tabs in current tabbedpane is moved to the newtab, so getAllTabs will not able to get
						 * them
						 */
						HashSet<Component> allComponents = new HashSet<Component>();
						getAllTabs(this, allComponents);
						deleteExceptTabbedPane(allComponents);
						for (Component c : allComponents) {
							if (c instanceof JTabbedPane) {
								JTabbedPane jTabbedPane = (JTabbedPane) c;

								Point p = new Point();
								SwingUtilities.convertPointToScreen(p, jTabbedPane);

								Point currentPoint = new Point();
								SwingUtilities.convertPointToScreen(currentPoint, this);

								for (int x = 0; x < jTabbedPane.getTabCount(); x++) {
									if (jTabbedPane.getIconAt(x) != null) {
										JButton jButton = new JButton(jTabbedPane.getIconAt(x));
										jButton.setToolTipText(jTabbedPane.getTitleAt(x));

										class MyActionListener implements ActionListener {
											JTabbedPane jTabbedPane;

											public MyActionListener(JTabbedPane jTabbedPane) {
												this.jTabbedPane = jTabbedPane;

											}

											public void actionPerformed(ActionEvent e) {
												MouseEvent mouseEvent = new MouseEvent(jTabbedPane, 0, 0, 0, 0, 0, 2, false);
												mouseClicked(mouseEvent);
											}
										}

										jButton.addActionListener(new MyActionListener(newTabbedPane));
										if (p.x < currentPoint.x) {
											westPanel.add(jButton);
										} else if (p.x > currentPoint.x) {
											eastPanel.add(jButton);
										} else if (p.y < currentPoint.y) {
											northPanel.add(jButton);
										} else {
											southPanel.add(jButton);
										}
									}
								}
							}
						}
						// end get all the tabs

						basePanel.add(panel1, "newtab");
						CardLayout cardLayout = (CardLayout) basePanel.getLayout();
						cardLayout.show(basePanel, "newtab");
						return;
					} else {
						Component components[] = new Component[tabbedPane.getTabCount()];
						String componentsName[] = new String[tabbedPane.getTabCount()];
						for (int x = 0; x < tabbedPane.getTabCount(); x++) {
							components[x] = tabbedPane.getComponentAt(x);
							componentsName[x] = tabbedPane.getTitleAt(x);
						}
						for (int x = 0; x < components.length; x++) {
							tabbedPane.getOriginalClosableTabbedPane().addTab(componentsName[x], tabbedPane.getIconAt(tabbedPane.getSelectedIndex()), components[x]);
						}

						tabbedPane.getOriginalClosableTabbedPane().setSelectedIndex(selectedIndex);
						CardLayout cardLayout = (CardLayout) basePanel.getLayout();
						cardLayout.show(basePanel, "MAIN");
						return;
					}
				}
				obj = obj.getParent();
			}
		} else {
			int tabNumber = getUI().tabForCoordinate(this, e.getX(), e.getY());
			if (this.closableTabIndex.contains(tabNumber) && tabNumber >= 0) {
				Rectangle tabRect = getUI().getTabBounds(this, tabNumber);
				int closeIconY = tabRect.y + ((tabRect.height - closeIcon.getIconHeight()) / 2);
				if ((e.getX() >= tabRect.x + tabRect.width - 20 && e.getX() <= tabRect.x + tabRect.width) && (e.getY() >= closeIconY && e.getY() <= closeIconY + closeIcon.getIconHeight())) {
					this.removeTabAt(tabNumber);
				}
			}
		}
	}

	private void deleteExceptTabbedPane(HashSet<Component> components) {
		Iterator<Component> it = components.iterator();
		while (it.hasNext()) {
			Component component = it.next();
			if (!(component instanceof JTabbedPane)) {
				it.remove();
			}
		}
	}

	private void getAllTabs(Component component, HashSet<Component> list) {
		if (list.contains(component)) {
			return;
		}
		if (component instanceof JMaximizableTabbedPane_BasePanel) {
			return;
		}
		list.add(component);

		if (component instanceof JPanel) {
			Component[] components = ((JPanel) component).getComponents();
			for (Component c : components) {
				getAllTabs(c, list);
			}
		}
		if (component instanceof JSplitPane) {
			JSplitPane jSplitPane = (JSplitPane) component;
			Component[] components = jSplitPane.getComponents();
			for (Component c : components) {
				getAllTabs(c, list);
			}
		}
		if (component.getParent() != null) {
			getAllTabs(component.getParent(), list);
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
