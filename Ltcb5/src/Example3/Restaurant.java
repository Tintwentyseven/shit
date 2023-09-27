package Example3;

public class Restaurant {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;
	/**
	 * This is constructor of Restaurant
	 * Example
	 * Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
	 * @param name: ten nha hang
	 * @param food: mon an
	 * @param priceRange: khoang gia
	 * @param intersection: giao nhau
	 */
	public Restaurant(String name, String food, String priceRange, Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}
	/**
	 * Returns a string representation of the object
	 * Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
	 * name: Shang hai    food: beef    peiceRange: cheap    intersection: avenue: 5    street: 50
	 */
	@Override
	public String toString() {

		return "Name: " + this.name + "\tfood:" + this.food
				+ "\trange price: " + this.priceRange
				+ "\tintersection:" + this.intersection.toString();
				
	}
	@Override
	public boolean equals(Object obj) {
		if( obj == null || ! (obj instanceof Restaurant))
		return false;
		else {
			Restaurant that = (Restaurant) obj;
			return this.name.equals(that.name) &&
					this.food.equals(that.food) &&
					this.priceRange.equals(that.priceRange) &&
					this.intersection.equals(that.intersection);
		}
	}
	
	

}
