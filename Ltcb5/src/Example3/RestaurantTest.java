package Example3;

import junit.framework.TestCase;

public class RestaurantTest extends TestCase {
	public void testConstructor() {
		Restaurant r1 = new Restaurant("Shang hai", "beef", "cheap",  new Intersection(5, 50));
		System.out.print(r1);
	}

}
