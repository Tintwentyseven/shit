package Exercise5_1;

public class Intersection {
	private int avenue;
	private int street;
	/**
	 * This is constructor of Intersection
	 * Example
	 * Intersection i1 = new Intersection(1, 10);
	 * @param avenue: giao lo
	 * @param street: con duong
	 */
	public Intersection(int avenue, int street) {
		super();
		this.avenue = avenue;
		this.street = street;
	}
	/**
	 * Translate this into object
	 * Intersection i1 = new Intersection(1, 10);
	 * avenue: 1	street: 10
	 */
	@Override
	public String toString() {
		
		return "avenue: " + this.avenue
				+"\tstreet: " + this.street; 
	}

}
