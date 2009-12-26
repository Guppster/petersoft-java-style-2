package com.petersoft.white;

import java.awt.Color;
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
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TabbedPaneUI extends BasicTabbedPaneUI {
	// north
	Image top_tabLeft = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_leftTab.png")).getImage();
	Image top_tabMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_middleTab.png")).getImage();
	Image top_tabRight = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_rightTab.png")).getImage();
	Image top_tabRight_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_rightTab.png")).getImage();
	Image top_tabSelectedLeft = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_leftSelectedTab.png")).getImage();
	Image top_tabSelectedLeft_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_leftSelectedTab.png")).getImage();
	Image top_tabSelectedMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_middleSelectedTab.png")).getImage();
	Image top_tabSelectedRight = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_rightSelectedTab.png")).getImage();
	Image top_tabSelectedRight_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_top_rightSelectedTab.png")).getImage();
	// end north

	// left
	Image left_tabBottom = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_bottomTab.png")).getImage();
	Image left_tabBottom_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_bottomTab_repeat.png")).getImage();
	Image left_tabMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_middleTab.png")).getImage();
	Image left_tabTop = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_topTab.png")).getImage();
	Image left_tabTop_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_topTab_repeat.png")).getImage();
	Image left_tabSelectedBottom = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_bottomSelectedTab.png")).getImage();
	Image left_tabSelectedBottom_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_bottomSelectedTab_repeat.png")).getImage();
	Image left_tabSelectedMiddle = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_middleSelectedTab.png")).getImage();
	Image left_tabSelectedTop = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_topSelectedTab.png")).getImage();
	Image left_tabSelectedTop_repeat = new ImageIcon(TabbedPaneUI.class.getResource("images/PTabbedPane/ptabbedpane_left_topSelectedTab_repeat.png")).getImage();
	Color selectedBackground = new Color(188, 218, 244);

	// end left

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
			if (tabPane.getTabPlacement() == TOP) {
				g.drawImage(top_tabSelectedLeft, x, y, 4, h, null);
				g.drawImage(top_tabSelectedMiddle, x + 4, y, w - 8, h, null);
				g.drawImage(top_tabSelectedRight, x + 4 + (w - 8), y, 4, h, null);
			} else if (tabPane.getTabPlacement() == LEFT) {
				g.setColor(selectedBackground);
				g.fillRect(x + 4, y + 4, w, h - 8);
				g.drawImage(left_tabSelectedTop, x, y, null);
				g.drawImage(left_tabSelectedTop_repeat, x + 4, y, w - 4, 4, null);
				g.drawImage(left_tabSelectedMiddle, x, y + 4, 4, h - 8, null);

				g.drawImage(top_tabSelectedMiddle, x + 4, y, w - 4, h, null);

				g.drawImage(left_tabSelectedBottom, x, y + h - 4, null);
				g.drawImage(left_tabSelectedBottom_repeat, x + 4, y + h - 4, w - 4, 4, null);
			}
		} else {
			if (tabPane.getTabPlacement() == TOP) {
				g.drawImage(top_tabLeft, x, y, 4, h, null);
				g.drawImage(top_tabMiddle, x + 4, y, w - 8, h, null);
				g.drawImage(top_tabRight, x + 4 + (w - 8), y, 4, h, null);
			} else if (tabPane.getTabPlacement() == LEFT) {
				g.setColor(Color.white);
				g.fillRect(x + 4, y + 4, w, h - 8);
				g.drawImage(left_tabTop, x, y, null);
				g.drawImage(left_tabTop_repeat, x + 4, y, w - 4, 4, null);
				g.drawImage(left_tabMiddle, x, y + 4, 4, h - 8, null);

				g.drawImage(top_tabMiddle, x + 4, y, w - 4, h, null);

				g.drawImage(left_tabBottom, x, y + h - 4, null);
				g.drawImage(left_tabBottom_repeat, x + 4, y + h - 4, w - 4, 4, null);
			}
		}

		// g.setColor(new Color(169, 209, 255));
		// g.drawLine(x, h - 1, x + w, h - 1);

	}

	protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
		super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);

		/*
		 * 
		 * int yOffset = 0;
		 * 
		 * if ((tabPlacement == TOP) && isSelected) { yOffset = 1; }
		 * 
		 * if (tabPlacement == BOTTOM) { yOffset = isSelected ? (-2) : (-1); }
		 * 
		 * g.setFont(font);
		 * 
		 * View v = getTextViewForTab(tabIndex);
		 * 
		 * if (v != null) { // html textRect.y += yOffset; v.paint(g, textRect);
		 * } else { // plain text int mnemIndex =
		 * tabPane.getDisplayedMnemonicIndexAt(tabIndex);
		 * 
		 * if (tabPane.isEnabled() && tabPane.isEnabledAt(tabIndex)) {
		 * g.setColor(tabPane.getForegroundAt(tabIndex));
		 * BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex,
		 * textRect.x, textRect.y + metrics.getAscent() + yOffset); } else { //
		 * tab disabled
		 * g.setColor(tabPane.getBackgroundAt(tabIndex).brighter());
		 * BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex,
		 * textRect.x, textRect.y + metrics.getAscent());
		 * g.setColor(tabPane.getBackgroundAt(tabIndex).darker());
		 * BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex,
		 * textRect.x - 1, (textRect.y + metrics.getAscent()) - 1); } }
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
