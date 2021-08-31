package PracSet1;

import java.util.Scanner;

public class StockCommission 
{

	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		int price = 0;
		int shares = 0;
		double stockamount=  0;
		int stockprice=  0;
		double flatrate = 0.0425;
		double total = 0;
		
		//input
		while (shares < 100 || shares > 100000) 
		{

			System.out.println("Enter a number of shares between 100 and 100000: ");
			shares = keyboard.nextInt();
		}
		while (price <= 0 || price > 500) 
		{
			System.out.println("please enter a price for shares thats more then 0 or <=500: ");
			price = keyboard.nextInt();
		}
		//process
		stockprice = shares*price;
		stockamount = price * flatrate;
		
		System.out.println("The amound paid for the stock: "+stockprice);
		System.out.println("The amount for the commision: "+stockamount);
		System.out.println("Total Amount: "+ (stockprice  + stockamount));
	}

}
