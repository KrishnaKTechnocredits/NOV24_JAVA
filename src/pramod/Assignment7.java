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

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl  */

package pramod;

class Assignment7 {
	String firstName, lastName, empAddress, empPhone;
	int empid, mngid;
	
	void updatePrimaryInfo(String fname, String lname, int empID, int mngID) {
		firstName = fname;
		lastName = lname;
		empid = empID;
		mngid = mngID;
	}
	
	void updateSecondaryInfo(String address, String phoneNumber) {
		empAddress = address;
		empPhone = phoneNumber;
	}
	
	void displayPrimaryInfo() {
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empid);
		System.out.println("Manager ID is: " + mngid);
	}
	
	void displayOtherInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Address is: " + empAddress);
		System.out.println("Phone number is: " + empPhone);
	}
	
	void displayAllInfo() {
		System.out.println("-------------------------------------");
		System.out.println("All info is as below: ");
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empid);
		System.out.println("Manager ID is: " + mngid);
		System.out.println("Address is: " + empAddress);
		System.out.println("Phone number is: " + empPhone);
	}
	
	public static void main(String[] args) {
		Assignment7 emp = new Assignment7();
		emp.updatePrimaryInfo("Pramod" , "Mane", 101, 1010);
		emp.updateSecondaryInfo("Sangli", "+91-9509501632");
		emp.displayPrimaryInfo();
		emp.displayOtherInfo();
		emp.displayAllInfo();
	}
}