package week7Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberFile {

	public static String name; // had to create a global scope method to pass this variable across the other
								// methods used in this code

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Numbers from 101-10000");

		createFile();
		readFile();
		sumOfnumbers();
	}

	public static void createFile() {
		Scanner kb = new Scanner(System.in);
		try {
			System.out.println("file name ?");
			name = kb.nextLine();
			File file = new File(name + ".txt"); // creating the text file

			if (!file.exists()) {

				file.createNewFile(); // if file doesnt exist, the fil is then created

			}

			PrintWriter pw = new PrintWriter(file);

			System.out.println("starting number: ");
			int starting = kb.nextInt(); // user input that choses the starting and ending values to be stored in the
											// text file
			System.out.println("ending number: ");
			int ending = kb.nextInt();

			for (int i = starting - 1; i < ending; i++) { // the for loop to containg all numbers from 101-10000
				pw.println(i + 1);
			}

			pw.close(); // close the file
		}

		catch (IOException e) // catches error
		{
			e.printStackTrace(); // prints exception details of error
		}
	}

	public static void readFile() 
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(name + ".txt")); // initialise reader
			String line; // store the data in a string variable

			while ((line = br.readLine()) != null) 
			{ // each line which we read from the file, we are checking whether
														// its null or not, if its null we go out of the loop, but if
														// its not null we keep reading
				System.out.println(line);
			}
			br.close(); // close file reading

		} catch (Exception e) {
			e.printStackTrace(); // catching errors
		}

	}

	public static void sumOfnumbers() { // had to create a third method for the sum of the numbers range provided by the
										// user
		int sum = 0;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(name + ".txt")); // initialise reader
			String line; // store the data in a string variable

			while ((line = br.readLine()) != null) { // each line which we read from the file, we are checking whether
														// its null or not, if its null we go out of the loop, but if
														// its not null we keep reading
				sum += Integer.parseInt(line);	// parsing strings to ints as well as suming the range entered by the user 
			}
			System.out.println("The sum of all numbers  " + sum);
			br.close(); // close file reading

		} catch (Exception e) {
			e.printStackTrace(); // catching errors
		}
	}

}