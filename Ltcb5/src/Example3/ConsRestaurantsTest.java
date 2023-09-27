package Example3;

import junit.framework.TestCase;

public class ConsRestaurantsTest extends TestCase {
	public void testConstructor() {
		Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
		 IRestaurants empty = new MTRestaurants();
		 ConsRestaurants c1 = new ConsRestaurants(r1, empty);
		 System.out.print(c1);
	}

}
