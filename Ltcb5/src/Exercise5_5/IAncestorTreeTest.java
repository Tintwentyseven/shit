package Exercise5_5;

import junit.framework.TestCase;

public class IAncestorTreeTest extends TestCase {
	public void testConstructor() {
	Person p1 = new Person("Angela", 1936);
	Person p2 = new Person("Robert", 1935);
	Person p3 = new Person("Janet", 1958);
	Person p4 = new Person("Annie", 1938);
	Person p5 = new Person("Paul", 1956);
	Person p6 = new Person("Peter", 1980);
	Father f1 = new Father("???", "????");
	Father f2 = new Father("Angela", "1936");
	Father f3 = new Father("Janet", "1958");
	Mother m1 = new Mother("???", "????");
	Mother m2 = new Mother("Robert", "1935");
	Mother m3 = new Mother("Annie", "1938");
	Mother m4 = new Mother("Paul", "1956");
	ConsAncestorTree c1 = new ConsAncestorTree(p1, f1, m1);
	ConsAncestorTree c2 = new ConsAncestorTree(p2, f1, m1);
	ConsAncestorTree c3 = new ConsAncestorTree(p3, f2, m2);
    ConsAncestorTree c4 = new ConsAncestorTree(p4, f1, m1);
    ConsAncestorTree c5 = new ConsAncestorTree(p5, f1, m3);
    ConsAncestorTree c6 = new ConsAncestorTree(p6, f3, m4);
    System.out.print(c1);
    System.out.print(c2);
    System.out.print(c3);
    System.out.print(c4);
    System.out.print(c5);
    System.out.print(c6);





}
}
