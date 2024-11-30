package fazrana.oldPac;

public class Assignment4EmployeeDetails {
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="Fazrana";
		lastName="Parween";
		empId=123;
		managerId= 987;
	}
	
	void updateSecondaryInfo(){
		address="Mahalunge";
		phoneNumber= "+91-9876543210";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Primary information-");
		System.out.println("Name of the Employee: " + firstName + lastName);
		System.out.println("Employee ID: " + empId);
		System.out.println("Manager ID: " + managerId);
		System.out.println();
	}
	
	void displayOtherInfo(){
		System.out.println("Additional information--");
		System.out.println("Address of Employee: " + address);
		System.out.println("Phone Number of Employee: " + phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo(){
		System.out.println("Full information-");
		System.out.println("Name of the Employee: " + firstName + lastName);
		System.out.println("Employee ID: " + empId);
		System.out.println("Manager ID: " + managerId);
		System.out.println("Address of Employee: " + address);
		System.out.println("Phone Number of Employee: " + phoneNumber);
	}
	
	public static void main(String[] args){
		Assignment4EmployeeDetails employeeDetails= new Assignment4EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}
}
