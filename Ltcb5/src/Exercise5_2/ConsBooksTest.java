package Exercise5_2;

import junit.framework.TestCase;

public class ConsBooksTest extends TestCase {
	public void testConstructor() {
		Book b1 = new Book(10, "Doramon", 3, new Date(1, 1, 2001));
		IBooks empty = new MTBooks();
		ConsBooks c1 = new ConsBooks(b1, empty);
		System.out.print(c1);
	}

}
