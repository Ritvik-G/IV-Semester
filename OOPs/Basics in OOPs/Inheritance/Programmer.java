// Import of required modules
import java.util.*;

// Declaration of Programmer class that is inherited from Person
class Programmer extends Person{

	static int rank; // Additional data specific to programmer class
	
	// Main method
	public static void main(String [] args){
	
		Programmer p = new Programmer(); // Object declaration
		Scanner sc = new Scanner(System.in); // Scanner declaration [for input]
		
		// Input
		System.out.print("Enter name: ");
		p.name = sc.nextLine();
		System.out.print("Enter age: ");
		p.age = sc.nextInt();
		System.out.print("Enter rank: ");
		rank = sc.nextInt();
		
		// Output
		System.out.println("The name of the programmer is : "+p.name);
		System.out.println("The age of the programmer is : "+p.age);
		System.out.println("The rank of the programmer is : "+p.rank);
		
	}
}


// Declaration of class called Person
class Person{
	
	String name;
	int age;
	
}
