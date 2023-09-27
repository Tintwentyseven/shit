package Example4;

public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;
	/**
	 * This is constructor of CompositeShape
	 * CompositeShape u1 = new CompositeShape(new Circle( new CartPt(4,3), 10),new Dot(new CartPt(1,2)));
	 * @param top: dung dau
	 * @param bottom: dung cuoi
	 */
	public CompositeShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	@Override
	public String toString() {
		
		return this.top.toString() + " \n" + this.bottom.toString();
	}



}
