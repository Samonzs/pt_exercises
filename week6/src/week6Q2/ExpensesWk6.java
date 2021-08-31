package week6Q2;
/* stores montly balance
 * stores total of income
 * total of expenditure
 * include set and get methods in this class for all methods 
 * 
 * methods:
 * adding amount of a sale to the balance
 * subtracting the amount of an expenditure from the balance
 * all expenditure spent in the  month
 * all incoming money in the mo
 * 
 * Keleven method
 */
public class ExpensesWk6 {

	double balance;
	double income;
	double expenditure;
	String Month;

	
	public ExpensesWk6() {
		
	}
	
	public ExpensesWk6(String month) {
	
		expenditure = 0;
		income = 0;
		balance = 0;
		Month = month;

	}
	

	
	
	public void setBalance(double balance1) {
		balance = balance1;
	}
	
	public double getBalance(double sales) {
		
		return balance;

	}
	
	
	
	public double getIncome(double sumOfSales) {
		
		return sumOfSales;

	}
	
	public double getExpenditure(double sumOfExpenses) {
		
		return sumOfExpenses;

	}

	
	

	
	


	public double getKeleven(double keleven) {
		return keleven;
	}
	
	public void setMonth(String month) {
		Month = month;
	}
	
	public String getMonth() {
		return Month;
	}

	


	
	
	
	
}
