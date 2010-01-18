package com.petersoft;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ListModel;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.petersoft.advancedswing.diskpanel.DiskPanel;
import com.petersoft.advancedswing.jclosabletabbedpane.JClosableTabbedPane;
import com.petersoft.advancedswing.jmaximizabletabbedpane.JMaximizableTabbedPane;
import com.petersoft.advancedswing.jmaximizabletabbedpane.JMaximizableTabbedPane_BasePanel;

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
public class JMainFrame extends JFrame {
	JTabbedPane jTabbedPane1 = new JTabbedPane();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	JPanel JTextAreaPanel = new JPanel();
	JTextArea JTextArea1 = new JTextArea();
	JPanel pTogglePanel = new JPanel();
	JToggleButton JToggleButton1 = new JToggleButton();
	JPanel pAboutPanel = new JPanel();
	BorderLayout borderLayout2 = new BorderLayout();
	JLabel pVersionLabel = new JLabel();
	JPanel JRadioButtonPanel = new JPanel();
	JRadioButton JRadioButton3 = new JRadioButton();
	JRadioButton JRadioButton4 = new JRadioButton();
	JRadioButton JRadioButton5 = new JRadioButton();
	ButtonGroup buttonGroup2 = new ButtonGroup();
	JPanel JCheckBoxPanel = new JPanel();
	private JLabel JLabel6;
	private JLabel JLabel5;
	private JPanel JPanel2;
	private JComboBox JComboBox2;
	private JRadioButton JRadioButton1;
	private JCheckBox JCheckBox1;
	private JComboBox jComboBox1;
	private JComboBox JComboBox1;
	private JPanel JPanel1;
	private JPanel pJComboBoxPanel;
	private JButton pOpenPFileChooserDialogButton;
	private JPanel pPFileChooserDialogPanel;
	private JButton pOpenFileDialogButton;
	private JPanel pOpenFileDialogPanel;
	JCheckBox JCheckBox3 = new JCheckBox();
	JCheckBox JCheckBox4 = new JCheckBox();
	JCheckBox JCheckBox5 = new JCheckBox();
	JPanel JScrollPanel = new JPanel();
	JScrollPane JScrollPane5 = new JScrollPane();
	JTextArea JTextArea2 = new JTextArea();
	JPanel JScrollBarPanel = new JPanel();
	JScrollBar JScrollBar2 = new JScrollBar();
	JScrollBar JScrollBar3 = new JScrollBar();
	JPanel JToolBarPanel = new JPanel();
	private JPanel jPanel9;
	private JTabbedPane jTabbedPane3;
	private JTable jTable3;
	private JSplitPane jSplitPane2;
	private JTable jTable2;
	private JTree jTree1;
	private JSplitPane jSplitPane1;
	private JPanel jPanel8;
	private JButton jButton1;
	private JPanel jPanel20;
	private JPanel jPanel22;
	private JPanel jPanel24;
	private JPanel jPanel26;
	private JProgressBar jProgressBar3;
	private JTable jTable10;
	private JTable jTable9;
	private JPanel jPanel31;
	private JPanel jPanel30;
	private JPanel jPanel28;
	private JPanel jPanel25;
	private JMaximizableTabbedPane jMaximizableTabbedPane2;
	private JMaximizableTabbedPane jMaximizableTabbedPane1;
	private JSplitPane jSplitPane6;
	private JPanel jPanel23;
	private JPanel jPanel21;
	private JMaximizableTabbedPane jTabbedPane6;
	private JSplitPane jSplitPane5;
	private JMaximizableTabbedPane_BasePanel jMaximizableTabbedPane_BasePanel1;
	private JTable jTable8;
	private JTable jTable7;
	private JTable jTable6;
	private JTable jTable5;
	private JTabbedPane jTabbedPane5;
	private JClosableTabbedPane jTabbedPane4;
	private JSplitPane jSplitPane4;
	private JTable jTable4;
	private JSplitPane jSplitPane3;
	private JPanel jPanel19;
	private DiskPanel diskPanel1;
	private JPanel jPanel18;
	private JButton jButton19;
	private JButton jButton18;
	private JButton jButton17;
	private JToolBar jToolBar2;
	private JButton jButton16;
	private JPanel jPanel17;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JButton jButton15;
	private JButton jButton14;
	private JButton jButton13;
	private JButton jButton12;
	private JButton jButton11;
	private JButton jButton10;
	private JPanel jPanel16;
	private JCheckBoxMenuItem jCheckBoxMenuItem4;
	private JCheckBoxMenuItem jCheckBoxMenuItem3;
	private JRadioButtonMenuItem jRadioButtonMenuItem4;
	private JRadioButtonMenuItem jRadioButtonMenuItem3;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem1;
	private JRadioButton jRadioButton1;
	private JToggleButton jToggleButton5;
	private JButton jButton9;
	private JToolBar jToolBar1;
	private JPanel jPanel15;
	private JComboBox jComboBox3;
	private JSpinner jSpinner1;
	private JSlider jSlider2;
	private JSlider jSlider1;
	private JPanel jPanel14;
	private JEditorPane jEditorPane1;
	private JTextPane jTextPane1;
	private JProgressBar jProgressBar2;
	private JProgressBar jProgressBar1;
	private JPanel jPanel13;
	private JToggleButton jToggleButton4;
	private JToggleButton jToggleButton3;
	private JButton jButton8;
	private JButton jButton7;
	private JButton jButton6;
	private JPanel jPanel12;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JPanel jPanel11;
	private JPanel jPanel10;
	private JPanel jPanel7;
	private JPanel jPanel6;
	private JPanel jPanel5;
	private JPanel jPanel4;
	private JTabbedPane jTabbedPane2;
	private JPanel jPanel3;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JPanel jPanel2;
	private JSeparator jSeparator2;
	private JMenu jMenu8;
	private JSeparator jSeparator1;
	private JMenu jMenu7;
	private JMenu jMenu6;
	private JRadioButtonMenuItem jRadioButtonMenuItem2;
	private JRadioButtonMenuItem jRadioButtonMenuItem1;
	private JCheckBoxMenuItem jCheckBoxMenuItem2;
	private JMenu jMenu5;
	private JCheckBoxMenuItem jCheckBoxMenuItem1;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JList jList1;
	private JPanel jPanel1;
	private JFileChooser jFileChooser1;
	JToolBar JToolBar2 = new JToolBar();
	JButton JButton3 = new JButton();
	JToggleButton jToggleButton1 = new JToggleButton();
	private JToggleButton jToggleButton2;

