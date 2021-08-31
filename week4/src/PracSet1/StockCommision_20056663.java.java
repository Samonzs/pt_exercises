package PracSet1;

import java.util.Scanner;

public class StockCommisionWk4 
{

	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		int Price;
		int shares;
		double flatrate = 0;
		double processes = 0;
		double total = 0;
		System.out.println("enter a commision rate in the rage of 1 to 5.5");
		flatrate = keyboard.nextDouble();
		flatrate = CommisionRate(flatrate);
		if (flatrate > 1 && flatrate < 5.5) 
		{

			System.out.println("shares: ");
			shares = keyboard.nextInt();

			System.out.println("price: ");
			Price = keyboard.nextInt();

			shares = sharesValidation(shares);
			Price = priceValidation(Price);

			processes = calculationProcess(flatrate, total, shares, processes, shares);

		}

	}

	private static double calculationProcess(double flatrate, double total, int shares, double processes, int Price) {
		total = Price * flatrate + shares;
		System.out.println(shares * Price);
		System.out.println(Price * flatrate);
		System.out.println(total);
		return processes;
	}

	private static int priceValidation(int Price) 
	{
		Scanner keyboard = new Scanner(System.in);
		while (Price <= 0 || Price > 500) {
			System.out.println("please enter a price for shares thats more then 0 or <=500");
			Price = keyboard.nextInt();
		}

		// TODO Auto-generated method stub
		return Price;
	}

	private static int sharesValidation(int shares) 
	{
		Scanner keyboard = new Scanner(System.in);
		while (shares < 100 || shares > 100000) 
		{
			System.out.println("please enter a number between 100 and 1000000");
			shares = keyboard.nextInt();
		}

		return shares;
	}

	private static double CommisionRate(double flatrate) 
	{
		Scanner keyboard = new Scanner(System.in);
		while (!(flatrate > 1 && flatrate < 5.5)) 
		{
			System.out.println("enter a commision rate in the rage of 1 to 5.5");
			flatrate = keyboard.nextDouble();
		}

		return flatrate;
	}

}
