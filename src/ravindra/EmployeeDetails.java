//Assignment - 4 : 13th Nov'2024 (25 mins)
//Create a class called EmployeeDetails having following instance variable.
//firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]
//create 5 methods.
//1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
//2) updateSecondaryInfo() -> address, phoneNumber
//3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
//4) displayOtherInfo() -> address, phoneNumber
//5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

package ravindra;
class EmployeeDetails{
	String firstName="Ravindra";
	String lastName="Mule";
	int empId=01;
	int managerId=100;
	String address="Pune";
	String phoneNumber="1234567890";
	
	void updatePrimaryInfo(){
		firstName="Aniket";
		lastName="Bangar";
		empId=01;
		managerId=101;
	}
	
	void updateSecondaryInfo(){
		address="hinjewadi";
		phoneNumber="1136546412";
	}
	
	void displayPrimaryInfo(){
		System.out.println(firstName+":"+lastName+":"+empId+":"+managerId);
	}
	
	void displayOtherInfo(){
		System.out.println(address+":"+phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println(firstName+":"+lastName+":"+empId+":"+managerId+":"+address+":"+phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}
	
}