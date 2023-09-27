package Exercise5_4;

public class ConsGrades implements IGrades {
	private GradeRecord first;
	private IGrades rest;
	/**
	 * This is constructor of ConsGrades
	 * GradeRecord r1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		IGrades empty = new MTGrades();
		ConsGrades c1 = new ConsGrades(r1, empty);
		
	 * @param first: ban dau
	 * @param rest: luc sau
	 */
	public ConsGrades(GradeRecord first, IGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Translate this into object
	 * GradeRecord r1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		IGrades empty = new MTGrades();
		ConsGrades c1 = new ConsGrades(r1, empty);
		+Course:Number:211	Title:Database Fundamentals	Credit:3
        Grade7.5
	 */
	@Override
	public String toString() {
	
		return this.first.toString() + "\n" + this.rest.toString();
	}

}
