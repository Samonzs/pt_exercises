package PracSet1;

import java.util.Scanner;

public class Koala {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner kb = new Scanner(System.in);

    double koalaPop = 0;
    double popIncreasePercentage = 0; 
    int numOfYears = 0;
    double percent = 0;


    System.out.println("Enter number of koalas");
    koalaPop = kb.nextDouble();

    while (koalaPop < 500)
    {
      System.out.println("Inncorrect, enter 500 or greater");
      koalaPop = kb.nextDouble();
    }

    System.out.println("Provide an annual average population increase");
    popIncreasePercentage = kb.nextDouble();
    percent = popIncreasePercentage;
    
    while (popIncreasePercentage <=0)
    {
      System.out.println("That value is not acceptable, only 0 or greater are allowed");
      popIncreasePercentage = kb.nextDouble();
    }

    System.out.println("Enter the number of years to estimate population");
    numOfYears = kb.nextInt();

    while (numOfYears < 10)
    {
      System.out.println("Enter a a value that isn't less than 10");
      numOfYears = kb.nextInt();
    }

    for (int i = 0; i < numOfYears; i++)
    {
      koalaPop = koalaPop*percent;
      double nigga = koalaPop/100;
      System.out.println("The Koala Population is " + nigga +" by the end of the year "+ (i+1));
    }



  }

}