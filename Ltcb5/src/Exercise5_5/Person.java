package Exercise5_5;

public class Person {
	private String name;
	private int birthYear;
	/**
	 * This is constructor of Person
	 * Example
	 * Person p1 = new Person("Angela", 1936);
	 * @param name: ten
	 * @param birthYear: nam sinh
	 */
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	/**
	 * Translate this into object
	 * Person p1 = new Person("Angela", 1936);
	 * Name:Angela,YearOfBirth:1936
	 */
	@Override
	public String toString() {
		
		return "Name:" + this.name + ",YearOfBirth:" + this.birthYear;
	}

}
