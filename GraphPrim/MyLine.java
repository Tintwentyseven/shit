package GraphPrim;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 * ----------------- @author Đồ án lý thuyết đồ thị Nhóm 5 -----------------
 */
public class MyLine {

	private int indexP1;
	private int indexP2;
	private int w;
	private Color color[] = { Color.white, Color.blue, Color.green };
	private Line2D.Double line;
	private int type = 0;
	private int order = 0;

	public MyLine(Point p1, Point p2, int indexP1, int indexP2, int w) {
		line = new Line2D.Double(p1, p2);
		this.indexP1 = indexP1;
		this.indexP2 = indexP2;
		this.w=w;
	}

	public void draw(Graphics2D g) {
		g.setColor(color[type]);
		g.draw(line);
		
		drawArrowLine(g,(int) line.x1, (int)line.y1,(int) line.x2,(int) line.y2, 30, 7);

			String str = w+"";//so tren canh
			g.drawString(str, (int) (Math.abs(line.x1 + line.x2) / 2),
					(int) (line.y1 + line.y2) / 2);
	}
	
	private void drawArrowLine(Graphics2D g, int x1, int y1, int x2, int y2, int d, int h) {
	    int dx = x2 - x1, dy = y2 - y1;
	    double D = Math.sqrt(dx*dx + dy*dy);
	    double xm = D - d, xn = xm, ym = h, yn = -h, x;
	    double sin = dy / D, cos = dx / D;
	 
	    x = xm*cos - ym*sin + x1;
	    ym = xm*sin + ym*cos + y1;
	    xm = x;
	 
	    x = xn*cos - yn*sin + x1;
	    yn = xn*sin + yn*cos + y1;
	    xn = x;
	 
	    int[] xpoints = {x2, (int) xm, (int) xn};
	    int[] ypoints = {y2, (int) ym, (int) yn};
	 
	    g.fillPolygon(xpoints, ypoints, 3);
	}

	public int getIndexP1() {
		return indexP1;
	}

	public void setIndexP1(int indexP1) {
		this.indexP1 = indexP1;
	}

	public int getIndexP2() {
		return indexP2;
	}

	public void setIndexP2(int indexP2) {
		this.indexP2 = indexP2;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
