package Exercise5_4;

import junit.framework.TestCase;

public class GradeRecordTest extends TestCase {
	public void testConstructor() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		System.out.print(g1);
	}

}
