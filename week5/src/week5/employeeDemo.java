package week5;

import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */

public class employeeDemo {
	public static void main(String[] args) {
		double remainingHours = 0;
		double hoursToGetOff = 0;
		/*
		 * This program demonstrates the use of the Employee class and some of its
		 * methods to learn about the use of accessors and mutators
		 */

		Employee accountant = new Employee();
		Scanner kb = new Scanner(System.in);

		System.out.println("Staff ID: ");
		int ID = kb.nextInt();
		accountant.setStaffID(ID);

		System.out.println("First Name: ");
		String name = kb.nextLine();
		name = kb.nextLine();
		accountant.setFirstName(name);

		System.out.println("Surname: ");
		String Sname = kb.nextLine();
		accountant.setSurname(Sname);

		System.out.println("Home Address: ");
		String address = kb.nextLine();
		accountant.setAddress(address);

		System.out.println("Annual Leave: ");
		double aLeave = kb.nextDouble();
		accountant.setAnnualLeave(aLeave);

		System.out.println("LongServiceLeave: ");
		double ServiceLeave = kb.nextDouble();
		accountant.setLongServiceLeave(ServiceLeave);

		String leave = kb.nextLine();
		System.out.println("Do you wish to take Leave? Y/N: ");
		leave = kb.nextLine();

		while (!(leave.equals("Y")) && !(leave.equals("N"))) 
		{
			System.out.println("please enter Y or N");
			leave = kb.nextLine();
		}

		if (leave.equals("Y")) // once user has accpeted to take leave , then the code will commence
		{

			System.out.println("How many days leave? ");
			int days = kb.nextInt();

			System.out.println("Annual Leave (A) or Long service Leave (L)? A/L: ");
			String leaveType = kb.nextLine();
			leaveType = kb.nextLine();

			while (!(leaveType.equals("A")) && !(leaveType.equals("L"))) 
			{
				System.out.println("please enter A or L");
				leaveType = kb.nextLine();
			}
			
			if (leaveType.equals("A")) // once user accepts annual leave

			{
				if (accountant.hasEnoughLeave(leaveType, hoursToGetOff)) 
				{
					remainingHours = (double) (aLeave - (7 * days));
					hoursToGetOff = aLeave - remainingHours;

					System.out.println(name + ", your annual leave request has been approved for " + days
							+ " days. You now have " + remainingHours + " hours annual leave remaining.");

					System.out.println(
							"\nWe just created the accountant object. Let's check the values of it's data fields.");
					System.out.println("\nInitial values for accountant object data fields:");
					System.out.println("Staff ID:\t\t\t" + accountant.getStaffID());
					System.out.println("First Name:\t\t\t" + accountant.getFirstName());
					System.out.println("Surname:\t\t\t" + accountant.getSurname());
					System.out.println("Annual Leave:\t\t\t" + remainingHours);
					System.out.printf("Long Service Leave:\t\t%.2f", accountant.getLongServiceLeave());
					System.out.println("\nHome Address:\t\t\t" + accountant.getAddress());
				}

			}

			else // once user accepts long leave service
			{
				if (accountant.hasEnoughLeave(leaveType, hoursToGetOff)) 
				{
					remainingHours = (double) (ServiceLeave - (7 * days));
					hoursToGetOff = ServiceLeave - remainingHours;

					System.out.println(name + ", your Long service leave request has been approved for " + days
							+ " days. You now have " + remainingHours + " hours annual leave remaining.");

					System.out.println(
							"\nWe just created the accountant object. Let's check the values of it's data fields.");
					System.out.println("\nInitial values for accountant object data fields:");
					System.out.println("Staff ID:\t\t\t" + accountant.getStaffID());
					System.out.println("First Name:\t\t\t" + accountant.getFirstName());
					System.out.println("Surname:\t\t\t" + accountant.getSurname());
					System.out.printf("Annual Leave:\t\t\t%.2f", accountant.getAnnualLeave());
					System.out.printf("\nLong Service Leave:\t\t" + remainingHours);
					System.out.println("\nHome Address:\t\t\t" + accountant.getAddress());
				}
			}

		}

	}
}
