package week5;

import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */

public class Employee {
	private int staffID; // employee unique identifier
	private String firstName;
	private String surname;
	private String address; // home address
	private double annualLeave; // accrued annual leave available (hours)
	private double longServiceLeave; // accrued long service leave available (hours)
	// other data fields from lecture 4 not implemented in this example to keep it
	// brief

	/**
	 * @param ID - The new employees staff identification number
	 */
	public void setStaffID(int ID) {
		staffID = ID;
	}

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
