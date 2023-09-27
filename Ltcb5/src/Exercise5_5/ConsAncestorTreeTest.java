package Exercise5_5;

import junit.framework.TestCase;

public class ConsAncestorTreeTest extends TestCase {
	public void testConstructor() {
		Person p1 = new Person("Angela", 1936);
		IAncestorTree f1 = new Father("???", "");
		IAncestorTree m1 = new Mother("???", "");
		ConsAncestorTree c1 = new ConsAncestorTree(p1, f1, m1);
		System.out.print(c1);
	}
	

}
