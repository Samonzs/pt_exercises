package icecream;

import java.util.Scanner;

public class icecreamDemo {

	public static void main(String[] args) {

		Expenses money = new Expenses();
		Scanner kb = new Scanner(System.in);
		int weeks;
		int total = 0;
		
		double sales = 0;
		double Expenditure = 0;
		double sumOfSales = 0;
		double sumOfExpenses = 0;
		double balance1 = 0;
		double keleven = 0;
	
		System.out.println("How many weeks this month? ");
		weeks = kb.nextInt();
		System.out.println("please enter two numbers(sales and expenditure)\n");

		for (int i = 0; i < weeks; ++i) {

			System.out.println("Sales & Expenditure for week " + (i + 1) + ":");

			sales = kb.nextInt();
			Expenditure = kb.nextInt();						// the sales and expenditure datafield 
			sumOfSales += sales;
			sumOfExpenses += Expenditure;
		}
		sales = balance12(sales, Expenditure, balance1);
		money.setBalance(balance1);							// methods that were created
		System.out.println("Balance: ");						
		balance1 = kb.nextDouble();
		keleven = keleven1(balance1, keleven);

		System.out.println("Month Balance:\t" + money.getBalance(balance1));
		System.out.println("Total Sales:\t" + money.getIncome(sumOfSales));						// the getters
		System.out.println("Total Expenses:\t" + money.getExpenditure(sumOfExpenses));
		System.out.println("Keleven:\t" + money.getKeleven(keleven));

	}

	public static double keleven1(double balance1, double keleven) {		// this is the keleven validation, making sure that at the end of the motnth , keleven is the amount added making surte that balance becines 0 
		if (balance1 < 0) {
			keleven -= balance1;
		}
		else {
			balance1+=keleven;
		}
		return keleven;					
	}

	public static double balance12(double sales, double Expenditure, double balance1) {
		sales = sales + balance1;			// the method that adds the sale to the balance
		return sales;

	}
}