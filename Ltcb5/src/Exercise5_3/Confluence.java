package Exercise5_3;



public class Confluence extends ARiver {
	private ARiver left;
	private ARiver right;
		/**
		 * This is constructor of Confluence
		 * Confluence c1 = new Confluence(new Location(3, 3, "b"), 60.0, s, t);
	 * @param location: vi tri
	 * @param length: do dai
	 * @param left: trai 
	 * @param right: phai
	 */
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
		

}
}
