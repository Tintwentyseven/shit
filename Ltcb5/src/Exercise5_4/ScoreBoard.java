package Exercise5_4;

public class ScoreBoard {
	private String name;
	private double yearclass;
	private IGrades grades;
	/**
	 * This is constructor of ScoreBoard
	 * Example
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", 2009, null);
	 * @param name: ten sinh vien
	 * @param yearclass: khoa hoc
	 * @param grades: null
	 */
	public ScoreBoard(String name, double yearclass, IGrades grades) {
		super();
		this.name = name;
		this.yearclass = yearclass;
		this.grades = grades;
	}
	/**
	 * Translate this into object
	 * 		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		IGrades empty = new MTGrades();
		IGrades i1 = new ConsGrades(g1, empty);
		IGrades i2 = new ConsGrades(g2, i1);
		IGrades i3 = new ConsGrades(g3, i2);
		IGrades i4 = new ConsGrades(g4, i3);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", 2009, i4);
	 * Name:Tran Van Hoa	Class:2009.0
	 */
	@Override
	public String toString() {
	
		return "Name:" + this.name + "\tClass:" + this.yearclass + "\n";
	}
	
	

}
