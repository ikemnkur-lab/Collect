
public class Person {

	public String name = "";
	public int age = 0, id;
	
	public static int id_giver = 1;
	
	public Person (String nm, int ag) {
		age = ag;
		name = nm;
		id = id_giver;
		id_giver++;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return " {Name: " + name + "Age: " + age + "}";
	}
}



