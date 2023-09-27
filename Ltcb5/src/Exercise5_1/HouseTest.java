package Exercise5_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	public void testConstructor() {
		House h1 = new House(300, 3, new Intersection(1, 10));
		System.out.print(h1);
	}

}
