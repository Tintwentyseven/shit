package Exercise5_4;

import junit.framework.TestCase;

public class ConsGradesTest extends TestCase {
	public void testConstructor() {
		GradeRecord r1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		IGrades empty = new MTGrades();
		ConsGrades c1 = new ConsGrades(r1, empty);
		System.out.print(c1);
	}

}
