package Example2;

import junit.framework.TestCase;

public class ConsLogTest extends TestCase {
	public void testConstructor() {
		Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
		 ILog empty = new MTLog();
		 ConsLog c1 = new ConsLog(e1, empty);
		 System.out.print(c1);
	}

}
