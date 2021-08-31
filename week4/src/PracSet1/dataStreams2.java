package PracSet1;
import java.util.Scanner;

public class dataStreams2 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    byte number1;
    byte number2;
    float number3;
    String message;

    System.out.println("Please enter a whole number");
    number1 = kb.nextByte();
    System.out.println("Please enter a message");
    Scanner kb1 = new Scanner(System.in);
    message = kb1.nextLine();
    System.out.println("Please enter a whole number");
    number2 = kb.nextByte();
    System.out.println("Please enter a fractional number");
    number3 = kb.nextFloat();

    System.out.println("Data entered was:");
    System.out.println("number 1: " + number1);
    System.out.println("number 2: " + number2);
    System.out.println("number 3: " + number3);
    System.out.println("message : " + message);

  }
  /*Part C
   * Similar to part a, i created another input variable for string message to resolve this problem, so that the code 
   * will successfully execute
   * 
   * 
   */
}
