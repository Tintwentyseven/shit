package Exercise5_5;

public class Mother implements IAncestorTree {
	private String name;
	private String birthYear;
	/**
	 * This is constructor of Mother
	 * Example
	 * Mother m1 = new Mother("???", "");
	 * @param name: ten
	 * @param birthYear: nam sinh
	 */
	public Mother(String name, String birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	/**
	 * Translate this into object
	 * Mother m1 = new Mother("???", "");
	 * Name:???,YearOfBirth:
	 */
	@Override
	public String toString() {
		
		return "Name:" + this.name + ",YearOfBirth:" + this.birthYear;
	}

}
