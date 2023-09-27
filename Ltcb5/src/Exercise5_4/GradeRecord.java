package Exercise5_4;

public class GradeRecord {
	private Course course;
	private double grade;
	/**
	 * This is constructor of GradeRecord
	 * Example
	 * GradeRecord r1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		
	 * @param course: khoa hoc
	 * @param grade: diem so
	 */
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	/**
	 * Translate this into object
	 * GradeRecord r1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * +Course:Number:211	Title:Database Fundamentals	Credit:3
	 */
	
	
	@Override
	public String toString() {
		
		return  "+Course:" + this.course + "\nGrade" + this.grade;
	}

}
