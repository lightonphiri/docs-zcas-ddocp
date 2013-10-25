package l4.ncc.ddoocp.t4;

import java.awt.*;
import javax.swing.*;

public class T4Task5 {

	public static void main(String[] args) {
		T4Task5 t4T5 = new T4Task5();
		t4T5.go();
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
			this.setTitle("Topic 4 Task 5");
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
		
		public PaintSurface() {
			//
		}
		
		public void paint(Graphics g) {
			int gap = 10;
			int k;
			Graphics2D g2D = (Graphics2D)g;
			g2D.setColor(Color.GREEN);
			g2D.setStroke(new BasicStroke(3));
			for(k=0; k<220; k=k+gap) {
				g2D.drawRect(topLeftX+k, topLeftY+k, width-(2*k), height-(2*k));
			}
		}
	}
}