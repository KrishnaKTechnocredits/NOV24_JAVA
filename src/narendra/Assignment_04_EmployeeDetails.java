package narendra;
/*
Assignment - 4 : 13th Nov'2024 (Day5)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()
*/

class Assignment_04_EmployeeDetails{
	String firstName, lastName, address, phoneNumber;
	int empId, managerId;

	void updatePrimaryInfo(){
		firstName = "Narendra";
		lastName = "Deshmukh";
		empId = 501;
		managerId = 101;
	}
	
	void updateSecondaryInfo(){
		address = "Magarpatta, Hadapsar, Pune-14, MH";
		phoneNumber = "+91-7777788888";		
	}
	
	void displayPrimaryInfo(){
		System.out.println("*** Primary Info ***");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + empId);
		System.out.println("Manager ID: "+ managerId);
		
	}
	
	void displayOtherInfo(){
		System.out.println("\n" + "*** Other Info ***");
		System.out.println("Address: " + address);
		System.out.println("Phone Number: "+ phoneNumber);
		
	}
	
	void displayAllInfo(){
		System.out.println("\n" +"*** All Info ***");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + empId);
		System.out.println("Manager ID: "+ managerId);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: "+ phoneNumber);
		
	}
		
	public static void main(String[] args){
		Assignment_04_EmployeeDetails employeedetails = new Assignment_04_EmployeeDetails();
		employeedetails.updatePrimaryInfo();
		employeedetails.updateSecondaryInfo();
		employeedetails.displayPrimaryInfo();
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
			
	}
}