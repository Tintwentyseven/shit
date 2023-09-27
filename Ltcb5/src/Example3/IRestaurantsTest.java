package Example3;

import junit.framework.TestCase;

public class IRestaurantsTest extends TestCase {
	public void testConstructor() {
		Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
		Restaurant r2 = new Restaurant("Dallas", "cocktail", "medium", new Intersection(6, 60));
		Restaurant r3 = new Restaurant("London", "whisky", "expensive", new Intersection(7, 70));
		IRestaurants empty = new MTRestaurants();
		IRestaurants i1 = new ConsRestaurants(r3, empty);
		IRestaurants i2 = new ConsRestaurants(r2,i1);
		IRestaurants i3 = new ConsRestaurants(r1,i2);
		
		System.out.print(i3);
		IRestaurants all = new ConsRestaurants(r1, new ConsRestaurants(r2, new ConsRestaurants(r3, new MTRestaurants())));
		assertEquals(all, i3);
		
	}

}
