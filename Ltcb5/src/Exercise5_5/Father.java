package Exercise5_5;

public class Father implements IAncestorTree {
	private String name;
	private String birthYear;
	/**
	 * This is constructor of Father
	 * Example
	 * Father f1 = new Father("???", "");
	 * @param name: ten
	 * @param birthYear: nam sinh
	 */
	public Father(String name, String birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	/**
	 * Translate this into object
	 * Father f1 = new Father("???", "");
	 * Name:???,YearOfBirth:
	 */
	@Override
	public String toString() {
		
		return "Name:" + this.name + ",YearOfBirth:" + this.birthYear;
	}

}
