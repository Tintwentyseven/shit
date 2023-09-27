package Example2;

import junit.framework.TestCase;

public class EntryTest extends TestCase {
	public void testConstructor() {
		 Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
		 System.out.print(e1);

	
	}

}
