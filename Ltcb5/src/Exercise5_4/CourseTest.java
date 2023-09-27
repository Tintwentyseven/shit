package Exercise5_4;

import junit.framework.TestCase;

public class CourseTest extends TestCase {
	public void testConstructor() {
		Course c1 = new Course(211, "Database Fundamentals", 3);
		System.out.print(c1);
	}

}
