package Exercise5_2;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testConstructor() {
	Book b1 = new Book(10,"Doramon", 3, new Date(1, 1, 2001));
	System.out.print(b1);
	


}
}
