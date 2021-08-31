package week7Q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpensesDemoWk7 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double sales = 0;
		double Expenditure = 0;
		double sumOfSales = 0;
		double sumOfExpenses = 0;
		double balance1 = 0;
		double keleven = 0;
		String month;

		int sum = 0;
		BufferedReader br = null;

		try {
			File file = new File("MalonesCones.txt"); // creating the text file
			br = new BufferedReader(new FileReader(file)); // initialise reader
			String line; // store the data in a string variable
			File file2 = new File("expenseSummary.txt");	// creatuing the file for part c 
			PrintWriter pw = new PrintWriter(file2);

			if (!file.exists()) {

				file.createNewFile(); // if file doesnt exist, the fil is then created

			}

			while ((line = br.readLine()) != null) { // each line which we read from the file, we are checking whether
														// its null or not, if its null we go out of the loop, but if
														// its not null we keep reading

				ExpensesWk7 money = new ExpensesWk7("Reset");
				keleven = 0;
				
				//
				String[] temp = line.split(" "); // turns "February 4" into ["February", "4"], i.e. it "splits" the
													// string on every space (" ")
				month = temp[0]; // "February"
				float count = Float.parseFloat(temp[1]); // "4" -> 4
				System.out.println("\nThe month of " + month);
				
	
				for (int i = 0; i < count; i++) // loops "count" number of times
				{

					line = br.readLine(); // reads the first string
					temp = line.split(" "); // splitting the vlayues so that the below code can interpret the values
					sales = Float.parseFloat(temp[0]); // use first numeric value which is sales, and stored in sales
					Expenditure = Float.parseFloat(temp[1]); // use second numeric value which is expenditure, and
																// stored in expenditure
					money.totalincome(sales);
					money.totalExpenditure(Expenditure);		// sums the sales and expenditure 
			
				}

				
				 // creating the text file

				if (!file2.exists()) {

					file2.createNewFile(); // if file doesnt exist, the fil is then created

				}

				money.setBalance(balance1);
				System.out.println("Month Balance:\t" + money.getBalance());
				System.out.println("Total Sales:\t" + money.getIncome()); // the getters
				System.out.println("Total Expenses:\t" + money.getExpenditure());
				System.out.println("Keleven:\t" +money.calculateKeleven(keleven));
				
				
				pw.write(month + "," + money.balance + "," + sales + "," + Expenditure + "," + money.calculateKeleven(keleven)+"\n");	// the output of part c , to print out the summary in a seperate file

			}
			pw.close();	// close file writing
			br.close(); // close file reading
			
		} catch (Exception e) {
			e.printStackTrace(); // catching errors
		}

		
	}

	

		
	
	
	
	
	


	
}