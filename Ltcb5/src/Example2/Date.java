package Example2;

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
	 * Returns a string representation of the object
	 * Date d1 = new Date(1, 1, 2001);
	 * 1/1/2001
	 */
	@Override
	public String toString() {
		
		return this.day + "/" + this.month + "/" + this.year;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Date))
		return false;
		else {
			Date that = (Date) obj;
			return this.day == that.day &&
					this.month == that.month &&
					this.year == that.year;
		}
	}
	
	

}
