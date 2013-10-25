package l4.ncc.ddoocp.t4;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class T4Task9 {

	int graphicX = 800;
	int graphicY = 800;
	public static void main(String[] args) {
		T4Task9 t4T9 = new T4Task9();
		t4T9.go();
	}
	
	public void go() {
		GUIPlot gp = new GUIPlot();
	}
	
	class GUIPlot extends JFrame {
		private int insetWidth;
		private int insetHeight;
		private Dimension size;
		private Insets myInsets;
		private int frameWidth;
		private int frameHeight;
		
		public GUIPlot() {
			this.setSize(graphicX, graphicY);
			this.getContentPane().setBackground(Color.WHITE);
			this.setTitle("y = x^3 for x = -3 (0.01) +3");
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
		public PaintSurface() {
			//
		}
		
		private double x;
		private double y;
		private double incrementX;
		private double rangeX;
		private double rangeY;
		private double scaleX;
		private double scaleY;
		private Shape dot;
		private Point2D.Double point;
		private double plotX;
		private double plotY;
		
		public void paint(Graphics g) {
			Graphics2D g2D = (Graphics2D) g;
			g2D.setColor(Color.BLACK);
			g2D.setStroke(new BasicStroke(2));
			g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2D.translate(graphicX/2, graphicY/2);
			incrementX = 0.01;
			rangeX = 7;
			rangeY = 55;
			scaleX = graphicX/rangeX;
			scaleY = graphicY/rangeY;
			for(x=-3.0; x <=+3.0; x=x+incrementX) {
				y = Math.pow(x, 3);
				plotX = x*scaleX;
				plotY = -y*scaleY;
				dot = new Ellipse2D.Double(plotX, plotY, 4, 4);
				g2D.fill(dot);
			}
			//g2D.drawLine(-3, 4, 3, 4);
		}
	}
}