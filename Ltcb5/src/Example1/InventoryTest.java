package Example1;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	public void testConstructor() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		
		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		
		System.out.println(i3);
	}
	

}
