package Exercise5_5;

public class ConsAncestorTree implements IAncestorTree {
	private Person person;
	private IAncestorTree father;
	private IAncestorTree mother;
	/**
	 * This is constructor of ConsIAncestorTree
	 * Example
	 * Person p1 = new Person("Angela", 1936);
		IAncestorTree f1 = new Father("???", "");
		IAncestorTree m1 = new Mother("???", "");
		ConsIAncestorTree c1 = new ConsIAncestorTree(p1, f1, m1);
	 * @param person: ca nhan
	 * @param father: cha
	 * @param mother: me
	 */
	public ConsAncestorTree(Person person, IAncestorTree father, IAncestorTree mother) {
		super();
		this.person = person;
		this.father = father;
		this.mother = mother;
	}
	/**
	 * Translate this into object
	 * Person p1 = new Person("Angela", 1936);
		IAncestorTree f1 = new Father("???", "");
		IAncestorTree m1 = new Mother("???", "");
		ConsIAncestorTree c1 = new ConsIAncestorTree(p1, f1, m1);
		Name:Angela,YearOfBirth:1936
        {Father:Name:???,YearOfBirth:	Mother:Name:???,YearOfBirth:}
	 */
	@Override
	public String toString() {
		
		return "\n" +this.person.toString() + "\n" + "{" + "Father:" + this.father.toString() + "\tMother:" + this.mother.toString() + "}";
	}
	

}
