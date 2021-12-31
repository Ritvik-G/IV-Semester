// Import of required modules
import java.util.*;

// Main Class
class Zoo{
	// Main Method
	public static void main(String [] args){
		//Multiple Object declarations
		Hippo h = new Hippo();
		Giraffe g = new Giraffe();
		Scanner sc = new Scanner(System.in); // Scanner declaration [for input]
		
		// Input
		System.out.print("Enter hippo name: ");
		h.name = sc.nextLine();
		System.out.print("Enter giraffe name: ");
		g.name = sc.nextLine();
		System.out.print("Enter hippo age: ");
		h.age = sc.nextInt();
		System.out.print("Enter giraffe age: ");
		g.age = sc.nextInt();
		System.out.print("Enter Hippo weight: ");
		h.weight = sc.nextDouble();
		System.out.print("Enter Giraffe height: ");
		g.height = sc.nextDouble();
		
		// White Space
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Output
		System.out.println("Hippo name : "+h.name);
		System.out.println("Giraffe name : "+g.name);
		System.out.println("Hippo age : "+h.age);
		System.out.println("Giraffe age : "+g.age);
		System.out.println("Hippo weight : "+h.weight);
		System.out.println("Giraffe height : "+g.height);
	}
}

//Level 0 Inheritance
class Animal{
	String name;
	int age;
}

//Level 1 Inheritance
class Hippo extends Animal{
	double weight;
}

class Giraffe extends Animal{
	double height;
}
