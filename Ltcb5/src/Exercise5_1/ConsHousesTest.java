package Exercise5_1;

import junit.framework.TestCase;

public class ConsHousesTest extends TestCase {
	public void testConstructor() {
		House h1 = new House(300, 3, new Intersection(1, 10));
		IHouses empty = new MTHouses();
		ConsHouses c1 = new ConsHouses(h1, empty);
		System.out.print(c1);
	}

}
