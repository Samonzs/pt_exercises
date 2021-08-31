package week6Q2;

import java.util.Scanner;

public class ExpensesDemoWk6 {

	public static void main(String[] args) {

		ExpensesWk6 money = new ExpensesWk6("Reset");
		Scanner kb = new Scanner(System.in);
		int weeks;
		int total = 0;
		double sales = 0;
		double Expenditure = 0;
		double sumOfSales = 0;
		double sumOfExpenses = 0;
		double balance1 = 0;
		double keleven = 0;
		String month;
		String decision;
		
		
		
		System.out.println("Month Name: ");
		month = kb.nextLine();
		money.setMonth(month);
		System.out.println("How many weeks this "+money.getMonth()+" ?");
		weeks = kb.nextInt();
		System.out.println("please enter two numbers(sales and expenditure)\n");

		for (int i = 0; i < weeks; ++i) {

			System.out.println("Sales & Expenditure for week " + (i + 1) + ":");

			sales = kb.nextInt();
			Expenditure = kb.nextInt();						// the sales and expenditure datafield 
			sumOfSales += sales;
			sumOfExpenses += Expenditure;
		}
		balance1 = calculatBalance(sales, Expenditure, balance1);					// methods that were created
		keleven = keleven1(balance1, keleven);
		money.setBalance(balance1);		
		System.out.println("Month Balance:\t" + money.getBalance(balance1));
		System.out.println("Total Sales:\t" + money.getIncome(sumOfSales));						// the getters
		System.out.println("Total Expenses:\t" + money.getExpenditure(sumOfExpenses));
		System.out.println("Keleven:\t" + money.getKeleven(keleven));

		
		
		
		
		System.out.println("\nEnter another months data? (Y/L)");
		 decision = kb.nextLine();
		
		while (!(decision.equals("Y")) && !(decision.equals("N"))) 
		{
			System.out.println("please enter Y or N");
			decision = kb.nextLine();
		}

		while (decision.equals("Y")) 
		{
			ExpensesWk6 money1 = new ExpensesWk6("Reset");
			sumOfExpenses = 0;
			sumOfSales = 0;
			System.out.println("Month Name: ");
			month = kb.nextLine();
			
			
			System.out.println("How many weeks this "+month+" ?");
			weeks = kb.nextInt();
			System.out.println("please enter two numbers(sales and expenditure)\n");

			for (int i = 0; i < weeks; ++i) {

				System.out.println("Sales & Expenditure for week " + (i + 1) + ":");

				sales = kb.nextInt();
				Expenditure = kb.nextInt();						
				sumOfSales += sales;
				sumOfExpenses += Expenditure;
			}
			balance1 = calculatBalance(sales, Expenditure, balance1);
			keleven = keleven1(balance1, keleven);
			money1.setBalance(balance1);		
			System.out.println("Month Balance:\t" + money1.getBalance(balance1));
			System.out.println("Total Sales:\t" + money1.getIncome(sumOfSales));					
			System.out.println("Total Expenses:\t" + money1.getExpenditure(sumOfExpenses));
			System.out.println("Keleven:\t" + money1.getKeleven(keleven));
			
			System.out.println("\nEnter another months data? (Y/L)");
			 decision = kb.nextLine();
			 decision = kb.nextLine();

			
		}

		

		
		
		
	}

	public static double keleven1(double balance1, double keleven) {		// this is the keleven validation, making sure that at the end of the month , keleven is the amount added making surte that balance becines 0 
		if (balance1 < 0) {
			keleven -= balance1;
		}
		else {
			balance1+=keleven;
		}
		return keleven;					
	}

	public static double calculatBalance(double sales, double Expenditure, double balance1) {
		if(sales<Expenditure||Expenditure>sales){		
		balance1 = sales - Expenditure;	
		}		
	
		return balance1;		
		
		// the method that adds the sale to the balance

	}
}