package Exercise5_2;

public class ConsBooks implements  IBooks {
	private Book first;
	private IBooks rest;
	/**
	 * This is constructor of ConsBooks
	 * Example
	 * Book b1 = new Book(10, "Doramon", 3, new Date(1, 1, 2001));
		IBooks empty = new MTBooks();
		ConsBooks c1 = new ConsBooks(b1, empty);

	 * @param first: luc dau
	 * @param rest: luc sau
	 */
	public ConsBooks(Book first, IBooks rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Translate this into object
	 * Book b1 = new Book(10, "Doramon", 3, new Date(1, 1, 2001));
		IBooks empty = new MTBooks();
		ConsBooks c1 = new ConsBooks(b1, empty);
        ID:10.0	Name:Doramon	Number of reading:3	Date:1/1/2001
	 */
	@Override
	public String toString() {
	
		return this.first.toString() + "\n" + this.rest.toString();
	}

}
