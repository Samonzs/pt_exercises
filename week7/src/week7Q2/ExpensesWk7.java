package week7Q2;

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
public class ExpensesWk7 {
	double totalExpenditure;
	double totalIncome;
	double balance;
	double income;
	double expenditure;
	String Month;

	public ExpensesWk7() {

	}

	public ExpensesWk7(String month) {

		expenditure = 0;
		income = 0;
		balance = 0;
		Month = month;

	}

	
	public void totalincome(double sales) {

		
		totalIncome += sales;

	}

	public double getIncome() {

		return totalIncome;

	}


	public void totalExpenditure(double Expenditure) {

		
		totalExpenditure += Expenditure;

	}

	
	
	public double getExpenditure() {

		return totalExpenditure;

	}

	
	
	
	
	
	public void setBalance(double balance1) {
		balance1 = totalIncome - totalExpenditure;
		balance = balance1;
	}

	public double getBalance() {

		return balance;

	}

	
	
	
	
	
	public  double calculateKeleven(double keleven) { // this is the keleven validation, making sure that
		// at the end of the month , keleven is the
		// amount added making sure that balance
		// becomes 0

		if (balance < 0) {
			keleven -= balance;
		} else {
			balance += keleven;
		}
		return keleven;
		
	}
	

	
	
	
	
	
	
	public void setMonth(String month) {
		Month = month;
	}

	public String getMonth() {
		return Month;
	}

}
