package prem;

public class EmployeeDetails {
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
		
	void updatePrimaryInfo(String firstName,String lastName,int empId, int managerId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.managerId = managerId;
	}	
	void updateSecondaryInfo(String address, String phoneNumber){
		this.address	= address;
		this.phoneNumber = phoneNumber;
	}	
	void displayPrimaryInfo(){
		System.out.println("First name :" + firstName);
	    System.out.println("Last name :" + lastName);
		System.out.println("Employee ID :" + empId);
		System.out.println("Manager ID :" + managerId);
	}
	void displayOtherInfo(){
		System.out.println("Address :" + address);
		System.out.println("Adress :" + phoneNumber);
	}
	void displayAllInfo(){
		displayPrimaryInfo();
	    displayOtherInfo();
	}
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo("Prem Lata","Gupta",1234,56789);
		employeeDetails.updateSecondaryInfo("XYZ","+91-9765463742");
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}	
}
