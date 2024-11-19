package siddharth;
//Assignment 7
public class EmployeeDetails7 {
	String firstName, lastName, address, phoneNo;
	int empId, managerId;

	void updatePrimaryInfo(String firstName, String lastName, int id, int mgrId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = id;
		this.managerId = mgrId;
	}

	void updateSecondaryInfo(String address, String phoneNo) {
		this.address = address;
		this.phoneNo = phoneNo;
	}

	void displayPrimaryInfo() {
		System.out.println("Employee First Name = " + firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
	}

	void displayOtherInfo() {
		System.out.println("Employee address = " + address);
		System.out.println("Employee Phone Number = " + phoneNo);
	}

	void displayAllInfo() {
		System.out.println("Employee First Name = " + firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
		System.out.println("Employee address = " + address);
		System.out.println("Employee Phone Number = " + phoneNo);
	}

	public static void main(String[] args) {
		EmployeeDetails7 employeeDetails7 = new EmployeeDetails7();
		employeeDetails7.updatePrimaryInfo("Siddharth", "Kale", 123, 456);
		employeeDetails7.updateSecondaryInfo("Pune", "+91-9999999999");
		employeeDetails7.displayPrimaryInfo();
		employeeDetails7.displayOtherInfo();
		employeeDetails7.displayAllInfo();
	}
}
