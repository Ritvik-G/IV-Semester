// Import of required modules
import java.util.*;

// Main class
class Finally{
  //Main method
  public static void main(String [] args){
      Scanner sc = new Scanner(System.in); // Scanner declaration [for input]

      //input
  		System.out.print("Enter dividend : ");
  		int d1 = sc.nextInt();
      System.out.print("Enter divisor : ");
      int d2 = sc.nextInt();

      //Try-Catch declaration
      try{
        int c = d1/d2; // exception case
        System.out.println("The result is: "+c); // Output if exception false
      }catch(ArithmeticException e){
        System.out.println("Exception Faced:"+e.getMessage());
      }finally{
        System.out.println("Thank you for using our services :)"); // Code that needs to run afterwards
      }
  }
}
