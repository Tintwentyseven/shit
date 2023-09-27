package Example4;

import junit.framework.TestCase;

public class SquareTest extends TestCase {
	public void testConstructor() {
		 Square s1 = new Square(new CartPt(4,5), 8);
		 System.out.print(s1);
	}

}
