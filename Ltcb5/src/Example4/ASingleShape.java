package Example4;

public abstract class ASingleShape implements IShape {
	protected CartPt location;

	/**
	 * This is constructor of ASingleShape
	 *
	 */
	public ASingleShape(CartPt location) {
		super();
		this.location = location;
	}
	@Override
	public String toString() {
		
		return "Location:" + this.location.toString();
	}

}
