package Example1;

import junit.framework.TestCase;

public class ConsInventoryTest extends TestCase {
	public void testConstructor() {
		 Toy t1 = new Toy("ball", 25.00, 5);
		  Inventory empty = new MTInventory();
		  ConsInventory c1 = new ConsInventory(t1, empty);
		  System.out.print(c1);
	}

}
