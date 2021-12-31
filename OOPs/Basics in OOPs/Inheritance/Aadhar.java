// Import of required modules
import java.util.*;

// Main Class
class Aadhar{
	// Main method
	public static void main(String [] args){
		AadharNumber a = new AadharNumber(); // Object declaration
		Scanner sc = new Scanner(System.in); // Scanner declaration [for input]
		
		// Input
		System.out.print("Enter name : ");
		a.name = sc.nextLine();
		System.out.print("Enter age : ");
		a.age = sc.nextInt();
		System.out.print("Enter rank : ");
		a.rank = sc.nextInt();
		System.out.print("Enter aadhar number : ");
		a.aadharNumber = sc.nextInt();
		
		// White Space
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Output
		System.out.println("The name of the programmer is : "+a.name);
		System.out.println("The age of the programmer is : "+a.age);
		System.out.println("The rank of the programmer is : "+a.rank);
		System.out.println("The aadhar number of the programmer is : "+a.aadharNumber);
	}
}

// Level 1 of Inheritance
class Person{
	String name;
	int age;
}

// Level 2 of Inheritance
class Programmer extends Person{
	int rank;
}

// Level 3 of Inheritance
class AadharNumber extends Programmer{
	int aadharNumber;
}
