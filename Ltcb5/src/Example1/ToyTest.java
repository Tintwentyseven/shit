package Example1;

import junit.framework.TestCase;

public class ToyTest extends TestCase {
	public void testConstructor() {
		Toy t1 = new Toy("ball", 25.00, 5);
		System.out.print(t1);
	}

}
