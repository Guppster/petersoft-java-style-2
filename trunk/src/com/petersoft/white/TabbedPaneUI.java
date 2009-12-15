/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *        Liquid Look and Feel                                                   *
 *                                                                              *
 *  Author, Miroslav Lazarevic                                                  *
 *                                                                              *
 *   For licensing information and credits, please refer to the                 *
 *   comment in file com.birosoft.liquid.LiquidLookAndFeel                      *
 *                                                                              *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.petersoft.white;

import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

public class TabbedPaneUI extends BasicTabbedPaneUI {
	Image tabLeft = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_leftTab.png")).getImage();
	Image tabLeft_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_leftTab.png")).getImage();
	Image tabMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_middleTab.png")).getImage();
	Image tabRight = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_rightTab.png")).getImage();
	Image tabRight_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_rightTab.png")).getImage();
	Image tabSelectedLeft = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_leftSelectedTab.png")).getImage();
	Image tabSelectedLeft_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_leftSelectedTab.png")).getImage();
	Image tabSelectedMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_middleSelectedTab.png")).getImage();
	Image tabSelectedRight = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_rightSelectedTab.png")).getImage();
	Image tabSelectedRight_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_rightSelectedTab.png")).getImage();

	public static ComponentUI createUI(JComponent c) {
		return new TabbedPaneUI();
	}

	protected void installListeners() {
		super.installListeners();
		// tabPane.addMouseMotionListener((MouseMotionListener) mouseListener);
	}

	boolean isLeftToRight(Component c) {
		return c.getComponentOrientation().isLeftToRight();
	}

	// protected void paintTopTabBorder(int tabIndex, Graphics g, int x, int y,
	// int w, int h, int btm, int rght, boolean isSelected) {
	// System.out.println("paintTopTabBorder");
	// if (isSelected) {
	// g.drawImage(tabSelectedLeft, x, y, null);
	// g.drawImage(tabSelectedMiddle, x + 4, y, w - 8, h, null);
	// g.drawImage(tabSelectedRight, x + 4 + (w - 8), y, null);
	// } else {
	// g.drawImage(tabLeft, x, y, null);
	// g.drawImage(tabMiddle, x + 4, y, w - 8, h, null);
	// g.drawImage(tabRight, x + 4 + (w - 8), y, null);
	// }
	// }

	protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
		// super.paintTabBorder(g, tabPlacement, tabIndex, x, y, w, h,
		// isSelected);
		Insets contentBorderInsets = getContentBorderInsets(tabPlacement);

		if ((tabPane.getTabPlacement() == BOTTOM) && (contentBorderInsets.top == 5)) {
			contentBorderInsets.top = 0;
			contentBorderInsets.bottom = 5;
			tabPane.revalidate();
		} else if ((tabPane.getTabPlacement() == TOP) && (contentBorderInsets.top == 0)) {
			contentBorderInsets.top = 5;
			contentBorderInsets.bottom = 0;
			tabPane.revalidate();
		}

		if (isSelected) {
			g.drawImage(tabSelectedLeft, x, y, 4, h, null);
			g.drawImage(tabSelectedMiddle, x + 4, y, w - 8, h, null);
			g.drawImage(tabSelectedRight, x + 4 + (w - 8), y, 4, h, null);
		} else {
			g.drawImage(tabLeft, x, y, 4, h, null);
			g.drawImage(tabMiddle, x + 4, y, w - 8, h, null);
			g.drawImage(tabRight, x + 4 + (w - 8), y, 4, h, null);
		}

		// g.setColor(new Color(169, 209, 255));
		// g.drawLine(x, h - 1, x + w, h - 1);

	}

	protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
		super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);

		/*
		
		int yOffset = 0;

		if ((tabPlacement == TOP) && isSelected) {
			yOffset = 1;
		}

		if (tabPlacement == BOTTOM) {
			yOffset = isSelected ? (-2) : (-1);
		}

		g.setFont(font);

		View v = getTextViewForTab(tabIndex);

		if (v != null) {
			// html
			textRect.y += yOffset;
			v.paint(g, textRect);
		} else {
			// plain text
			int mnemIndex = tabPane.getDisplayedMnemonicIndexAt(tabIndex);

			if (tabPane.isEnabled() && tabPane.isEnabledAt(tabIndex)) {
				g.setColor(tabPane.getForegroundAt(tabIndex));
				BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent() + yOffset);
			} else { // tab disabled
				g.setColor(tabPane.getBackgroundAt(tabIndex).brighter());
				BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent());
				g.setColor(tabPane.getBackgroundAt(tabIndex).darker());
				BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x - 1, (textRect.y + metrics.getAscent()) - 1);
			}
		}
		
		*/
	}

	public void paint(Graphics g, JComponent c) {
		// g.setColor(Color.red);
		// g.fillRect(0, 0, c.getWidth(), c.getHeight());
		super.paint(g, c);
	}

	public void update(Graphics g, JComponent c) {
		paint(g, c);
	}
}
