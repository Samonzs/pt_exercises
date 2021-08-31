
package PracSet1;

import java.util.Scanner;

public class Statistics 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		double number;
		double max = 0;
		double min = 0;
		double total = 0;
		double negativeValues = 0;
		double positiveValues = 0;
		double posCount = 0;
		double negCount = 0;
		
		System.out.println("Please enter a number:");
		number = kb.nextInt();
		total++;
		while (!(number == 0)) 
		{
			if (number > max) 
			{
				max = number;
			}
			if (number < min) 
			{
				min = number;
			}
			if (number < 0) 
			{
				negativeValues += number;
				negCount++;

			}
			if (number > 0) 
			{
				positiveValues += number;
				posCount++;

			}
			System.out.println("Please enter a number:");
			number = kb.nextInt();
			total++;
		}
		if(number == 0 ) 
		{
			total--;
		}
		System.out.println("total  positive numbers : " + positiveValues);
		System.out.println("The highest number is: " + max);
		System.out.println("The lowest number is: " + min);
		System.out.println("total numbers counted " + total);
		System.out.println("total negative numbers: " + negativeValues);
		System.out.println("Average of positive numbers: " + positiveValues / posCount);
		System.out.println("Average of negative numbers: " + negativeValues / negCount);


	}

}