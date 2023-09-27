package Exercise5_3;

import junit.framework.TestCase;

public class ConfluenceTest extends TestCase {
	public void testConstructor() {
		Source s1 = new Source(new Location(1, 1, "s"), 120.0);
		Source s2 = new Source(new Location(1, 5, "t"), 50.0);
		Confluence c1 = new Confluence(new Location(3, 3, "b"), 60.0, s2, s1);
		
	}
}



