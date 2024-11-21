package narendra;
/*
Assignment - 7 : 16th Nov'2024 (30 mins) [parameter practice)
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

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl
*/

class Assignment_07_EmployeeInfo{
	String firstName, lastName, address, phoneNumber;
	int employeeId, managerId;

	void updatePrimaryInfo(String fName, String lName, int empId, int managrId){
		firstName = fName;
		lastName = lName;
		employeeId = empId;
		managerId = managrId;
		
	}
	
	void updateSecondaryInfo(String addressInput, String mobNum){
		address = addressInput;
		phoneNumber = mobNum;
		
	}
	
	void displayPrimaryInfo(){
		System.out.println("*** Primary Info ***");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + employeeId);
		System.out.println("Manager ID: "+ managerId + "\n");
		
	}
	
	void displayOtherInfo(){
		System.out.println("-----------------------------" + "\n" + "*** Other Info ***");
		System.out.println("Address: " + address);
		System.out.println("Phone Number: "+ phoneNumber + "\n");
		
	}
	
	void displayAllInfo(){
		System.out.println("-----------------------------" + "\n" +"*** All Info ***");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Emp ID: " + employeeId);
		System.out.println("Manager ID: "+ managerId);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: "+ phoneNumber);
		
	}
		
	public static void main(String[] args){
		Assignment_07_EmployeeInfo employeeinfo = new Assignment_07_EmployeeInfo();
		employeeinfo.updatePrimaryInfo("Narendra", "Deshmukh", 501, 201);
		employeeinfo.updateSecondaryInfo("Magarpatta, Hadapsar, Pune-14, MH", "+91-7777788888");
		employeeinfo.displayPrimaryInfo();
		employeeinfo.displayOtherInfo();
		employeeinfo.displayAllInfo();
			
	}
}