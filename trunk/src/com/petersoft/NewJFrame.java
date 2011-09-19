package com.petersoft;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class NewJFrame extends javax.swing.JFrame {
	private JSplitPane jSplitPane1;
	private JPanel jPanel1;
	private JPanel jPanel4;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JTabbedPane jTabbedPane2;
	private JTabbedPane jTabbedPane1;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public NewJFrame() {
		super();
		try {
			UIManager.setLookAndFeel("com.petersoft.white.PetersoftWhiteLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			{
				jSplitPane1 = new JSplitPane();
				getContentPane().add(jSplitPane1, BorderLayout.CENTER);
				jSplitPane1.setDividerLocation(150);
				{
					jTabbedPane1 = new JTabbedPane();
					jSplitPane1.add(jTabbedPane1, JSplitPane.LEFT);
					jTabbedPane1.addMouseMotionListener(new MouseMotionAdapter() {
						public void mouseDragged(MouseEvent evt) {
							jTabbedPane1MouseDragged(evt);
						}
					});
					jTabbedPane1.addMouseListener(new MouseAdapter() {
						public void mouseReleased(MouseEvent evt) {
							jTabbedPane1MouseReleased(evt);
						}
					});
					{
						jPanel3 = new JPanel();
						jTabbedPane1.addTab("jPanel3", null, jPanel3, null);
					}
					{
						jPanel1 = new JPanel();
						jTabbedPane1.addTab("jPanel1", null, jPanel1, null);
					}
				}
				{
					jTabbedPane2 = new JTabbedPane();
					jSplitPane1.add(jTabbedPane2, JSplitPane.RIGHT);
					jTabbedPane2.addMouseListener(new MouseAdapter() {
						public void mouseReleased(MouseEvent evt) {
							jTabbedPane2MouseReleased(evt);
						}
						public void mousePressed(MouseEvent evt) {
							jTabbedPane2MousePressed(evt);
						}
					});
					jTabbedPane2.addMouseMotionListener(new MouseMotionAdapter() {
						public void mouseDragged(MouseEvent evt) {
							jTabbedPane2MouseDragged(evt);
						}
					});
					{
						jPanel2 = new JPanel();
						jTabbedPane2.addTab("jPanel2", null, jPanel2, null);
					}
					{
						jPanel4 = new JPanel();
						jTabbedPane2.addTab("jPanel4", null, jPanel4, null);
						jPanel4.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								jPanel4MouseClicked(evt);
							}
						});
						jPanel4.addMouseMotionListener(new MouseMotionAdapter() {
							public void mouseMoved(MouseEvent evt) {
								jPanel4MouseMoved(evt);
							}
							public void mouseDragged(MouseEvent evt) {
								jPanel4MouseDragged(evt);
							}
						});
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jPanel4MouseDragged(MouseEvent evt) {
		System.out.println("jPanel4.mouseDragged, event="+evt);
	}
	
	private void jPanel4MouseMoved(MouseEvent evt) {
		System.out.println("jPanel4.mouseMoved, event="+evt);
		//TODO add your code for jPanel4.mouseMoved
	}
	
	private void jPanel4MouseClicked(MouseEvent evt) {
		System.out.println("jPanel4.mouseClicked, event="+evt);
		//TODO add your code for jPanel4.mouseClicked
	}
	
	private void jTabbedPane2MouseDragged(MouseEvent evt) {
		System.out.println("jTabbedPane2.mouseDragged, event="+evt);
		//TODO add your code for jTabbedPane2.mouseDragged
	}
	
	private void jTabbedPane1MouseReleased(MouseEvent evt) {
		System.out.println("jTabbedPane1.mouseReleased, event="+evt);
		//TODO add your code for jTabbedPane1.mouseReleased
	}
	
	private void jTabbedPane1MouseDragged(MouseEvent evt) {
		System.out.println("jTabbedPane1.mouseDragged, event="+evt);
		//TODO add your code for jTabbedPane1.mouseDragged
	}
	
	private void jTabbedPane2MousePressed(MouseEvent evt) {
		System.out.println("jTabbedPane2.mousePressed, event="+evt);
		//TODO add your code for jTabbedPane2.mousePressed
	}
	
	private void jTabbedPane2MouseReleased(MouseEvent evt) {
		System.out.println("jTabbedPane2.mouseReleased, event="+evt);
		//TODO add your code for jTabbedPane2.mouseReleased
	}

}
