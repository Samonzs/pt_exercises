package PracSet1;
import java.util.Scanner;

public class dataStreams1 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    byte number1;
    byte number2;
    float number3;
    String message;
   
    System.out.println("Please enter a whole number");
    number1 = kb.nextByte();
    System.out.println("Please enter a whole number");
    number2 = kb.nextByte();
    System.out.println("Please enter a fractional number");
    number3 = kb.nextFloat();
    System.out.println("Please enter a message");
    Scanner kb1 = new Scanner(System.in);// part a fix
    message = kb1.nextLine();
    
    
    
    /*
     * Part a)
     * had to create a new variable for scanner to set for string message, as the previous variable was used for numerical values
     * this happened to resolve the issue by adding an extra line of code, another solution to this is we can set the 'message'
     * function at the beginning of the code, and will function normally as it wouldn't have a value stored, so in this case it wil
     * execute successfully 
    
     *Part b)
     *when entering 10 15 22 help, these inputs will allow the code to successfully execute, as the 'nextLine' function only reads 
     *until then end of the line , so must be executed in one line for it to execute properly, under the same variable function
     *which in this case is 'kb'. part b will execute to the standard code 
     */
    System.out.println("Data entered was:");
    System.out.println("number 1: " + number1);
    System.out.println("number 2: " + number2);
    System.out.println("number 3: " + number3);
    System.out.println("message : " + message);

  }

}
