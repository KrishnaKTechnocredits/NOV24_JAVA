package RoshanM;

public class EmployeeDetails {
	
	String firstName, lastName,address,phoneNumber;
	int empID,managerId;
	
 
	
	void updatePrimaryInfo(String firstName, String lastName,int empID, int managerId) {
		
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.empID = empID; 
		this.managerId = managerId;
	
	}
	
	void updateSecondaryInfo(String address, String phoneNumber) {
		
		this.address = address; 
		this.phoneNumber = phoneNumber;
		
	}

	void displayPrimaryInfo () {
		
		System.out.println(" First name is " + " " + firstName);
		System.out.println(" Last name is " + " " + lastName);
		System.out.println(" Employee id  is" + " " + empID);
		System.out.println(" Manager ID is" + " " + managerId);	
		System.out.println();

	}
	
	void displayOtherInfo() {
		
		System.out.println(" Address is " + " " + address);
		System.out.println(" Phone Number " + " " + phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo() {
		
		System.out.println(" First name is " + " " + firstName);
		System.out.println(" Employee id  is" +" " + empID);
		System.out.println(" Manager ID is" + "  " + managerId);
		System.out.println(" Address is " + " " + address);
		System.out.println(" Phone Number " + " " + phoneNumber);
		
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.updatePrimaryInfo("Roshan" , "Mokati", 101 ,5000 );
		employeedetails.updateSecondaryInfo("gandi chowk" , "8380827669");
		employeedetails.displayPrimaryInfo(); 
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
	}
}
