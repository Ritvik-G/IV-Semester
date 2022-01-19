// Import of required modules
//Program to check if person failed or passed
import java.util.*;

// Main class
class Throw{
  //Main method
  public static void main(String [] args){
      Scanner sc = new Scanner(System.in); // Scanner declaration [for input]

      //input
  		System.out.print("Enter marks : ");
  		int m = sc.nextInt();

      if (m<35){
        throw new ArithmeticException("Failed.");
      }else{
        System.out.println("Pass.");
      }
  }
}
