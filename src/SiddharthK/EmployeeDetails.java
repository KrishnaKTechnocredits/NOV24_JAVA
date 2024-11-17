package SiddharthK;

class EmployeeDetails{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Siddharth";
		lastName = "Kale";
		empId = 1234;
		managerId = 5678;
	}
	
	void updateSecondaryInfo(){
		address = "ABC, Pune";
		phoneNumber = "+91-9999999999";
	}
	
	void displayPrimaryInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
	}
	
	void displayOtherInfo(){
		System.out.println(address);
		System.out.println(phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
		System.out.println(address);
		System.out.println(phoneNumber);
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