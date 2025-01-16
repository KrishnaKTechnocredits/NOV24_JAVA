/*
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
package nitesh.basicprogram;

class EmployeeDetail{
	String firstName = "Nitesh";
	String lastName = "Shukla";
	String address = "307,Libra life, Indore";
	String phoneNumber ="+918421882621";
	int empId = 124;
	int managerId = 321;

	void updatePrimaryInfo(){
		firstName = "Kunal";
		lastName = "Singh";
		empId= 542;
		managerId = 214;
	}

	void updateSecondaryInfo(){
		address = "Lion Plaza,Mumbai";
		phoneNumber = "+917128623410";
	}

	void displayPrimaryInfo(){
		System.out.println("First Name is:"+ firstName);
		System.out.println("Last Name is:"+ lastName);
		System.out.println("Employee Id is:"+ empId);
		System.out.println("Manager ID is:"+ managerId);
	} 

	void displayOtherInfo(){
		System.out.println("Address is:"+ address);
		System.out.println("PhoneNumber is:"+ phoneNumber);
	}

	void displayAllInfo(){
		System.out.println("First Name is:"+ firstName);
		System.out.println("Last Name is:"+ lastName);
		System.out.println("Employee Id is:"+ empId);
		System.out.println("Manager ID is:"+ managerId);
		System.out.println("Address is:"+ address);
		System.out.println("PhoneNumber is:"+ phoneNumber);
	}

	public static void main(String[] args){
		EmployeeDetail employeedetail = new EmployeeDetail();
		employeedetail.updatePrimaryInfo();
		employeedetail.updateSecondaryInfo();
		employeedetail.displayPrimaryInfo();
		employeedetail.displayOtherInfo();
		employeedetail.displayAllInfo();	
	}
}