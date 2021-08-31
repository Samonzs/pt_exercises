package week6Q1;

import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */

public class EmployeeWk6 {
	private int staffID; // employee unique identifier
	private String firstName;
	private String surname;
	private String address; // home address
	private double annualLeave; // accrued annual leave available (hours)
	private double longServiceLeave; 
	private String Department;
	private String Position;
	private int SupervisorId; 
	private float PayRate;
	private float HoursWorked;
	private double Grosspay; 
	/**
	* No-Arg Constructor - create the new employee object with some default
	* values. Note: these values are for the purpose of the example only and are
	* not particularly sensible values to choose.
	*/
	
	public EmployeeWk6() {
	 staffID = 99999;
	 firstName = "Eileen";
	 surname = "Over";
	 PayRate = 16.75f; // the minimum payrate for an employee at the company
	}
	/*
	* Constructor - create the new employee object using the values from the parameters as listed
	*
	* @param ID - The new employees staff ID.
	 * @param sName 
	* @param fName - The new employees first name
	* @param sName - The new employees surname
	* @param rate - The new employees hourly rate of pay
	*/
	public EmployeeWk6(int ID, String name, String Sname, float payRate) 
	{
	 staffID = ID;
	 firstName = name;
	 surname = Sname;
	 PayRate = payRate;
	}

	public EmployeeWk6(int ID, String name, String Sname, float payRate , String location, double aLeave, double ServiceLeave, String department, String position, int supervisorId, float hoursWorked)
		{
		
			address = location;	
			annualLeave = aLeave;
			longServiceLeave = ServiceLeave;
			Department = department;
			Position = position;
			SupervisorId = supervisorId;
			HoursWorked = hoursWorked;
			staffID = ID;
			firstName = name;
			surname = Sname;
			PayRate = payRate;
			
			
			 
			
		}
		
		
	
	
	
	/**
	 * @param ID - The new employees staff identification number
	 */
	public void setStaffID(int ID) {
		staffID = ID;
	}
	
	/*
	public void display(){
		System.out.println("staffID");
		System.out.println(staffID);
		System.out.println("firstName");
		System.out.println(firstName);			part e 
		System.out.println("surname");
		System.out.println(surname);
		System.out.println("payRate");
		System.out.println(PayRate);
	}
	*/
	/**
	 * @return staff Identification number
	 */
	public int getStaffID() {
		return staffID;
	}
	
	
	public void setFirstName(String name) {
		firstName = name;

	}
	
	public String getFirstName() {
		return firstName;
	}

	

	
	public void setSurname(String Sname) {
		surname = Sname;

	}
	
	public String getSurname() {
		return surname;
	}


	

	public void setAnnualLeave(double aLeave) {
		annualLeave = aLeave;

	}
	
	public double getAnnualLeave() {
		return annualLeave;
	}
	

	public void setLongServiceLeave(double ServiceLeave) {
		longServiceLeave = ServiceLeave;

	}

	
	
	public double getLongServiceLeave() {
		return longServiceLeave;
	}

	public void setAddress(String location) {
		address = location;

	}
	
	public String getAddress() {

		return address;
	}



	public void setDepartment(String department) {
		Department = department;

	}

	public String getDepartment() {
			return Department;
	}
	
	public void setPosition(String position) {
		Position = position;

	}
	
	public String getPosition() {
		return Position;
	}
	
	public void setSupervisorId(int supervisorId) {
		SupervisorId = supervisorId;
	}
	
	public int getSupervisorId() {
		return SupervisorId;
	}
	
	public void setPayRate(float payRate) {
		PayRate = payRate;
	}
	
	public float getPayRate() {
		return PayRate;
	}
	
	public void setHoursWorked(float hoursWorked) {
		HoursWorked = hoursWorked;
	}
	
	public float getHoursWorked() {
		return HoursWorked;
	}
	
	
	public double CalculatGrossPay(double hoursWorked, double payRate) {
		Grosspay = hoursWorked*payRate;
		return Grosspay;
	}
	
	public double getGrossPay( ) {
		return Grosspay;
	}
	
	
	
	
	
	
	/**
	 * Determines if the employee has sufficient accrued leave to cover the
	 * requested number of hours of leave.
	 *
	 * @param leaveType   – type of leave requested. A = Annual, L = long service
	 * @param enoughLeave – number of leave hours requested by employee
	 * @return true if leave is approved, false otherwise
	 */

	public boolean hasEnoughLeave(String leaveType, double hoursToGetOff) {
		if (leaveType.equalsIgnoreCase("A")) {
			if (annualLeave >= hoursToGetOff) {
				return true;
			} else {
				return false;
			}
		} else {
			if (longServiceLeave >= hoursToGetOff) {
				return true;
			} else {
				return false;
			}
		}
	}

} // end Employee class
