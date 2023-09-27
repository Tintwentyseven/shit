package Exercise5_1;


import junit.framework.TestCase;

public class IHousesTest extends TestCase {
	public void testConstructor() {
		House h1 = new House(300, 3, new Intersection(1, 10));
		House h2 = new House(400, 4, new Intersection(2, 20));
		House h3 = new House(500, 5, new Intersection(3, 30));
		IHouses empty = new MTHouses();
		IHouses i1 = new ConsHouses(h3, empty);
		IHouses i2 = new ConsHouses(h2, i1);
		IHouses i3 = new ConsHouses(h1, i2);
		System.out.print(i3);
	
		
	}

}
