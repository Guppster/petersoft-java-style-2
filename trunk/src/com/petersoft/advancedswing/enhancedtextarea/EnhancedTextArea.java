package com.petersoft.advancedswing.enhancedtextarea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;

import com.petersoft.advancedswing.searchtextfield.JSearchTextField;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used commercially (ie, by a
 * corporation, company or business for any purpose whatever) then you should purchase a license for each developer using Jigloo. Please visit www.cloudgarden.com for details. Use
 * of Jigloo implies acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR ANY
 * CORPORATE OR COMMERCIAL PURPOSE.
 */
public class EnhancedTextArea extends JPanel implements LogFileTailerListener, DocumentListener {
	private JToolBar jToolBar1;
	private JScrollPane jScrollPane1;
	private JLabel jLabel1;
	private JComboBox jFontComboBox;
	private JLabel jSearchLabel;
	private JPanel jStatusPanel;
	private JSearchTextField jSearchTextField;
	private JLabel jStatusLabel;
	private JButton jFontBiggerButton;
	private JButton jFontSmallerButton;
	private JToggleButton jLineWrapButton;
	public JTextArea jTextArea;
	private JTextArea lines;
	private int maxRow = -1;

	/**
	 * Auto-generated main method to display this JPanel inside a new JFrame.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new EnhancedTextArea());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public EnhancedTextArea() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(725, 290));
			{
				jToolBar1 = new JToolBar();
				this.add(jToolBar1, BorderLayout.NORTH);
				{
					jLineWrapButton = new JToggleButton();
					jToolBar1.add(jLineWrapButton);
					jLineWrapButton.setText("Wrap");
					jLineWrapButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/petersoft/advancedswing/enhancedtextarea/linewrap.png")));
					jLineWrapButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jLineWrapButtonActionPerformed(evt);
						}
					});
				}
				{
					jFontBiggerButton = new JButton();
					jToolBar1.add(jFontBiggerButton);
					jFontBiggerButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/petersoft/advancedswing/enhancedtextarea/font_add.png")));
					jFontBiggerButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jFontBiggerButtonActionPerformed(evt);
						}
					});
				}
				{
					jFontSmallerButton = new JButton();
					jToolBar1.add(jFontSmallerButton);
					jFontSmallerButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("com/petersoft/advancedswing/enhancedtextarea/font_delete.png")));
					jFontSmallerButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jFontSmallerButtonActionPerformed(evt);
						}
					});
				}
				{
					jSearchTextField = new JSearchTextField();
					jToolBar1.add(jSearchTextField);
					jSearchTextField.setMaximumSize(new java.awt.Dimension(100, 22));
					jSearchTextField.setPreferredSize(new java.awt.Dimension(100, 22));
					jSearchTextField.setSize(new java.awt.Dimension(100, 22));
					jSearchTextField.addKeyListener(new KeyAdapter() {
						public void keyReleased(KeyEvent evt) {
							jSearchTextFieldKeyReleased(evt);
						}
					});

				}
				{
					jLabel1 = new JLabel();
					jToolBar1.add(jLabel1);
					jLabel1.setMaximumSize(new java.awt.Dimension(5, 10));
				}
				{
					GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
					Font[] fonts = e.getAllFonts();
					String fontNames[] = new String[fonts.length];
					int x = 0;
					for (Font f : fonts) {
						fontNames[x++] = f.getFontName();
					}
					ComboBoxModel jFontComboBoxModel = new DefaultComboBoxModel(fontNames);
					jFontComboBox = new JComboBox();
					jToolBar1.add(jFontComboBox);
					jFontComboBox.setModel(jFontComboBoxModel);
					jFontComboBox.setMaximumSize(new java.awt.Dimension(150, 22));
					jFontComboBox.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jFontComboBoxActionPerformed(evt);
						}
					});
				}
			}
			{
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1, BorderLayout.CENTER);
				{
					jTextArea = new JTextArea(10, 10000);
					jTextArea.getDocument().addDocumentListener(this);
					lines = new JTextArea(" 1 ");
					lines.setBackground(new Color(200, 230, 245));
					lines.setEditable(false);
					jScrollPane1.setRowHeaderView(lines);

					jTextArea.getDocument().addDocumentListener(new DocumentListener() {
						public String getText() {
							int caretPosition = jTextArea.getDocument().getLength();
							Element root = jTextArea.getDocument().getDefaultRootElement();
							String text = " 1 " + System.getProperty("line.separator");
							for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
								text += " " + i + " " + System.getProperty("line.separator");
							}
							return text;
						}

						@Override
						public void changedUpdate(DocumentEvent de) {
							lines.setText(getText());
						}

						@Override
						public void insertUpdate(DocumentEvent de) {
							lines.setText(getText());
						}

						@Override
						public void removeUpdate(DocumentEvent de) {
							lines.setText(getText());
						}

					});
					jScrollPane1.setViewportView(jTextArea);
				}
			}
			{
				jStatusPanel = new JPanel();
				FlowLayout jStatusPanelLayout = new FlowLayout();
				jStatusPanelLayout.setAlignment(FlowLayout.LEFT);
				jStatusPanel.setLayout(jStatusPanelLayout);
				this.add(jStatusPanel, BorderLayout.SOUTH);
				{
					jStatusLabel = new JLabel();
					jStatusPanel.add(jStatusLabel);
				}
				{
					jSearchLabel = new JLabel();
					jStatusPanel.add(jSearchLabel);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JTextArea getTextArea() {
		return jTextArea;
	}

	public void setText(String text) {
		jTextArea.setText(text);
	}

	public String getText() {
		return jTextArea.getText();
	}

	private void updateStatus() {
		jStatusLabel.setText("Line:" + jTextArea.getText().split("\n").length + ", Char:" + jTextArea.getText().length());
	}

	private void jLineWrapButtonActionPerformed(ActionEvent evt) {
		jTextArea.setLineWrap(jLineWrapButton.isSelected());
	}

	private void jFontSmallerButtonActionPerformed(ActionEvent evt) {
		Font f = jTextArea.getFont();
		Font newFont = new Font(f.getFontName(), f.getStyle(), f.getSize() - 1);
		jTextArea.setFont(newFont);
		lines.setFont(newFont);
	}

	private void jFontBiggerButtonActionPerformed(ActionEvent evt) {
		Font f = jTextArea.getFont();
		Font newFont = new Font(f.getFontName(), f.getStyle(), f.getSize() + 1);
		jTextArea.setFont(newFont);
		lines.setFont(newFont);
	}

	public void addTrailListener(File file) {
		LogFileTailer tailer = new LogFileTailer(file, 1000, false);
		tailer.addLogFileTailerListener(this);
		tailer.start();
	}

	@Override
	public void newLogFileLine(String line) {
		if (maxRow == -1) {
			jTextArea.append(line + System.getProperty("line.separator"));
		} else {
			if (jTextArea.getLineCount() > maxRow) {
				for (int x = 0; x <= jTextArea.getLineCount() - maxRow; x++) {
					try {
						jTextArea.replaceRange("", jTextArea.getLineStartOffset(0), jTextArea.getLineEndOffset(0));
					} catch (BadLocationException e) {
					}
				}
			}
			jTextArea.append(line + System.getProperty("line.separator"));
		}
		jTextArea.setCaretPosition(jTextArea.getDocument().getLength());
		updateStatus();
	}

	private void jSearchTextFieldKeyReleased(KeyEvent evt) {
		String text = jTextArea.getText().toLowerCase();
		String searchPattern = jSearchTextField.getText().toLowerCase();

		if (evt != null && evt.getKeyCode() == 10) {
			int caretPosition = jTextArea.getCaretPosition();
			boolean found = false;
			for (int j = caretPosition + 1; j < text.length() - searchPattern.length(); j += 1) {
				if (searchPattern.equals(text.substring(j, j + searchPattern.length()))) {
					jTextArea.setCaretPosition(j);
					found = true;
					break;
				}
			}
			if (!found) {
				for (int j = 0; j < caretPosition; j++) {
					if (searchPattern.equals(text.substring(j, j + searchPattern.length()))) {
						jTextArea.setCaretPosition(j);
						break;
					}
				}
			}
		}

		if (searchPattern.length() > 0) {
			Highlighter h = jTextArea.getHighlighter();
			DefaultHighlightPainter painter = new DefaultHighlightPainter(Color.YELLOW);
			DefaultHighlightPainter painter2 = new DefaultHighlightPainter(Color.RED);
			h.removeAllHighlights();

			int count = 0;
			boolean isCurrent = false;
			for (int j = 0; j < text.length(); j += 1) {
				if (j < text.length() - searchPattern.length() && searchPattern.equals(text.substring(j, j + searchPattern.length()))) {
					count++;
					try {
						if (j >= jTextArea.getCaretPosition() && isCurrent == false) {
							h.addHighlight(j, j + searchPattern.length(), painter2);
							isCurrent = true;
						} else {
							h.addHighlight(j, j + searchPattern.length(), painter);
						}
					} catch (BadLocationException ble) {
					}
				}
			}
			jSearchLabel.setText("Match:" + count);
		} else {
			jSearchLabel.setText("");
			Highlighter h = jTextArea.getHighlighter();
			h.removeAllHighlights();
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		updateStatus();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		updateStatus();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		updateStatus();
	}

	public int getMaxRow() {
		return maxRow;
	}

	public void setMaxRow(int maxRow) {
		this.maxRow = maxRow;
	}

	private void jFontComboBoxActionPerformed(ActionEvent evt) {
		jTextArea.setFont(new Font(jFontComboBox.getSelectedItem().toString(), jTextArea.getFont().getStyle(), jTextArea.getFont().getSize()));
	}

}
