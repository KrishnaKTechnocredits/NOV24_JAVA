package nitishM;

public class EmployeeDetails {
	String firstName, lastName,address,phoneNumber;
	int empId,managerId;
	
	void updatePrimaryInfo(String fName,String lName,int id, int mgrId) {
		firstName = fName;
		lastName = lName;
		empId = id;
		managerId = mgrId;
	}
	
	void updateSecondaryInfo(String addr,String phone) {
		address = addr;
		phoneNumber = phone;
	}
	
	void displayPrimaryInfo() {
		System.out.println("Employee First Name is "+firstName);
		System.out.println("Employee Second Name is "+lastName);
		System.out.println("Employee Id is "+empId);
		System.out.println("Manager's Id is "+managerId);
	}
	void displaySecondaryInfo() {
		System.out.println("Employee Address is "+address);
		System.out.println("Employee phoneNumber is "+phoneNumber);
	}
	
	void displayAllInfo() {
		displayPrimaryInfo();
		displaySecondaryInfo();
	}
	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo("Nitish","Mehta",1001, 11001);
		employeeDetails.updateSecondaryInfo("Delhi","+9112334455");
		System.out.println("\nPrimary Information");
		employeeDetails.displayPrimaryInfo();
		System.out.println("\nSecondary Information");
		employeeDetails.displaySecondaryInfo();
		System.out.println("\nComplete Information");
		employeeDetails.displayAllInfo();

	}

}
