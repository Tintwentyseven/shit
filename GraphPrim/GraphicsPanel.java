package GraphPrim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * ----------------- @author Đồ án lý thuyết đồ thị Nhóm 5 -----------------
 */
public class GraphicsPanel extends JPanel {

	private Color background = Color.lightGray;
	private Point centerPoint;
	private int R;
	private int numberPoint;
	private ArrayList<MyPoint> listPoint = new ArrayList<MyPoint>();
	private ArrayList<MyLine> listLine = new ArrayList<MyLine>();

	public GraphicsPanel() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(background);
		drawGraph(g);
	}

	public void start(int width, int height) {
		listPoint.clear();
		listLine.clear();
		// centerPoint = new Point(width / 2, height / 2);
		centerPoint = new Point(getWidth() / 2, getHeight() / 2);
		R = (centerPoint.x > centerPoint.y) ? centerPoint.y : centerPoint.x;
		R = R * 4 / 5;
		System.out.println(width + " - " + height);

		createGraph();
		repaint();
	}

	private void createGraph() {
		for (int i = 0; i < numberPoint; i++) {
			double phi = -90 + 360.0 * i / numberPoint;
			System.out.println(phi);
			phi = phi * Math.PI / 180;
			System.out.println("phi = " + phi + "  " + Math.cos(phi) + "  "
					+ Math.sin(phi));
			int x = centerPoint.x + (int) (R * Math.cos(phi));
			int y = centerPoint.y + (int) (R * Math.sin(phi));
			System.out.println(x + " + " + y);

			listPoint.add(new MyPoint(x, y, listPoint.size() + 1));
		}
	}

	private void drawGraph(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		for (int i = 0; i < listLine.size(); i++) {
			listLine.get(i).draw(g2);
			
		}
		for (int i = 0; i < listPoint.size(); i++) {
			listPoint.get(i).draw(g2);
		}

	}
	
	//ve mui ten
	
	
	//--------------------------------------------------------------------
	//them canh vao listLine
	public void addLine(int indexBeginPoint, int indexEndPoint,int w) {
		listLine.add(new MyLine(listPoint.get(indexBeginPoint).getCenter(),//lay ra point(x,y) cua dinh indexBeginPoint
				listPoint.get(indexEndPoint).getCenter(), indexBeginPoint,//lay ra point(x,y) cua dinh indexEndPoint
				indexEndPoint,w));
		repaint();
	}

	public int getNumberPoint() {
		return numberPoint;
	}

	public void setNumberPoint(int numberPoint) {
		this.numberPoint = numberPoint;
	}

	public ArrayList<MyPoint> getListPoint() {
		return listPoint;
	}

	public void setListPoint(ArrayList<MyPoint> listPoint) {
		this.listPoint = listPoint;
	}

	public ArrayList<MyLine> getListLine() {
		return listLine;
	}

	public void setListLine(ArrayList<MyLine> listLine) {
		this.listLine = listLine;
	}

}
