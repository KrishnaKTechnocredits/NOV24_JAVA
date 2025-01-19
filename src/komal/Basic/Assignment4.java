//Assignment - 4 : 13th Nov'2024 (25 mins)
//Create a class called EmployeeDetails having following instance variable.
//firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

package komal.Basic;

public class Assignment4 {
	String firstName, lastName, address, phoneNumber;
	int empId, managerId;

	void updatePrimaryInfo() {
		firstName = "komal";
		lastName = "khopade";
		empId = 1;
		managerId = 101;
	}

	void updateSecondaryInfo() {
		address = "Tukaidarshan, Hadapsar, Pune-14, MH";
		phoneNumber = "+91-7276281513";
	}

	void displayPrimaryInfo() {
		System.out.println("Primary Info");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + empId);
		System.out.println("Manager ID: " + managerId);

	}

	void displayOtherInfo() {
		System.out.println("Other Info");
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);

	}

	void displayAllInfo() {
		System.out.println(" All Info");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + empId);
		System.out.println("Manager ID: " + managerId);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);

	}

	public static void main(String[] args) {
		Assignment4 employeeDetails = new Assignment4();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();

	}
}
