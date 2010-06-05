package com.petersoft.advancedswing.jdropdownbutton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

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
public class JDropDownButton extends JButton {
	private JButton jDropDownButton;
	private JPopupMenu jPopupMenu = new JPopupMenu();

	public JPopupMenu getjPopupMenu() {
		return jPopupMenu;
	}

	public void setjPopupMenu(JPopupMenu jPopupMenu) {
		this.jPopupMenu = jPopupMenu;
	}

	public JDropDownButton() {
		super();
		initGUI();
	}

	public JDropDownButton(String str) {
		super(str);
		initGUI();
	}

	public void add(JMenuItem jMenuItem) {
		jPopupMenu.add(jMenuItem);
		jMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButtonActionPerformed(evt);
			}
		});
	}

	public void remove(JMenuItem jMenuItem) {
		jPopupMenu.remove(jMenuItem);
	}

	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			this.setLayout(thisLayout);
			{
				jDropDownButton = new JButton();
				jDropDownButton.setBorder(null);
				this.add(jDropDownButton, BorderLayout.EAST);
				jDropDownButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/petersoft/advancedswing/jdropdownbutton/add.png")));
				jDropDownButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jDropDownButtonActionPerformed(evt);
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jDropDownButtonActionPerformed(ActionEvent evt) {
		jPopupMenu.show(this, jDropDownButton.getLocation().x, jDropDownButton.getHeight());
	}

	private void jButtonActionPerformed(ActionEvent evt) {
		this.fireActionPerformed(evt);
	}

}
