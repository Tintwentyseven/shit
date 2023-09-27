package Exercise5_2;

import junit.framework.TestCase;

public class DateTest extends TestCase {
	public void testConstructor() {
		Date d1 = new Date(1, 1, 2001);
		System.out.print(d1);
	}

}
