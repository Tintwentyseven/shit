package Example2;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testConstructor() {
		Entry e1 = new Entry(new Date(1, 1, 2001), 5, 25, "good");
		Entry e2 = new Entry(new Date(1, 2, 2002), 3, 24, "excited");
		Entry e3 = new Entry(new Date(1, 3, 2003), 27, 155, "great");
		ILog empty = new MTLog();
		ILog i1 = new ConsLog(e3, empty);
		ILog i2 = new ConsLog(e2, i1);
		ILog i3 = new ConsLog(e1, i2);
		System.out.println(i3);
		
		ILog all = new ConsLog(e1, new ConsLog(e2, new ConsLog(e3, new MTLog())));
		assertEquals(i3, all);
	}


	}


