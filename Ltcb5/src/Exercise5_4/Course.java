package Exercise5_4;

public class Course {
	private int number;
	private String title;
	private int credits;
	/**
	 * This is constructor of Course
	 * Example
	 * Course c1 = new Course(211, "Database Fundamentals", 3);
	 * @param number: ma mon hoc
	 * @param title: ten mon hoc
	 * @param credits: so tin chi
	 */
	public Course(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}
	/**
	 * Translate this into object
	 * Course c1 = new Course(211, "Database Fundamentals", 3);
	 * Number:211	Title:Database Fundamentals	Credit:3
	 */
	@Override
	public String toString() {
		
		return "Number:" + this.number + "\tTitle:" + this.title + "\tCredit:" + this.credits;
	}

}
