package fazrana.oldPac;

public class Assignment7EmployeeDetails {
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(String firstName,String lastName,int empId,int managerId) {
		this.firstName=firstName;
		this.lastName=firstName;
		this.empId =empId;
		this.managerId= managerId;
	}
	
	void updateSecondaryInfo(String address,String phoneNumber) {
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	void displayPrimaryInfo() {
		System.out.println("Primary information-");
		System.out.println("Name of the person is " + firstName + lastName);
		System.out.println("EmployID is " + empId);
		System.out.println("ManagerID is " + managerId);
		System.out.println();
	}
	
	void displayOtherInfo() {
		System.out.println("Secondary information-");
		System.out.println("EmployID is " + address);
		System.out.println("ManagerID is " + phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo() {
		System.out.println("Name of the person is " + firstName + lastName);
		System.out.println("EmployID is " + empId);
		System.out.println("ManagerID is " + managerId);
		System.out.println("EmployID is " + address);
		System.out.println("ManagerID is " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Assignment7EmployeeDetails employeeDetails=new Assignment7EmployeeDetails();
		employeeDetails.updatePrimaryInfo("Fazrana","Parween",123,987);
		employeeDetails.updateSecondaryInfo("Mahalunge","+91-1234567890");
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}
}
