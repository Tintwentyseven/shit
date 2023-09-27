package Exercise5_2;

import junit.framework.TestCase;

public class IBooksTest extends TestCase {
	public void testConstructor() {
	Book b1 = new Book(10, "Doramon", 3, new Date(1, 1, 2001));
	Book b2 = new Book(20.5, "Harry Potter", 2, new Date(2, 2, 2002));
	IBooks empty = new MTBooks();
	IBooks i1 = new ConsBooks(b2, empty);
	IBooks i2 = new ConsBooks(b1, i1);
	System.out.print(i2);
	

}
}
