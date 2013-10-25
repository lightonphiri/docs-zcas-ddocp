package l4.ncc.ddoocp.t4;

import java.awt.*;
import javax.swing.*;

public class T4Task2 {

	public static void main(String[] args) {
		T4Task2 t4T2 = new T4Task2();
		t4T2.go();
	}
	
	public void go() {
		GUIGraph gh = new GUIGraph();
	}
	
	class GUIGraph extends JFrame {
		
		public GUIGraph() {
			this.setSize(900, 900);
			this.setTitle("Topic 4 Task 2");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			this.add(new PaintSurface(), BorderLayout.CENTER);
		}
	}
	
	private class PaintSurface extends JComponent {
		
		public PaintSurface() {
			//
		}
		
		public void paint(Graphics g) {
			int gap = 50;
			int k;
			Graphics2D g2D = (Graphics2D)g;
			g2D.setStroke(new BasicStroke(3));
			g2D.setColor(Color.RED);
			
			for(k=0; k<800; k=k+gap) {
				g2D.drawLine(100, 100, 700, 100+k);
			}
		}
	}
}