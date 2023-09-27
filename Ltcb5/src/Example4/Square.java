package Example4;

public class Square extends ASingleShape {
	private int size;

	/**
	 * This is constructor of Square
	 * Square s1 = new Square(new CartPt(4,5), 8);
	 * @param location: vi tri
	 * @param size: kich thuoc
	 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}
	/**
	 * Returns a string representation of the object
	 *  Square s1 = new Square(new CartPt(4,5), 8);
	 *  Location:(4, 5)	Size: 8
	 */
	@Override
	public String toString() {
		
		return super.toString() + "\tSize: " + this.size;
	}

}
