/**
 * Demonstration source code.
 * Demonstrates use of:
 *   console interface and model objects
 *   while loops
 *   if else logic
 * 
 * @author GrayKnight  CPM 2017
 * @version 10/11/12, 10/20/17
 */
import java.util.Scanner;

//You have already seen a few examples of 'while' loops in other assignments
// where you were given the implementation for a UI on the console. 
//Read the line comments below to see key components of 'while" loop implementation.
public class FactorDriver
{
    private Scanner scan = new Scanner(System.in);
    // a separate scanner for numbers and Strings can help avoid run time errors
    private Scanner scan2 = new Scanner(System.in);

    //surveys the user for information
    //controls execution
    public void userInput()
    {
        //while loops need to check the condition of an identifier often called a 'sentinel' variable
        //A sentinel variable needs to be declared and initialized before the while statement.
        String check = "y"; //'check'is being used here as a sentinel identifier
        
        int num;
      
        //The 'while' statment checks a condtional expression just like an 'if' statement.
        //If the condtion is 'false' then all of the implementation between its { } is skipped.
        //If 'true' then the looping begins
        while(check.equals("y"))
        {
            System.out.print("\nEnter a natural number from 1 - 1000:");
            num = scan.nextInt();
            
            //instantiate object
            NaturalNumber nat = new NaturalNumber(num);
            
            //use the object methods
            System.out.println(nat.findTheFactors());
            System.out.println(nat.primeFactors());
            
            //Somewhere within the 'while' { } the sentinel value or condition needs an opportunity to change
            // or else the program gets stuck in the loop until it crashes. 
            //An 'endless loop' is a common logic error when using 'while' statements
            //Here the user is offered an opportunity to exit the loop.
            System.out.print("\nTry Again? (y or n):");
            check = scan2.nextLine(); 
            
        // When control reaches this last curly brace the 'while' condition is checked again.    
        } // If 'true' the loop is repeated, if 'false' the loop is skipped.
        
        System.out.print("Goodbye!\n\n");
    }
}
