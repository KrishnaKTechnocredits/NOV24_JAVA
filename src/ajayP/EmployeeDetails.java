package ajayP;
/*Create a class callemployeedetails Employeemployeedetailsetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber
*/

class EmployeeDetails{
	String firstName;
	String lastName;
	int empId;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="Ajay";
		lastName="Pagar";
		empId=37;
		managerID=56;
	}
	void updateSecondaryInfo(){
		address="Near West end mall Aundh";
		phoneNumber="+91-8938484388";
	}
	
	void displayPrimaryInfo(){
		System.out.println("EMPLOYEE PRIMARY INFORMATION");
		System.out.println();
		System.out.println("Employee Name is = " +firstName +" " +lastName);
		System.out.println("EmployeeId is = " +empId);
		System.out.println("Employee ManagerID is = " +managerID);
		System.out.println("-------------------------------------------------------------------------------------------");
		
	}
	void displayOtherInfo(){
		System.out.println("EMPLOYEE OTHER INFORMATION");
		System.out.println();
		System.out.println("Employee Address is = " +address);
		System.out.println("Employee PhoenNumber is = " +phoneNumber);
		System.out.println("-------------------------------------------------------------------------------------------");

	}
	
	void displayAllInfo(){
		System.out.println("EMPLOYEE INFORMATION");
		System.out.println();
		System.out.println("Employee Name is = " +firstName +" " +lastName);
		System.out.println("EmployeeId is = " +empId);
		System.out.println("Employee ManagerID is = " +managerID);
		System.out.println("Employee Address is = " +address);
		System.out.println("Employee PhoenNumber is = " +phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeedetails=new EmployeeDetails();
		employeedetails.updatePrimaryInfo();
		employeedetails.updateSecondaryInfo();
		employeedetails.displayPrimaryInfo();
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
	}
}