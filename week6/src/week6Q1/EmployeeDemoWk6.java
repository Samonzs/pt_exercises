package week6Q1;

import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */
// Question 1 e) the code will execute normally ,  the functionality and outputs are different due to the assignable values we have newly stored from part d
// the code will execute normally , however we have set values that restore those values(ID,fname,sname,rate)  since we have set them according to user inputs.
// in the code for the accountant objects data fields, it is different from week5 data as we did notn assign them to anything, however in this case we have done so
// , so the code does change the initial data field. the display method in the employee class showcases the data values that are assigned before the user input implementation
// once the user inputs their data accordingly, the data then is updated to the inputted data. 
public class EmployeeDemoWk6 
{
	public static void main(String[] args) 
	{
		double remainingHours = 0;
		double hoursToGetOff = 0;

		EmployeeWk6 accountant = new EmployeeWk6();
		
		
		Scanner kb = new Scanner(System.in);
		/*
		accountant.display();		 part e
		*/
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
		String location = kb.nextLine();
		accountant.setAddress(location);

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

			System.out.println("\nDepartment : ");
			String department = kb.nextLine();
			accountant.setDepartment(department);
			
			System.out.println("Position: ");
			String position = kb.nextLine();
			accountant.setPosition(position);
			
			System.out.println("Supervisor ID : ");
			int supervisorId = kb.nextInt();
			accountant.setSupervisorId(supervisorId);
			
			
			
			System.out.println("Pay Rate : ");
			float payRate = kb.nextFloat();
			if(!(payRate < 0 )) 
			{
				accountant.setPayRate(payRate);
			}
			else 
			{
				while(payRate < 0 ) 	
				{
					System.out.println("Enter a positive Number");
					payRate = kb.nextFloat();
				}
			}											// 1 c) this should be implemented in the main method, as all the functions and processes belong here
		
			System.out.println("Hours Worked : ");
			float hoursWorked = kb.nextFloat();
			
			if(!(hoursWorked < 0 )) 
			{
				accountant.setHoursWorked(hoursWorked);
			}
			else 
			{
				while(hoursWorked < 0 ) 	
				{
					System.out.println("Enter a positive Number");
					hoursWorked = kb.nextFloat();
				}
			}
		
			EmployeeWk6 cleaner = new EmployeeWk6(ID, name, Sname, payRate);
		
			EmployeeWk6 technician = new EmployeeWk6(ID, name, Sname, payRate, location, aLeave, ServiceLeave, department, position, supervisorId, hoursWorked);

			calculatGrossPay(hoursWorked, payRate);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	public static void calculatGrossPay(double hoursWorked, double payRate) {
		
		System.out.println("Accountant GrossPay: "+ hoursWorked*payRate);
	}
}
