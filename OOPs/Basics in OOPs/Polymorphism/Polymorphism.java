// Main class
public class Polymorphism {
	// Main method
	public static void main(String [] args){
    
		Animal a; // Object initialization
		a = new Mouse(); // Object Declaration
		a.intro(); // Calling the Object
		a = new Cat(); // Object Declaration
		a.intro(); // Calling the Object
		a = new Dog(); // Object Declaration
		a.intro(); // Calling the Object
	}
}


// Parent Sub-Class
class Animal{
	void intro(){
		System.out.println("Hi! I am an animal");
	}
}

// Child SubClass 1
class Mouse extends Animal{
	void intro(){
		System.out.println("Hi! I am Jerry the mouse.");
	}
}

// Child SubClass 2
class Cat extends Animal{
	void intro(){
		System.out.println("Hi! I am Thomas the cat.");
	}
}

// Child SubClass 3
class Dog extends Animal{
	void intro(){
		System.out.println("Hi! I am Spike the bulldog.");
	}
}
