package l4.ncc.ddoocp.t4;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class T4Task7 {

	public static void main(String[] args) {
		T4Task7 t4T7 = new T4Task7();
		t4T7.go();
	}
	
	public void go() {
		GUIRect gr = new GUIRect();
	}
	
	class GUIRect extends JFrame {
		
		private int insetWidth;
		private int insetHeight;
		private Dimension size;
		private Insets myInsets;
		private int frameWidth;
		private int frameHeight;
		
		public GUIRect() {
			this.setSize(500, 300);
			this.getContentPane().setBackground(Color.BLUE);
			this.setTitle("Topic 4 Task 6");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
			size = this.getSize();
			myInsets = this.getInsets();
			insetWidth = myInsets.left + myInsets.right;
			insetHeight = myInsets.top + myInsets.bottom;
			
			frameWidth = (int) size.getWidth() + insetWidth;
			frameHeight = (int) size.getHeight() + insetHeight;
			this.setSize(frameWidth, frameHeight);
			
			this.add(new PaintSurface(), BorderLayout.CENTER);
		}
	}
	
	private class PaintSurface extends JComponent {
		
		private int topLeftX = 10;
		private int topLeftY = 10;
		private int width = 480;
		private int height = 280;
		private Shape myShape;
		
		public PaintSurface() {
			//
		}
		
		public void paint(Graphics g) {
			Graphics2D g2D = (Graphics2D)g;
			myShape = new Ellipse2D.Double(topLeftX, topLeftY, width, height);
			g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2D.setColor(Color.GREEN);
			g2D.setStroke(new BasicStroke(10));
			g2D.draw(myShape);
			g2D.setColor(Color.YELLOW);
			g2D.fill(myShape);
		}
	}
}