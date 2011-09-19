package com.petersoft.advancedswing.jprogressbardialog;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.GroupLayout;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;

import com.petersoft.CommonLib;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used commercially (ie, by a
 * corporation, company or business for any purpose whatever) then you should purchase a license for each developer using Jigloo. Please visit www.cloudgarden.com for details. Use
 * of Jigloo implies acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR ANY
 * CORPORATE OR COMMERCIAL PURPOSE.
 */
public class JProgressBarDialog extends javax.swing.JDialog {
	public JPanel jControlPanel;
	public JPanel jMainPanel;
	public JProgressBar jProgressBar;
	public Thread thread;

	public JProgressBarDialog(JFrame frame) {
		super(frame);
		initGUI();
	}

	public JProgressBarDialog() {
		super();
		;
		initGUI();
	}

	public JProgressBarDialog(Dialog owner, boolean modal) {
		super(owner, modal);
		;
		initGUI();
	}

	public JProgressBarDialog(Dialog owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		;
		initGUI();
	}

	public JProgressBarDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		;
		initGUI();
	}

	public JProgressBarDialog(Dialog owner, String title) {
		super(owner, title);
		;
		initGUI();
	}

	public JProgressBarDialog(Dialog owner) {
		super(owner);
		;
		initGUI();
	}

	public JProgressBarDialog(Frame owner, boolean modal) {
		super(owner, modal);
		;
		initGUI();
	}

	public JProgressBarDialog(Frame owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		;
		initGUI();
	}

	public JProgressBarDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		;
		initGUI();
	}

	public JProgressBarDialog(Frame owner, String title) {
		super(owner, title);
		;
		initGUI();
	}

	public JProgressBarDialog(Frame owner) {
		super(owner);
		;
		initGUI();
	}

	public JProgressBarDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		;
		initGUI();
	}

	public JProgressBarDialog(Window owner, String title, ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		;
		initGUI();
	}

	public JProgressBarDialog(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
		;
		initGUI();
	}

	public JProgressBarDialog(Window owner, String title) {
		super(owner, title);
		initGUI();
	}

	public JProgressBarDialog(Window owner) {
		super(owner);
		initGUI();
	}

	private void initGUI() {
		try {
			{
				jControlPanel = new JPanel();
				getContentPane().add(jControlPanel, BorderLayout.SOUTH);
			}
			{
				jMainPanel = new JPanel();
				GroupLayout jMainPanelLayout = new GroupLayout((JComponent) jMainPanel);
				jMainPanel.setLayout(jMainPanelLayout);
				getContentPane().add(jMainPanel, BorderLayout.CENTER);
				{
					jProgressBar = new JProgressBar();
				}
				jMainPanelLayout.setHorizontalGroup(jMainPanelLayout.createSequentialGroup().addContainerGap().addComponent(jProgressBar, 0, 394, Short.MAX_VALUE)
						.addContainerGap());
				jMainPanelLayout.setVerticalGroup(jMainPanelLayout.createSequentialGroup().addContainerGap(53, 53)
						.addComponent(jProgressBar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE).addContainerGap(70, Short.MAX_VALUE));
			}
			this.setSize(428, 185);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonLib.centerDialog(this);
	}

	public void setVisible(boolean b) {
		if (thread != null) {
			thread.start();
		}
		new Thread() {
			public void run() {
				try {
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finished();
			}
		}.start();
		super.setVisible(b);
	}

	private void finished() {
		super.setVisible(false);
	}

}
