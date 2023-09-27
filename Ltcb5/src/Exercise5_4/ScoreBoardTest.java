package Exercise5_4;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	public void testConstructor() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		IGrades empty = new MTGrades();
		IGrades i1 = new ConsGrades(g4, empty);
		IGrades i2 = new ConsGrades(g3, i1);
		IGrades i3 = new ConsGrades(g2, i2);
		IGrades i4 = new ConsGrades(g1, i3);
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", 2009, i4);
		System.out.print(s1);
		System.out.print(i4);
	}

}
