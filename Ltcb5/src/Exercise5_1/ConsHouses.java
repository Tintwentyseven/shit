package Exercise5_1;

public class ConsHouses implements IHouses {
	private House first;
	private IHouses rest;
	/**
	 * This is constructor of ConsHouses
	 * Example
	 * House h1 = new House(300, 3, new Intersection(1, 10));
		IHouses empty = new MTHouses();
		ConsHouses c1 = new ConsHouses(h1, empty);
	 * @param first: ban dau
	 * @param rest: nghi ngoi
	 */
	public ConsHouses(House first, IHouses rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Translate this into object
	 *  House h1 = new House(300, 3, new Intersection(1, 10));
		IHouses empty = new MTHouses();
		ConsHouses c1 = new ConsHouses(h1, empty);
		Price:300	Floor:3	Intersection:avenue: 1	street: 10
	 */
	@Override
	public String toString() {
		
		return this.first.toString() + "\n" + this.rest.toString();
	}

}
