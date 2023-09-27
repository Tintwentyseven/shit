package GraphPrim;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 * ----------------- @author Đồ án lý thuyết đồ thị Nhóm 5 -----------------
 */
public class MyPoint {

	private final Color colorIndex = Color.black;
	private final Color color[] = { Color.white, Color.blue,Color.yellow, Color.green,
			Color.red };

	private final int r = 15;
	private Ellipse2D.Double el;
	private Point center = new Point();
	private int type = 0;
	private int indexPoint;

	public MyPoint(double x, double y, int indexPoint) {
		el = new Ellipse2D.Double(x - r, y - r, r * 2, r * 2);
		this.center.x = (int) (x);
		this.center.y = (int) (y);
		this.indexPoint = indexPoint;
		System.out.println(el.x + " * " + el.y);
	}

	
	
	public void draw(Graphics2D g) {
		g.setColor(color[type]);//set mau cho dinh
		g.fill(el);

		g.setColor(colorIndex);
		int stringLen = (int) g.getFontMetrics()
				.getStringBounds(String.valueOf(indexPoint), g).getWidth();//lay ra cheu rong cua chuoi indexPoint
														// trong hinh tron
		int stringHeight = (int) g.getFontMetrics()
				.getStringBounds(String.valueOf(indexPoint), g).getHeight();//tuong tu lay ra chieu cao
		int startX = -stringLen / 2;
		int startY = stringHeight / 2;
		g.drawString(String.valueOf(indexPoint), startX + (int) center.x,//chuoi tren canh khi duyet
				(int) center.y + startY);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
