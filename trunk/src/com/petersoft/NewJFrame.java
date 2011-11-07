package com.petersoft;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JEditorPane;
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
	private JEditorPane jEditorPane1;
	private JPanel jPanel5;
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
						jPanel3.addMouseMotionListener(new MouseMotionAdapter() {
							public void mouseDragged(MouseEvent evt) {
								jPanel3MouseDragged(evt);
							}
						});
					}
					{
						jPanel1 = new JPanel();
						jTabbedPane1.addTab("jPanel1", null, jPanel1, null);
					}
				}
				{
					jTabbedPane2 = new JTabbedPane();
					new DropTarget(jTabbedPane2, new TextDropTargetListener(jTabbedPane2));
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
			{
				jPanel5 = new JPanel();
				getContentPane().add(jPanel5, BorderLayout.NORTH);
				{
					jEditorPane1 = new JEditorPane();
					jPanel5.add(jEditorPane1);
					jEditorPane1.setDragEnabled(true);
					jEditorPane1.setText("jEditorPane1");
					jEditorPane1.setPreferredSize(new java.awt.Dimension(192, 61));
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class TextDropTargetListener implements DropTargetListener {
		public TextDropTargetListener(JTabbedPane ta) {
		}

		public void dragEnter(DropTargetDragEvent event) {
			int a = event.getDropAction();
			if ((a & DnDConstants.ACTION_COPY) != 0)
				System.out.println("ACTION_COPY\n");
			if ((a & DnDConstants.ACTION_MOVE) != 0)
				System.out.println("ACTION_MOVE\n");
			if ((a & DnDConstants.ACTION_LINK) != 0)
				System.out.println("ACTION_LINK\n");

			if (!isDragAcceptable(event)) {
				event.rejectDrag();
				return;
			}
		}

		public void dragExit(DropTargetEvent event) {
		}

		public void dragOver(DropTargetDragEvent event) { // you can provide visual
			// feedback here
		}

		public void dropActionChanged(DropTargetDragEvent event) {
			if (!isDragAcceptable(event)) {
				event.rejectDrag();
				return;
			}
		}

		public void drop(DropTargetDropEvent event) {
			if (!isDropAcceptable(event)) {
				event.rejectDrop();
				return;
			}

			event.acceptDrop(DnDConstants.ACTION_COPY);

			Transferable transferable = event.getTransferable();

			DataFlavor[] flavors = transferable.getTransferDataFlavors();
			for (int i = 0; i < flavors.length; i++) {
				DataFlavor d = flavors[i];
				System.out.println("MIME type=" + d.getMimeType() + "\n");

				try {
					if (d.equals(DataFlavor.javaFileListFlavor)) {
						java.util.List fileList = (java.util.List) transferable.getTransferData(d);
						Iterator iterator = fileList.iterator();
						while (iterator.hasNext()) {
							File f = (File) iterator.next();
							System.out.println(f + "\n");
						}
					} else if (d.equals(DataFlavor.stringFlavor)) {
						String s = (String) transferable.getTransferData(d);
						System.out.println(s + "\n");
					} else if (d.isMimeTypeEqual("text/plain")) {
						String charset = d.getParameter("charset");
						InputStream in = (InputStream) transferable.getTransferData(d);

						boolean more = true;
						int ch;
						if (charset.equals("ascii")) {
							do {
								ch = in.read();
								if (ch != 0 && ch != -1)
									System.out.println("" + (char) ch);
								else
									more = false;
							} while (more);
						} else if (charset.equals("unicode")) {
							boolean littleEndian = true;
							// if no byte ordering mark, we assume
							// Windows is the culprit
							do {
								ch = in.read();
								int ch2 = in.read();
								if (ch != -1 && littleEndian)
									ch = (ch & 0xFF) | ((ch2 & 0xFF) << 8);
								if (ch == 0xFFFE)
									littleEndian = false;
								else if (ch != 0 && ch != -1)
									System.out.println("" + (char) ch);
								else
									more = false;
							} while (more);
						}

						System.out.println("\n");
					}
				} catch (Exception e) {
					System.out.println("Error: " + e + "\n");
				}
			}
			event.dropComplete(true);
		}

		public boolean isDragAcceptable(DropTargetDragEvent event) { // usually, you
			// check the
			// available
			// data flavors
			// here
			// in this program, we accept all flavors
			return (event.getDropAction() & DnDConstants.ACTION_COPY_OR_MOVE) != 0;
		}

		public boolean isDropAcceptable(DropTargetDropEvent event) { // usually, you
			// check the
			// available
			// data flavors
			// here
			// in this program, we accept all flavors
			return (event.getDropAction() & DnDConstants.ACTION_COPY_OR_MOVE) != 0;
		}
	}

	private void jPanel4MouseDragged(MouseEvent evt) {
		System.out.println("jPanel4.mouseDragged, event=" + evt);
	}

	private void jPanel4MouseMoved(MouseEvent evt) {
		System.out.println("jPanel4.mouseMoved, event=" + evt);
	}

	private void jPanel4MouseClicked(MouseEvent evt) {
		System.out.println("jPanel4.mouseClicked, event=" + evt);
	}

	private void jTabbedPane2MouseDragged(MouseEvent evt) {
		System.out.println("jTabbedPane2.mouseDragged, event=" + evt);
	}

	private void jTabbedPane1MouseReleased(MouseEvent evt) {
		System.out.println("jTabbedPane1.mouseReleased, event=" + evt);
		Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
		setCursor(normalCursor);
	}

	private void jTabbedPane1MouseDragged(MouseEvent evt) {
		Cursor normalCursor = new Cursor(Cursor.HAND_CURSOR);
		setCursor(normalCursor);
		
		System.out.println(getScreenBoundsFor(jTabbedPane2.getBounds()));
	}

	private void jTabbedPane2MousePressed(MouseEvent evt) {
		System.out.println("jTabbedPane2.mousePressed, event=" + evt);
	}

	private void jTabbedPane2MouseReleased(MouseEvent evt) {
		System.out.println("jTabbedPane2.mouseReleased, event=" + evt);
	}
	
	private void jPanel3MouseDragged(MouseEvent evt) {
		System.out.println("jPanel3.mouseDragged, event="+evt);
	}
	
	public static Rectangle getScreenBoundsFor(Rectangle rc) {
	    final GraphicsDevice[] gds = GraphicsEnvironment.getLocalGraphicsEnvironment()
	        .getScreenDevices();
	    final List<GraphicsConfiguration> configs = new ArrayList<GraphicsConfiguration>();

	    for (int i = 0; i < gds.length; i++) {
	      GraphicsConfiguration gc = gds[i].getDefaultConfiguration();
	      if (rc.intersects(gc.getBounds())) {
	        configs.add(gc);
	      }
	    }

	    GraphicsConfiguration selected = null;
	    if (configs.size() > 0) {
	      for (Iterator<GraphicsConfiguration> it = configs.iterator(); it.hasNext();) {
	        GraphicsConfiguration gcc = it.next();
	        if (selected == null)
	          selected = gcc;
	        else {
	          if (gcc.getBounds().contains(rc.x + 20, rc.y + 20)) {
	            selected = gcc;
	            break;
	          }
	        }
	      }
	    } else {
	      selected = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
	          .getDefaultConfiguration();
	    }

	    int x = selected.getBounds().x;
	    int y = selected.getBounds().y;
	    int w = selected.getBounds().width;
	    int h = selected.getBounds().height;

	    return new Rectangle(x, y, w, h);
	  }

}
