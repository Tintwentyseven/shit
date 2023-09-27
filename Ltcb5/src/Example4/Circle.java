package Example4;

public class Circle extends ASingleShape {
	private int radius;

	/**
	 * This is constructor of Circle
	 * Example
	 * Circle o1 = new Circle( new CartPt(4,3); 10);
	 * @param location: vi tri
	 * @param radius: ban kinh
	 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}
	
	}


