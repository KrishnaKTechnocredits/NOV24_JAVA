/*Assignment - 7 : 16th Nov'2024 (30 mins) [parameter practice)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

String firstName, lastName, employeeId, managerId;

void updatePrimaryInfo(String fname, String lName, int id, int mngId){
	firstName = fname;
	lastName = lName;
	employeeId = id;
	managerId = mngId;
}
create 5 methods from which 2 methods are parameterized method (1,2).
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAll */

package nikita;

public class Assignment07 {
	String firstName, lastName, address, phoneNumber;
	int empId, managerId;
	
	void updatePrimaryInfo(String fName, String lName, int eid, int mngId) {
		firstName = fName;
		lastName = lName;
		empId = eid;
		managerId = mngId;
	}
	
	void updateSecondaryInfo(String add, String pno) {
		address = add;
		phoneNumber = pno;
	}
	
	void displayPrimaryInfo() {
		System.out.println("Employee Primary Information: ");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee Id is: " + empId);
		System.out.println("Manager Id is: " + managerId);
		System.out.println();
	}
	
	void displayOtherInfo() {
		System.out.println("Employee Other Information: ");
		System.out.println("Employee address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo( ) {
		System.out.println("All Information: ");
		System.out.println("Employee Name is: " + firstName + " " + lastName);
		System.out.println("Employee Id is: " + empId);
		System.out.println("Manager Id is: " + managerId);
		System.out.println("Employee address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Assignment07 a7 = new Assignment07();
		a7.updatePrimaryInfo("Nikita", "Wani", 10, 1011);
		a7.updateSecondaryInfo("Mumbai", "+91-8547863557");
		a7.displayPrimaryInfo();
		a7.displayOtherInfo();
		a7.displayAllInfo();
	}
}
