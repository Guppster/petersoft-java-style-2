package com.petersoft.white;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.metal.MetalComboBoxEditor;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class ComboBoxUI extends BasicComboBoxUI {
	private int prevSelectedItem;

	public static ComponentUI createUI(final JComponent c) {
		return new ComboBoxUI();
	}

	public void installUI(JComponent c) {
		super.installUI(c);
		// addKeyboardActions((JComboBox) c);
	}

	public void uninstallUI(JComponent c) {
		super.uninstallUI(c);
	}

	public JButton createArrowButton() {
		return new ComboBox_ArrowButton(comboBox);
	}

	public ComboBoxEditor createEditor() {
		return new ComboBox_ComboBoxEditor();
	}

	protected ComboPopup createPopup() {
		ComboBox_ComboPopup pComboBox_ComboPopup = new ComboBox_ComboPopup(comboBox) {
			protected JScrollPane createScroller() {
				return new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			}
		};

		return pComboBox_ComboPopup;
	}

	// public ListCellRenderer createRenderer() {
	// return new ComboBox_Renderer();
	// }

	public void paint(Graphics g, JComponent c) {
		super.paint(g, c);
	}

	public void paintCurrentValue(Graphics g, Rectangle bounds, boolean hasFocus) {
		// This is really only called if we're using ocean.
		bounds.x += 2;
		bounds.width -= 3;
		if (arrowButton != null) {
			Insets buttonInsets = arrowButton.getInsets();
			bounds.y += buttonInsets.top;
			bounds.height -= (buttonInsets.top + buttonInsets.bottom);
		} else {
			bounds.y += 2;
			bounds.height -= 4;
		}
		super.paintCurrentValue(g, bounds, hasFocus);
	}

	public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
		// This is really only called if we're using ocean.
		g.setColor(MetalLookAndFeel.getControlDarkShadow());
		g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height - 1);
		g.setColor(MetalLookAndFeel.getControlShadow());
		g.drawRect(bounds.x + 1, bounds.y + 1, bounds.width - 2, bounds.height - 3);
		if (hasFocus && !isPopupVisible(comboBox) && arrowButton != null) {
			g.setColor(listBox.getSelectionBackground());
			Insets buttonInsets = arrowButton.getInsets();
			if (buttonInsets.top > 2) {
				g.fillRect(bounds.x + 2, bounds.y + 2, bounds.width - 3, buttonInsets.top - 2);
			}
			if (buttonInsets.bottom > 2) {
				g.fillRect(bounds.x + 2, bounds.y + bounds.height - buttonInsets.bottom, bounds.width - 3, buttonInsets.bottom - 2);
			}
		}
	}

	// public void setArrowButtonOpaque(boolean isOpaque) {
	// arrowButton.setOpaque(false);
	// }

	// public Dimension getMinimumSize(JComponent c) {
	// // if (!isMinimumSizeDirty) {
	// // return new Dimension(cachedMinimumSize);
	// // }
	// // }
	// //
	// Dimension size = null;
	//
	// if (!comboBox.isEditable() && arrowButton != null && arrowButton
	// instanceof ComboBox_ArrowButton) {
	//
	// ComboBox_ArrowButton button = (ComboBox_ArrowButton) arrowButton;
	// Insets buttonInsets = button.getInsets();
	// Insets insets = comboBox.getInsets();
	//
	// size = getDisplaySize();
	// size.width += insets.left + insets.right;
	// size.width += buttonInsets.left + buttonInsets.right +
	// button.getComboIcon().getIconWidth();
	// // size.height += insets.top + insets.bottom;
	// // size.height += buttonInsets.top + buttonInsets.bottom;
	// } else if (comboBox.isEditable() && arrowButton != null && editor !=
	// null) {
	// size = super.getMinimumSize(c);
	// Insets margin = arrowButton.getMargin();
	// size.height += margin.top + margin.bottom;
	// size.width += margin.left + margin.right;
	// } else {
	// size = super.getMinimumSize(c);
	// }
	//
	// cachedMinimumSize.setSize(size.width, size.height);
	// isMinimumSizeDirty = false;
	// return new Dimension(cachedMinimumSize);
	// }

	public Dimension getMinimumSize(JComponent c) {
		if (!isMinimumSizeDirty) {
			return new Dimension(cachedMinimumSize);
		}

		Dimension size = null;

		if (!comboBox.isEditable() && arrowButton != null) {
			Insets buttonInsets = arrowButton.getInsets();
			Insets insets = comboBox.getInsets();

			size = getDisplaySize();
			size.width += insets.left + insets.right;
			size.width += buttonInsets.right;
			size.width += arrowButton.getMinimumSize().width;
			size.height += insets.top + insets.bottom;
			size.height += buttonInsets.top + buttonInsets.bottom;
		} else if (comboBox.isEditable() && arrowButton != null && editor != null) {
			size = super.getMinimumSize(c);
			Insets margin = arrowButton.getMargin();
			size.height += margin.top + margin.bottom;
			size.width += margin.left + margin.right;
		} else {
			size = super.getMinimumSize(c);
		}

		cachedMinimumSize.setSize(size.width, size.height);
		isMinimumSizeDirty = false;

		return new Dimension(cachedMinimumSize);
	}

}
