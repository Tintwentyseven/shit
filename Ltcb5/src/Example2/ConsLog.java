package Example2;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;
	/**
	 * This is constructor of ConsLog
	 * Example
	 * Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
	 * ILog empty = new MTLog();
	 * ConsLog c1 = new ConsLog(e1, empty);
	 * @param first: dau tien
	 * @param rest: nghi ngoi
	 */
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Returns a string representation of the object
	 * Entry e1 = new Entry( new Date(1, 1, 2001), 5, 25, "good");
	 * ILog empty = new MTLog();
	 * ConsLog c1 = new ConsLog(e1, empty);
	 * date: 1/1/2001    distance: 5     duration: 25     comment: good
	 */
	@Override
	public String toString() {
		
		return this.first.toString() + " \n" + this.rest.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog))
		return false;
		else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
}
	
	


