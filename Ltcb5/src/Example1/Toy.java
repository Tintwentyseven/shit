package Example1;

public class Toy {
	private String name;
	private double price;
	private int available;
	/**
	 * This is constructor of Toy
	 * Toy t1 = new Toy("ball", 25.00, 5);
	 * @param name: ten do choi
	 * @param price: gia ca
	 * @param available: hien co
	 */
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	/**
	 * Returns a string representation of the object
	 * Example
	 * Toy t1 = new Toy("ball", 25.00, 5);
	 * name:ball	price:25.00 	available:5
	 */
	@Override
	public String toString() {
		
		return "name:" + this.name + 
	           "\tprice:" + this.price + 
		       "\tavailable:" + this.available;
}
}
