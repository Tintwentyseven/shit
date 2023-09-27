package Exercise5_1;



public class House {
	private int price;
	private int floor;
	private Intersection intersection;
	/**
	 * This is constructor of House
	 * Example
	 * House h1 = new House(300, 3, new Intersection(1, 10));
	 * @param price
	 * @param floor
	 * @param intersection
	 */
	public House(int price, int floor, Intersection intersection) {
		super();
		this.price = price;
		this.floor = floor;
		this.intersection = intersection;
	}
	/**
	 * Translate this into object
	 *  House h1 = new House(300, 3, new Intersection(1, 10));
		IHouses empty = new MTHouses();
		ConsHouses c1 = new ConsHouses(h1, empty);
		Color:red	price:300	Intersection:avenue: 1	street: 10
	 */
	
	@Override
	public String toString() {
	
		return "Price:" + this.price + "\tFloor:" + this.floor + "\tIntersection:" + this.intersection;
	}
	

}
