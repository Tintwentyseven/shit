package Exercise5_2;

public class Date {
	private int day;
	private int month;
	private int year;
	/**
	 * This is constructor of Date
	 * Example
	 * Date d1 = new Date(1, 1, 2001);
	 * @param day: ngay
	 * @param month: thang
	 * @param year: nam
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * Translate this into object
	 * Date d1 = new Date(1, 1, 2001);
	 * 1/1/2001
	 */
	@Override
	public String toString() {
		
		return  this.day + "/" + this.month + "/" + this.year;
	}

}