	JPanel pFileChooserPanel = new JPanel();
	// JFileChooser pFileChooser1 = new JFileChooser();
	JPanel pIntroductionPanel = new JPanel();
	JScrollPane JScrollPane1 = new JScrollPane();
	BorderLayout borderLayout3 = new BorderLayout();
	JLabel pIntroductionTextArea = new JLabel();
	JTextField JTextField1 = new JTextField();
	BorderLayout borderLayout1 = new BorderLayout();
	JLabel JLabel1 = new JLabel();
	JLabel JLabel2 = new JLabel();
	JLabel JLabel3 = new JLabel();

	public JMainFrame() {
		super();
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);

		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		JTextArea1.setText("JTextArea1");
		pTogglePanel.setLayout(null);
		JToggleButton1.setText("JToggleButton1");
		pAboutPanel.setLayout(borderLayout2);
		pVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pVersionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		JRadioButtonPanel.setLayout(null);
		JRadioButton3.setText("JRadioButton 2");
		JRadioButton4.setActionCommand("JRadioButton4");
		JRadioButton4.setText("JRadioButton 1");
		JRadioButton5.setText("JRadioButton3");
		JCheckBoxPanel.setLayout(null);
		JCheckBox3.setActionCommand("JCheckBox3");
		JCheckBox3.setText("JCheckBox 1");
		JCheckBox4.setText("JCheckBox 2");
		JCheckBox5.setText("JCheckBox 3");
		JScrollPanel.setLayout(borderLayout1);
		JTextArea2
				.setText("aaa012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n\n"

				);
		JScrollBarPanel.setLayout(null);
		JLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 24));
		JTextField1.setText("JTextField1");
		JLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel1.setText("This is JScrollPane");
		JLabel2.setText("Horizontal Scrollbar :");
		JLabel3.setText("Vertical Scrollbar :");
		pIntroductionTextArea.setHorizontalAlignment(SwingConstants.CENTER);
		JScrollBar2.addAdjustmentListener(new JMainFrame_JScrollBar2_adjustmentAdapter(this));
		JScrollBar3.addAdjustmentListener(new JMainFrame_JScrollBar3_adjustmentAdapter(this));
		JScrollBar2.setVisibleAmount(1);
		JScrollBar3.setVisibleAmount(1);
		this.setTitle("PetersoftJavaStyle Demo");
		{
			jMenuBar1 = new JMenuBar();
			setJMenuBar(jMenuBar1);
			{
				jMenu1 = new JMenu();
				jMenuBar1.add(jMenu1);
				jMenu1.setText("jMenu1");
				{
					jMenu2 = new JMenu();
					jMenu1.add(jMenu2);
					jMenu2.setText("jMenu2");
					{
						jMenu4 = new JMenu();
						jMenu2.add(jMenu4);
						jMenu4.setText("jMenu4");
						{
							jMenuItem1 = new JMenuItem();
							jMenu4.add(jMenuItem1);
							jMenuItem1.setText("jMenuItem1");
						}
						{
							jMenuItem2 = new JMenuItem();
							jMenu4.add(jMenuItem2);
							jMenuItem2.setText("jMenuItem2");
						}
					}
				}
				{
					jMenu3 = new JMenu();
					jMenu1.add(jMenu3);
					jMenu3.setText("jMenu3");
					{
						jMenuItem3 = new JMenuItem();
						jMenu3.add(jMenuItem3);
						jMenuItem3.setText("jMenuItem3");
					}
				}
				{
					jSeparator2 = new JSeparator();
					jMenu1.add(jSeparator2);
				}
				{
					jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
					jMenu1.add(jCheckBoxMenuItem1);
					jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
				}
				{
					jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
					jMenu1.add(jCheckBoxMenuItem2);
					jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");
				}
			}
			{
				jMenu5 = new JMenu();
				jMenuBar1.add(jMenu5);
				jMenu5.setText("jMenu5");
				{
					jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
					jMenu5.add(jRadioButtonMenuItem1);
					jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
				}
				{
					jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
					jMenu5.add(jRadioButtonMenuItem2);
					jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");
				}
				{
					jMenu6 = new JMenu();
					jMenu5.add(jMenu6);
					jMenu6.setText("jMenu6");
					{
						jMenu7 = new JMenu();
						jMenu6.add(jMenu7);
						jMenu7.setText("jMenu7");
						{
							jRadioButtonMenuItem3 = new JRadioButtonMenuItem();
							jMenu7.add(jRadioButtonMenuItem3);
							jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");
						}
						{
							jRadioButtonMenuItem4 = new JRadioButtonMenuItem();
							jMenu7.add(jRadioButtonMenuItem4);
							jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");
						}
					}
					{
						jSeparator1 = new JSeparator();
						jMenu6.add(jSeparator1);
					}
					{
						jMenu8 = new JMenu();
						jMenu6.add(jMenu8);
						jMenu8.setText("jMenu8");
						{
							jCheckBoxMenuItem3 = new JCheckBoxMenuItem();
							jMenu8.add(jCheckBoxMenuItem3);
							jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");
						}
						{
							jCheckBoxMenuItem4 = new JCheckBoxMenuItem();
							jMenu8.add(jCheckBoxMenuItem4);
							jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");
						}
					}
				}
			}
		}
		this.getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
		jTabbedPane1.addTab("Introduction", null, pIntroductionPanel, null);
		JScrollBar3.setOrientation(JScrollBar.HORIZONTAL);
		JToggleButton1.setText("JToggleButton1");
		JButton3.setText("JButton3");
		jTabbedPane1.add(JTextAreaPanel, "JTextArea");
		pIntroductionTextArea.setFont(new java.awt.Font("Dialog", Font.PLAIN, 48));
		pIntroductionTextArea.setText("Petersoft Java Style 2");
		pIntroductionPanel.setLayout(borderLayout3);
		jTabbedPane1.addTab("JToggleButton", null, pTogglePanel, null);
		pFileChooserPanel.setLayout(null);
		{
			jToggleButton2 = new JToggleButton();
			pTogglePanel.add(jToggleButton2);
			jToggleButton2.setBounds(161, 46, 200, 40);
			jToggleButton2.setText("JToggleButton");
			jToggleButton2.setPreferredSize(new java.awt.Dimension(102, 23));
		}
		{
			jToggleButton3 = new JToggleButton();
			jToggleButton3.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
			pTogglePanel.add(jToggleButton3);
			jToggleButton3.setBounds(161, 201, 261, 40);
			jToggleButton3.setText("JToggleButton with icon");
		}
		{
			jToggleButton4 = new JToggleButton();
			jToggleButton4.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
			pTogglePanel.add(jToggleButton4);
			jToggleButton4.setBounds(161, 232, 256, 40);
			jToggleButton4.setText("JToggleButton with icon");
			jToggleButton4.setHorizontalAlignment(SwingConstants.LEFT);
		}
		jTabbedPane1.add(JTextAreaPanel, "JTextArea");
		JTextAreaPanel.setLayout(null);
		pTogglePanel.add(JToggleButton1);
		jToggleButton4.setBounds(25, 12, 155, 66);
		jTabbedPane1.add(JRadioButtonPanel, "JRadioButton");
		JRadioButtonPanel.add(JRadioButton3);
		jToggleButton4.setBounds(115, 73, 125, -1);
		JRadioButtonPanel.add(JRadioButton4);
		jToggleButton4.setBounds(115, 29, -1, -1);
		JRadioButtonPanel.add(JRadioButton5);
		jToggleButton4.setBounds(161, 135, 229, 33);
		buttonGroup2.add(JRadioButton4);
		buttonGroup2.add(JRadioButton3);
		buttonGroup2.add(JRadioButton5);
		jTabbedPane1.add(JCheckBoxPanel, "JCheckBox");
		JCheckBoxPanel.add(JCheckBox3);
		JCheckBox3.setBounds(99, 35, 150, 29);
		JCheckBoxPanel.add(JCheckBox4);
		JCheckBox4.setBounds(99, 84, -1, -1);
		JCheckBoxPanel.add(JCheckBox5);
		JCheckBox5.setBounds(99, 132, -1, -1);
		jTabbedPane1.add(JScrollPanel, "JScrollPane");
		jTabbedPane1.add(JScrollPanel, "JScrollPane");
		{
			jPanel20 = new JPanel();
			jTabbedPane1.addTab("JMaximizableTabbedPane", null, jPanel20, null);
			jPanel20.setLayout(null);
			{
				jMaximizableTabbedPane_BasePanel1 = new JMaximizableTabbedPane_BasePanel();
				jPanel20.add(jMaximizableTabbedPane_BasePanel1);
				jMaximizableTabbedPane_BasePanel1.setBounds(42, 33, 580, 291);
				{
					jSplitPane5 = new JSplitPane();
					jMaximizableTabbedPane_BasePanel1.add(jSplitPane5, "MAIN");
					jSplitPane5.setOrientation(JSplitPane.VERTICAL_SPLIT);
					jSplitPane5.setDividerLocation(140);
					{
						jTabbedPane6 = new JMaximizableTabbedPane();
						jSplitPane5.add(jTabbedPane6, JSplitPane.TOP);
						{
							jPanel21 = new JPanel();
							jTabbedPane6.addTab("jPanel21", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")), jPanel21, null);
						}
						{
							jPanel22 = new JPanel();
							jTabbedPane6.addTabWithCloseButton("jPanel22", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")), jPanel22, null);
						}
						{
							jPanel23 = new JPanel();
							jTabbedPane6.addTab("jPanel23", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")), jPanel23, null);
						}
						{
							jPanel30 = new JPanel();
							jTabbedPane6.addTab("jPanel30", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")), jPanel30, null);
						}
					}
					{
						jSplitPane6 = new JSplitPane();
						jSplitPane5.add(jSplitPane6, JSplitPane.BOTTOM);
						jSplitPane6.setDividerLocation(200);
						{
							jMaximizableTabbedPane1 = new JMaximizableTabbedPane();
							jSplitPane6.add(jMaximizableTabbedPane1, JSplitPane.RIGHT);
							{
								jPanel26 = new JPanel();
								jMaximizableTabbedPane1.addTab("jPanel26", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/warning.png")), jPanel26, null);
								{
									TableModel jTable9Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
									jTable9 = new JTable();
									jPanel26.add(jTable9);
									jTable9.setModel(jTable9Model);
								}
							}
							{
								jPanel31 = new JPanel();
								jMaximizableTabbedPane1.addTab("jPanel31", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/warning.png")), jPanel31, null);
							}
							{
								TableModel jTable10Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
								jTable10 = new JTable();
								jMaximizableTabbedPane1.addTab("jTable10", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/warning.png")), jTable10, null);
								jTable10.setModel(jTable10Model);
							}
						}
						{
							jMaximizableTabbedPane2 = new JMaximizableTabbedPane();
							jSplitPane6.add(jMaximizableTabbedPane2, JSplitPane.LEFT);
							{
								jPanel24 = new JPanel();
								jMaximizableTabbedPane2.addTab("jPanel24", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/information.png")), jPanel24, null);
							}
							{
								jPanel25 = new JPanel();
								jMaximizableTabbedPane2.addTab("jPanel25", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/information.png")), jPanel25, null);
							}
							{
								jPanel28 = new JPanel();
								jMaximizableTabbedPane2.addTab("jPanel28", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/information.png")), jPanel28, null);
							}
							{
								jProgressBar3 = new JProgressBar();
								jMaximizableTabbedPane2.addTab("jProgressBar3", new ImageIcon(this.getClass().getResource("white/images/JOptionPane/information.png")), jProgressBar3, null);
								jProgressBar3.setValue(50);
							}
						}
					}
				}
			}
		}
		{
			jPanel19 = new JPanel();
			jTabbedPane1.addTab("JClosableTabPane", null, jPanel19, null);
			jPanel19.setLayout(null);
			{
				jSplitPane3 = new JSplitPane();
				jPanel19.add(jSplitPane3);
				jSplitPane3.setBounds(60, 18, 538, 323);
				jSplitPane3.setOrientation(JSplitPane.VERTICAL_SPLIT);
				jSplitPane3.setDividerLocation(100);
				{
					TableModel jTable4Model = new DefaultTableModel(new String[][] { { "11", "22" }, { "33", "44" } }, new String[] { "Column 1", "Column 2" });
					jTable4 = new JTable();
					jSplitPane3.add(jTable4, JSplitPane.TOP);
					jTable4.setModel(jTable4Model);
				}
				{
					jSplitPane4 = new JSplitPane();
					jSplitPane3.add(jSplitPane4, JSplitPane.BOTTOM);
					jSplitPane4.setDividerLocation(200);
					{
						jTabbedPane4 = new JClosableTabbedPane(jPanel19);
						jSplitPane4.add(jTabbedPane4, JSplitPane.RIGHT);
						{
							TableModel jTable7Model = new DefaultTableModel(new String[][] { { "aa", "bb" }, { "cc", "dd" } }, new String[] { "Column 1", "Column 2" });
							jTable7 = new JTable();
							jTabbedPane4.addTab("jTable7", null, jTable7, null);
							jTable7.setModel(jTable7Model);
						}
						{
							TableModel jTable8Model = new DefaultTableModel(new String[][] { { "!!", "@@" }, { "##", "$$" } }, new String[] { "Column 1", "Column 2" });
							jTable8 = new JTable();
							jTabbedPane4.addTab("jTable8", null, jTable8, null);
							jTable8.setModel(jTable8Model);
						}
					}
					{
						jTabbedPane5 = new JTabbedPane();
						jSplitPane4.add(jTabbedPane5, JSplitPane.LEFT);
						{
							TableModel jTable5Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
							jTable5 = new JTable();
							jTabbedPane5.addTab("jTable5", null, jTable5, null);
							jTable5.setModel(jTable5Model);
						}
						{
							TableModel jTable6Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
							jTable6 = new JTable();
							jTabbedPane5.addTab("jTable6", null, jTable6, null);
							jTable6.setModel(jTable6Model);
						}
					}
				}
			}
		}
		{
			jPanel18 = new JPanel();
			BorderLayout jPanel18Layout = new BorderLayout();
			jTabbedPane1.addTab("DiskPanel", null, jPanel18, null);
			jPanel18.setLayout(jPanel18Layout);
			{
				diskPanel1 = new DiskPanel(new File("src/com/petersoft/JMainFrame.java"));
				jPanel18.add(diskPanel1, BorderLayout.CENTER);
			}
		}
		{
			jPanel17 = new JPanel();
			jTabbedPane1.addTab("Tooltip", null, jPanel17, null);
			jPanel17.setLayout(null);
			{
				jButton16 = new JButton();
				jPanel17.add(jButton16);
				jButton16.setText("Please mouse over here");
				jButton16.setBounds(268, 116, 177, 56);
				jButton16.setToolTipText("Hello, this is a tooltip");
			}
		}
		{
			jPanel16 = new JPanel();
			jPanel16.setLayout(null);
			jTabbedPane1.addTab("JOptionPane", null, jPanel16, null);
			{
				jButton10 = new JButton();
				jPanel16.add(jButton10);
				jButton10.setText("Information");
				jButton10.setBounds(243, 88, 214, 21);
				jButton10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton10ActionPerformed(evt);
					}
				});
			}
			{
				jButton11 = new JButton();
				jPanel16.add(jButton11);
				jButton11.setText("Warning");
				jButton11.setBounds(243, 123, 214, 21);
				jButton11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton11ActionPerformed(evt);
					}
				});
			}
			{
				jButton12 = new JButton();
				jPanel16.add(jButton12);
				jButton12.setText("Error");
				jButton12.setBounds(243, 158, 214, 21);
				jButton12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton12ActionPerformed(evt);
					}
				});
			}
			{
				jButton13 = new JButton();
				jPanel16.add(jButton13);
				jButton13.setText("Plain Message");
				jButton13.setBounds(243, 193, 214, 21);
				jButton13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton13ActionPerformed(evt);
					}
				});
			}
			{
				jButton14 = new JButton();
				jPanel16.add(jButton14);
				jButton14.setText("Multi buttons");
				jButton14.setBounds(243, 228, 214, 21);
				jButton14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton14ActionPerformed(evt);
					}
				});
			}
			{
				jButton15 = new JButton();
				jPanel16.add(jButton15);
				jButton15.setText("Combobox");
				jButton15.setBounds(243, 263, 214, 21);
				jButton15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton15ActionPerformed(evt);
					}
				});
			}
		}
		{
			jPanel14 = new JPanel();
			jTabbedPane1.addTab("JSilder", null, jPanel14, null);
			jPanel14.setLayout(null);
			{
				jSlider1 = new JSlider();
				jPanel14.add(jSlider1);
				jSlider1.setBounds(102, 58, 360, 33);
			}
			{
				jSlider2 = new JSlider();
				jPanel14.add(jSlider2);
				jSlider2.setBounds(102, 119, 356, 72);
				jSlider2.setPaintTicks(true);
				jSlider2.setPaintLabels(true);
				jSlider2.setSnapToTicks(true);
				Hashtable labelTable = new Hashtable();
				labelTable.put(new Integer(0), new JLabel("min"));
				labelTable.put(new Integer(50), new JLabel("middle"));
				labelTable.put(new Integer(100), new JLabel("max"));
				jSlider2.setLabelTable(labelTable);

			}
		}
		{
			jPanel13 = new JPanel();
			jTabbedPane1.addTab("JProgressBar", null, jPanel13, null);
			jPanel13.setLayout(null);
			{
				jProgressBar1 = new JProgressBar();
				jPanel13.add(jProgressBar1);
				jProgressBar1.setBounds(104, 109, 356, 17);
				jProgressBar1.setString("50%");
				jProgressBar1.setValue(50);
				jProgressBar1.setStringPainted(true);
			}
			{
				jProgressBar2 = new JProgressBar();
				jPanel13.add(jProgressBar2);
				jProgressBar2.setBounds(143, 192, 11, 221);
				jProgressBar2.setOrientation(SwingConstants.VERTICAL);
				jProgressBar2.setValue(50);
				jProgressBar2.setString("50%");
			}
		}
		{
			jPanel12 = new JPanel();
			jTabbedPane1.addTab("JButton", null, jPanel12, null);
			jPanel12.setLayout(null);
			{
				jButton6 = new JButton();
				jPanel12.add(jButton6);
				jButton6.setText("JButton");
				jButton6.setBounds(35, 56, 112, 25);
			}
			{
				jButton7 = new JButton();
				jPanel12.add(jButton7);
				jButton7.setText("JButton with icon");
				jButton7.setBounds(35, 118, 220, 36);
				jButton7.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
			}
			{
				jButton8 = new JButton();
				jPanel12.add(jButton8);
				jButton8.setText("JButton with icon");
				jButton8.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
				jButton8.setBounds(35, 209, 220, 36);
				jButton8.setHorizontalAlignment(SwingConstants.LEFT);
			}
			{
				jToolBar2 = new JToolBar();
				jPanel12.add(jToolBar2);
				jToolBar2.setBounds(271, 58, 364, 33);
				{
					jButton17 = new JButton();
					jToolBar2.add(jButton17);
					jButton17.setText("JButton with icon");
					jButton17.setHorizontalAlignment(SwingConstants.LEFT);
					jButton17.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
					jButton17.setBounds(35, 209, 220, 36);
				}
				{
					jButton18 = new JButton();
					jToolBar2.add(jButton18);
					jButton18.setText("JButton");
					jButton18.setBounds(35, 56, 112, 25);
				}
				{
					jButton19 = new JButton();
					jToolBar2.add(jButton19);
					jButton19.setText("JButton with icon");
					jButton19.setHorizontalAlignment(SwingConstants.LEFT);
					jButton19.setIcon(new ImageIcon(this.getClass().getResource("white/images/JOptionPane/error.png")));
					jButton19.setBounds(35, 209, 220, 36);
				}
			}
		}
		{
			jPanel11 = new JPanel();
			jTabbedPane1.addTab("JOptionPane", null, jPanel11, null);
			jPanel11.setLayout(null);
			{
				jButton4 = new JButton();
				jPanel11.add(jButton4);
				jButton4.setText("Show Question Message");
				jButton4.setBounds(115, 236, 281, 37);
				jButton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}
				});
			}
			{
				jButton3 = new JButton();
				jPanel11.add(jButton3);
				jButton3.setText("Show Error Message");
				jButton3.setBounds(115, 69, 281, 37);
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton3ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				jPanel11.add(jButton2);
				jButton2.setText("Show Information Message");
				jButton2.setBounds(115, 180, 281, 37);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jButton5 = new JButton();
				jPanel11.add(jButton5);
				jButton5.setText("Show Warning Message");
				jButton5.setBounds(115, 124, 281, 37);
				jButton5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton5ActionPerformed(evt);
					}
				});
			}
		}
		{
			jPanel8 = new JPanel();
			jTabbedPane1.addTab("JSplitPane", null, jPanel8, null);
			jPanel8.setLayout(null);
			{
				jSplitPane1 = new JSplitPane();
				jPanel8.add(jSplitPane1);
				jSplitPane1.setBounds(56, 29, 426, 77);
				{
					jTree1 = new JTree();
					jSplitPane1.add(jTree1, JSplitPane.LEFT);
				}
				{
					TableModel jTable2Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
					jTable2 = new JTable();
					jSplitPane1.add(jTable2, JSplitPane.RIGHT);
					jTable2.setModel(jTable2Model);
				}
			}
			{
				jSplitPane2 = new JSplitPane();
				jPanel8.add(jSplitPane2);
				jSplitPane2.setBounds(56, 165, 426, 172);
				jSplitPane2.setOrientation(JSplitPane.VERTICAL_SPLIT);
				jSplitPane2.setDividerLocation(50);
				{
					TableModel jTable3Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" } }, new String[] { "Column 1", "Column 2" });
					jTable3 = new JTable();
					jSplitPane2.add(jTable3, JSplitPane.TOP);
					jTable3.setModel(jTable3Model);
				}
				{
					jTabbedPane3 = new JTabbedPane();
					jSplitPane2.add(jTabbedPane3, JSplitPane.BOTTOM);
					{
						jPanel9 = new JPanel();
						jTabbedPane3.addTab("jPanel9", null, jPanel9, null);
					}
					{
						jPanel10 = new JPanel();
						jTabbedPane3.addTab("jPanel10", null, jPanel10, null);
					}
				}
			}
		}
		{
			jPanel7 = new JPanel();
			jTabbedPane1.addTab("JFrame", null, jPanel7, null);
			jPanel7.setLayout(null);
			{
				jButton1 = new JButton();
				jPanel7.add(jButton1);
				jButton1.setText("Sow JFrame");
				jButton1.setBounds(250, 144, 123, 27);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
		}
		{
			jPanel3 = new JPanel();
			jTabbedPane1.addTab("JTabbedPane", null, jPanel3, null);
			jPanel3.setLayout(null);
			{
				jTabbedPane2 = new JTabbedPane();
				jPanel3.add(jTabbedPane2);
				jTabbedPane2.setBounds(74, 74, 429, 176);
				{
					jPanel4 = new JPanel();
					jTabbedPane2.addTab("jPanel4", null, jPanel4, null);
				}
				{
					jPanel5 = new JPanel();
					jTabbedPane2.addTab("jPanel5", null, jPanel5, null);
				}
				{
					jPanel6 = new JPanel();
					jTabbedPane2.addTab("jPanel6", null, jPanel6, null);
				}
			}
		}
		{
			jPanel2 = new JPanel();
			jTabbedPane1.addTab("JTable", null, jPanel2, null);
			jPanel2.setLayout(null);
			{
				jScrollPane1 = new JScrollPane();
				jPanel2.add(jScrollPane1);
				jScrollPane1.setBounds(130, 176, 292, 151);
				{
					TableModel jTable1Model = new DefaultTableModel(new String[][] { { "One", "Two" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" },
							{ "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" }, { "Three", "Four" } }, new String[] {
							"Column 1", "Column 2" });
					jTable1 = new JTable();
					jScrollPane1.setViewportView(jTable1);
					jTable1.setModel(jTable1Model);
					jTable1.setBounds(128, 83, 292, 151);
				}
			}
		}
		{
			jPanel1 = new JPanel();
			jTabbedPane1.addTab("JList", null, jPanel1, null);
			{
				ListModel jList1Model = new DefaultComboBoxModel(new String[] { "Item One", "Item Two" });
				jList1 = new JList();
				jPanel1.add(jList1);
				jList1.setModel(jList1Model);
				jList1.setBounds(168, 53, 82, 91);
			}
		}
		{
			JPanel2 = new JPanel();
			jTabbedPane1.addTab("JLabel", null, JPanel2, null);
			{
				JLabel5 = new JLabel();
				JPanel2.add(JLabel5);
				JLabel5.setText("JLabel 1");
			}
			{
				JLabel6 = new JLabel();
				JPanel2.add(JLabel6);
				JLabel6.setText("JLabel 2");
				JLabel6.setBackground(new java.awt.Color(0, 128, 255));
				JLabel6.setOpaque(true);
			}
		}
		{
			pJComboBoxPanel = new JPanel();
			jTabbedPane1.addTab("JComboBox", null, pJComboBoxPanel, null);
			BorderLayout pJComboBoxPanelLayout = new BorderLayout();
			pJComboBoxPanel.setLayout(pJComboBoxPanelLayout);
			{
				JPanel1 = new JPanel();
				pJComboBoxPanel.add(JPanel1, BorderLayout.NORTH);
				{
					ComboBoxModel jComboBox3Model = new DefaultComboBoxModel(new String[] { "Item One", "Item Two" });
					jComboBox3 = new JComboBox();
					JPanel1.add(jComboBox3);
					jComboBox3.setModel(jComboBox3Model);
					jComboBox3.setEditable(true);
					jComboBox3.setEditor(new ComboBoxEditorExample(new HashMap()));
				}
				{
					ComboBoxModel JComboBox1Model = new DefaultComboBoxModel(new String[] { "Item One12345678", "Item Two" });
					JComboBox1 = new JComboBox();
					JPanel1.add(JComboBox1);
					JComboBox1.setModel(JComboBox1Model);
				}
				{
					ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(new String[] { "Item One12345678", "Item Two" });
					jComboBox1 = new JComboBox();
					JPanel1.add(jComboBox1);
					jComboBox1.setModel(jComboBox1Model);
				}
			}
		}
		{
			pPFileChooserDialogPanel = new JPanel();
			jTabbedPane1.addTab("JFileChooserDialog", null, pPFileChooserDialogPanel, null);
			pPFileChooserDialogPanel.setLayout(null);
			{
				pOpenPFileChooserDialogButton = new JButton();
				pPFileChooserDialogPanel.add(pOpenPFileChooserDialogButton);
				pOpenPFileChooserDialogButton.setBounds(99, 35, 150, 2);
				pOpenPFileChooserDialogButton.setText("PFileChooserDialog");
				pOpenPFileChooserDialogButton.setPreferredSize(new java.awt.Dimension(126, 24));
				pOpenPFileChooserDialogButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						pOpenPFileChooserDialogButtonActionPerformed(evt);
					}
				});
			}
		}
		JScrollPane5.getViewport().add(JTextArea2);
		jTabbedPane1.add(JScrollBarPanel, "JScrollBar");
		JScrollBarPanel.add(JScrollBar3);
		JScrollBar3.setBounds(192, 281, 302, 25);
		jTabbedPane1.add(JToolBarPanel, "JToolBar");
		BorderLayout JToolBarPanelLayout = new BorderLayout();
		JToolBarPanel.setLayout(JToolBarPanelLayout);
		JToolBarPanel.setPreferredSize(new java.awt.Dimension(658, 495));
		jTabbedPane1.addTab("JFileChooser", null, pFileChooserPanel, null);
		{
			JRadioButton1 = new JRadioButton();
			JToolBar2.add(JRadioButton1);
			JRadioButton1.setText("JRadioButton1");
			JRadioButton1.setBounds(-15, 4, 100, 22);
		}
		JToolBar2.add(JToggleButton1);
		JToolBar2.add(JButton3);
		{
			JCheckBox1 = new JCheckBox();
			JToolBar2.add(JCheckBox1);
			JCheckBox1.setText("JCheckBox1");
		}
		{
			ComboBoxModel JComboBox2Model = new DefaultComboBoxModel(new String[] { "Item One", "Item Two" });
			JComboBox2 = new JComboBox();
			JToolBar2.add(JComboBox2);
			JComboBox2.setModel(JComboBox2Model);
		}
		{
			SpinnerListModel jSpinner1Model = new SpinnerListModel(new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" });
			jSpinner1 = new JSpinner();
			JToolBar2.add(jSpinner1);
			jSpinner1.setModel(jSpinner1Model);
		}
		JToolBar2.setBounds(5, 52, 667, 35);
		{
			jPanel15 = new JPanel();
			FlowLayout jPanel15Layout = new FlowLayout();
			jPanel15Layout.setAlignment(FlowLayout.LEFT);
			jPanel15Layout.setHgap(1);
			jPanel15Layout.setAlignOnBaseline(true);
			jPanel15Layout.setVgap(1);
			jPanel15.setLayout(jPanel15Layout);
			JToolBarPanel.add(jPanel15, BorderLayout.CENTER);
			jPanel15.add(JToolBar2);
			{
				jToolBar1 = new JToolBar();
				jPanel15.add(jToolBar1);
				{
					jButton9 = new JButton();
					jToolBar1.add(jButton9);
					jButton9.setText("jButton9");
					jButton9.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/petersoft/white/images/PCheckBox/pcheckbox_beanicon32.png")));
				}
				{
					jToggleButton5 = new JToggleButton();
					jToolBar1.add(jToggleButton5);
					jToggleButton5.setText("jToggleButton5");
				}
				{
					jRadioButton1 = new JRadioButton();
					jToolBar1.add(jRadioButton1);
					jRadioButton1.setText("jRadioButton1");
				}
			}
		}
		pIntroductionPanel.add(JScrollPane1, java.awt.BorderLayout.CENTER);
		JScrollPane1.getViewport().add(pIntroductionTextArea);
		jTabbedPane1.add(pAboutPanel, "About");
		pAboutPanel.add(pVersionLabel, java.awt.BorderLayout.CENTER);
		JTextAreaPanel.add(JTextArea1);
		JTextArea1.setBounds(71, 38, 289, 125);
		JTextArea1.setBounds(86, 73, 158, 89);
		JTextAreaPanel.add(JTextField1);
		JTextField1.setBounds(71, 201, 288, 28);
		JTextField1.setBounds(93, 208, 229, 23);
		{
			jTextPane1 = new JTextPane();
			JTextAreaPanel.add(jTextPane1);
			jTextPane1.setText("jTextPane1");
			jTextPane1.setBounds(275, 60, 268, 115);
		}
		{
			jEditorPane1 = new JEditorPane();
			JTextAreaPanel.add(jEditorPane1);
			jEditorPane1.setText("jEditorPane1");
			jEditorPane1.setBounds(339, 199, 199, 172);
		}
		{
			jTextField1 = new JTextField();
			JTextAreaPanel.add(jTextField1);
			jTextField1.setText("jTextField1");
			jTextField1.setBounds(93, 242, 229, 21);
		}
		{
			jTextField2 = new JTextField();
			JTextAreaPanel.add(jTextField2);
			jTextField2.setText("jTextField2");
			jTextField2.setBounds(93, 276, 229, 21);
		}
		JScrollPanel.add(JScrollPane5, java.awt.BorderLayout.CENTER);
		JScrollPanel.add(JLabel1, java.awt.BorderLayout.NORTH);
		JScrollBarPanel.add(JLabel2);
		JLabel2.setBounds(31, 128, 149, 24);
		JScrollBarPanel.add(JLabel3);
		JLabel3.setBounds(31, 278, 149, 28);
		JScrollBarPanel.add(JScrollBar2);
		JScrollBar2.setBounds(192, 12, 28, 265);
		// pFileChooserPanel.add(pFileChooser1, new XYConstraints(37, 17, 488,
		// 333));
		{
			jFileChooser1 = new JFileChooser();
			pFileChooserPanel.add(jFileChooser1);
			jFileChooser1.setPreferredSize(new java.awt.Dimension(500, 326));
		}
		pVersionLabel.setFont(new java.awt.Font("Dialog", Font.PLAIN, 48));
		pVersionLabel.setText("version : " + Globals.version);
		pack();
		this.setSize(700, 500);
	}

	// Overridden so we can exit when window is closed
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}

	public void JToggleButton1_actionPerformed(ActionEvent e) {
		System.out.println();
	}

	public void JScrollBar2_adjustmentValueChanged(AdjustmentEvent e) {
		JLabel2.setText("Horizontal Scrollbar : " + String.valueOf(JScrollBar2.getValue()) + ":" + String.valueOf(JScrollBar2.getMaximum()));
	}

	public void JScrollBar3_adjustmentValueChanged(AdjustmentEvent e) {
		JLabel3.setText("Vertical Scrollbar : " + String.valueOf(JScrollBar3.getValue()));
	}

	private void pOpenPFileChooserDialogButtonActionPerformed(ActionEvent evt) {
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.showOpenDialog(this);
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(600, 500));
		frame.setVisible(true);
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Message", JOptionPane.INFORMATION_MESSAGE);
	}

	private void jButton3ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Inane error", JOptionPane.ERROR_MESSAGE);
	}

	private void jButton4ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Message", JOptionPane.QUESTION_MESSAGE);
	}

	private void jButton5ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Message", JOptionPane.WARNING_MESSAGE);
	}

	private void jButton10ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Message", JOptionPane.INFORMATION_MESSAGE);
	}

	private void jButton11ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Inane warning", JOptionPane.WARNING_MESSAGE);
	}

	private void jButton12ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "Inane error", JOptionPane.ERROR_MESSAGE);
	}

	private void jButton13ActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.", "A plain message", JOptionPane.PLAIN_MESSAGE);
	}

	private void jButton14ActionPerformed(ActionEvent evt) {
		Object[] options = { "Yes, please", "No, thanks", "No eggs, no ham!" };
		int n = JOptionPane.showOptionDialog(this, "Would you like some green eggs to go " + "with that ham?", "A Silly Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
	}

	private void jButton15ActionPerformed(ActionEvent evt) {
		Object[] possibilities = { "ham", "spam", "yam" };
		String s = (String) JOptionPane.showInputDialog(this, "Complete the sentence:\n" + "\"Green eggs and...\"", "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, possibilities, "ham");
	}

}

class JMainFrame_JScrollBar3_adjustmentAdapter implements AdjustmentListener {
	private JMainFrame adaptee;

	JMainFrame_JScrollBar3_adjustmentAdapter(JMainFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		adaptee.JScrollBar3_adjustmentValueChanged(e);
	}
}

class JMainFrame_JScrollBar2_adjustmentAdapter implements AdjustmentListener {
	private JMainFrame adaptee;

	JMainFrame_JScrollBar2_adjustmentAdapter(JMainFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		adaptee.JScrollBar2_adjustmentValueChanged(e);
	}
}

class ComboBoxEditorExample implements ComboBoxEditor {
	Map map;

	ImagePanel panel;

	ImageIcon questionIcon;

	public ComboBoxEditorExample(Map m) {
		map = m;
		panel = new ImagePanel();
		questionIcon = new ImageIcon("question.gif");
	}

	public void setItem(Object anObject) {
		if (anObject != null) {
			panel.setText(anObject.toString());
			// BookEntry entry = (BookEntry) map.get(anObject.toString());
			// if (entry != null)
			// panel.setIcon(entry.getImage());
			// else
			// panel.setIcon(questionIcon);
		}
	}

	public Component getEditorComponent() {
		return panel;
	}

	public Object getItem() {
		return panel.getText();
	}

	public void selectAll() {
		panel.selectAll();
	}

	public void addActionListener(ActionListener l) {
		panel.addActionListener(l);
	}

	public void removeActionListener(ActionListener l) {
		panel.removeActionListener(l);
	}

	// We create our own inner class to handle setting and
	// repainting the image and the text.
	class ImagePanel extends JPanel {

		JLabel imageIconLabel;

		JTextField textField;

		public ImagePanel() {
			setLayout(new BorderLayout());

			imageIconLabel = new JLabel("hi");
			imageIconLabel.setBorder(new BevelBorder(BevelBorder.RAISED));

			textField = new JTextField("peter");
			textField.setColumns(45);
			textField.setBorder(new BevelBorder(BevelBorder.LOWERED));

			add(imageIconLabel, BorderLayout.WEST);
			add(textField, BorderLayout.EAST);
		}

		public void setText(String s) {
			textField.setText(s);
		}

		public String getText() {
			return (textField.getText());
		}

		public void setIcon(Icon i) {
			imageIconLabel.setIcon(i);
			repaint();
		}

		public void selectAll() {
			textField.selectAll();
		}

		public void addActionListener(ActionListener l) {
			textField.addActionListener(l);
		}

		public void removeActionListener(ActionListener l) {
			textField.removeActionListener(l);
		}
	}
}