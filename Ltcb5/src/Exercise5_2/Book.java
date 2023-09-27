package Exercise5_2;

public class Book {
	private double idbook;
	private String name;
	private int countreading;
	private Date date;
	/**
	 * This is constructor of Book
	 * Example
	 * Book b1 = new Book(10,"Doramon", 3, new Date(1, 1, 2001));
	 * @param idbook: so id
	 * @param name; ten
	 * @param countreading: so lan doc
	 * @param date: ngay hen
	 */
	public Book(double idbook, String name, int countreading, Date date) {
		super();
		this.idbook = idbook;
		this.name = name;
		this.countreading = countreading;
		this.date = date;
	}
	/**
	 * Translate this into object
	 * Book b1 = new Book(10,"Doramon", 3, new Date(1, 1, 2001));
	 * ID:10.0	Name:Doramon	Number of reading:3	Date:1/1/2001
	 */
	@Override
	public String toString() {
		
		return "ID:" + this.idbook + "\tName:" + this.name + "\tNumber of reading:" + this.countreading + "\tDate:" + this.date;
	}

}
