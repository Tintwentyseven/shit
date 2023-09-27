package Example2;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	/**
	 * This is constructor of Entry
	 * Example
	 * Date d1 = new Date(1, 1, 2001);
	 * Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
	 * @param date: hen
	 * @param distance: khoang cach
	 * @param duration: quang duong
	 * @param comment: y kien
	 */
	public Entry(Date date, double distance, int duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	/**
	 * Returns a string representation of the object
	 * Date d1 = new Date(1, 1, 2001);
	 * Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
	 * date: 1/1/2001    distance: 5     duration: 25     comment: good
	 */
	@Override
	public String toString() {
		
		return "date: " + this.date.toString()
		+ "\tdistance: " + this.distance
		+ "\tduration: " + this.duration
		+ "\tcomment: " + this.comment;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry))
		return false;
		else {
			Entry that = (Entry) obj;
			return this.date.equals(that.date) &&
					this.distance == that.distance &&
					this.duration == that.duration &&
					this.comment.equals(that.comment);
	
				
	}
	
		
		
	}
	

}
