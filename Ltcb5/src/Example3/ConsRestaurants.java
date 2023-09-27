package Example3;

public class ConsRestaurants implements IRestaurants {
	private Restaurant first;
	private IRestaurants rest;
	/**
	 * This is constructor of ConsRestaurants
	 * Example
	 * Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
	 * IRestaurants empty = new MTRestaurants();
	 * ConsRestaurants = new ConsRestaurants(r1, empty);
	 * @param first: dau tien
	 * @param rest: nghi ngoi
	 */
	public ConsRestaurants(Restaurant first, IRestaurants rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Returns a string representation of the object
	 * Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
	 * IRestaurants empty = new MTRestaurants();
	 * ConsRestaurants c1 = new ConsRestaurants(r1, empty);
	 * name: Shang hai    food: beef    peiceRange: cheap    intersection: avenue: 5    street: 50
	 */
	@Override
	public String toString() {

		return this.first.toString() + " \n" + this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || ! (obj instanceof ConsRestaurants))
		return false;
		else {
			ConsRestaurants that = (ConsRestaurants) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	

	
}
