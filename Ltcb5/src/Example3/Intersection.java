package Example3;

public class Intersection {
	private int avanue;
	private int street;
	/**
	 * This is constructor of Intersection
	 * Example
	 * Intersection i1 = new Intersection(5, 50);
	 * @param avanue: dai lo
	 * @param street: con duong
	 */
	public Intersection(int avanue, int street) {
		super();
		this.avanue = avanue;
		this.street = street;
	}
	/**
	 * Returns a string representation of the object
	 * Intersection i1 = new Intersection(5, 50);
	 * avenue: 5    street: 50
	 */
	@Override
	public String toString() {
		
		return "avenue: " + this.avanue
				+"\tstreet: " + this.street; 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Intersection))
		return false;
		else {
			Intersection that = (Intersection) obj;
			return this.avanue == that.avanue &&
					this.street == that.street;
		}
	
	
	

	


	}
}
