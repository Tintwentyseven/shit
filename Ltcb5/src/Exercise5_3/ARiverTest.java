package Exercise5_3;

import junit.framework.TestCase;

public class ARiverTest extends TestCase {
	public void testConstructor() {
	ARiver s = new Source(new Location(1, 1, "s"), 120.0);
	ARiver t = new Source(new Location(1, 5, "t"), 50.0);
	ARiver u = new Source(new Location(3, 7, "u"), 100.0);
	ARiver b = new Confluence(new Location(3, 3, "b"), 60.0, s, t);
	ARiver a = new Confluence(new Location(5, 5, "a"), 30.0, b, u);
	Mouth m = new Mouth(new Location(7, 5, "m"), a);

}
}

