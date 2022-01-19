//Implementing a program to check if a user is eligible to vote or not
//Importing required modules
import java.util.*;
import java.io.*;

//Superclass importing subclass of Throwable class that contains exceptions and errors 
class PersonalisedExceptionRun extends Exception
{
    public PersonalisedExceptionRun(String s)
    {
        super(s);// creation of super string s
    }
}

public class PersonalisedException
{
    // Function to check exceptions 
    static void foo(int x) throws PersonalisedExceptionRun {
        if (x < 18) {
            throw new PersonalisedExceptionRun("You are underage. Please wait for voting term next time. Age: " + x);
        }
        else {
            System.out.println("Thank you for voting! Hope that your candidate wins :)");
        }
    }
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in); // Scanner declaration [for input]

            //Input
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            foo(age); // Function call
        }
        catch (PersonalisedExceptionRun ex)
        {
            System.out.println("Exception Occurred. The exception is: ");
            System.out.println(ex.getMessage());
        }
    }
}
