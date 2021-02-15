// (a) Write the complete Animal class.
// Your implementation must meet all specifications and conform to the behavior shown in the table.
class Animal {
	String Type;
	String Species;
	String Name;
	public Animal(String Type, String Species, String Name) {
		this.Type = Type;
		this.Species = Species;
		this.Name = Name;
	}
	public String toString() {
		return Name + " the " + Species + " is a " + Type;
	}
}

// (b) Write the complete Herbivore class.
// Your implementation must meet all specifications and conform to the behavior shown in the table.
class Herbivore extends Animal {
	public Herbivore(String Species, String Name) {
		super("herbivore", Species, Name);
	}
}

// (c) Write the complete Elephant class.
// Your implementation must meet all specifications and conform to the behavior shown in the table.
class Elephant extends Herbivore {
	double TuskLength;
	public Elephant(String Name, double TuskLength) {
		super("elephant", Name);
		this.TuskLength = TuskLength;
	}
	public String toString() {
		return super.toString() + " with tusks " + TuskLength + " meters long";
	}
}

public class FRQ2 {
	public static void main(String[] args) {
		// Test part (a)
		Animal lisa = new Animal("carnivore", "lion", "Lisa");
		System.out.println(lisa.toString());

		// Test part (b)
		Herbivore gary = new Herbivore("giraffe", "Gary");
		System.out.println(gary.toString());

		// Test part (c)
		Elephant percy = new Elephant("Percy", 2.0);
		System.out.println(percy.toString());
	}
}
