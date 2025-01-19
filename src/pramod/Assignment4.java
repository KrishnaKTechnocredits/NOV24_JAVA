/*Assignment - 4 : 13th Nov'2024 (10 mins)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo() */

package pramod;

class Assignment4{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Pramod";
		lastName = "Mane";
		empId = 104;
		managerId = 101;
	}
	
	void updateSecondaryInfo(){
		address = "Sangli";
		phoneNumber = "+91-9509501632";
	}
	
	void displayPrimaryInfo(){
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empId);
		System.out.println("Manager ID is: " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("Address is: " + address);
		System.out.println("Phone number is: " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("All info is as below: ");
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is: " + lastName);
		System.out.println("Employee ID is: " + empId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("Address is: " + address);
		System.out.println("Phone number is: " + phoneNumber);
		
	}
	
	public static void main(String[] args){
		Assignment4 employeeDetails = new Assignment4();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
	}
}