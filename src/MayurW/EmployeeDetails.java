/*
Assignment - 4 : 13th Nov'2024 (25 mins)
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

package MayurW;

class EmployeeDetails{
	String firstName;
	String lastName;
	int empId;
	int managerId; 
	String address; 
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="Mayur";
		lastName="Wani";
		empId=101010;
		managerId=222;
	}

	void updateSecondaryInfo(){
		address="Pune,Maharashtra";
		phoneNumber="+91-9999999999";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Displaying primary info of the employee");
		System.out.println("Employee name is - "+firstName+" "+lastName);
		System.out.println("Employee ID - "+empId);
		System.out.println("Manager ID of the employee is - "+managerId+"\n");
	}

	void displayOtherInfo(){
		System.out.println("Displaying other info of the employee");
		System.out.println("Address of the employee - "+address);
		System.out.println("Phone number of the employee - "+phoneNumber+"\n");
	}	
	
	void displayAllInfo(){
		System.out.println("Displaying all info of the employee");
		System.out.println("Employee name is - "+firstName+" "+lastName);
		System.out.println("Employee ID is - "+empId);
		System.out.println("Manager ID of the employee is - "+managerId);
		System.out.println("Address of the employee - "+address);
		System.out.println("Phone number of the employee - "+phoneNumber+"\n");
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}	
}