package Example4;

public class CartPt {
	private int x;
	private int y;
	/**
	 * This is constructor of CartPt
	 * Example
	 * CartPt c1 = new CartPt(4,3);
	 * @param x: gia tri
	 * @param y: gia tri
	 */
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * Returns a string representation of the object
	 * CartPt c1 = new CartPt(4,3);
	 * (4, 3)
	 */
	@Override
	public String toString() {
		
		return "(" + this.x + ", " + this.y + ")";
	}

}
