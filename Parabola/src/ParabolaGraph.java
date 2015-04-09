import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.*;

public class ParabolaGraph extends JPanel 
{
	public void paint(Graphics g) 
	{
		Polygon p = new Polygon();

		double scaleFactor = 0.1;
		for (int x=-100; x<=100; x++) 
		{
			p.addPoint(x+200, 200- (int)(scaleFactor *x *x));
		}
		g.drawPolygon(p);
		g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
		g.drawLine(100, 200, 300, 200);
		g.drawLine(200, 0, 200, 300);
		g.drawString("Graph of x^2", 100, 100);
		g.drawString("x", 310, 200);
		g.drawString("y", 210, 10);
	}

	public static void main(String[] args)
	{

		JFrame frame = new JFrame();
		frame.add(new ParabolaGraph());
		frame.setVisible(true);
		frame.pack();
	}
}