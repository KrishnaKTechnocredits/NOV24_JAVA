package rushikesh;

public class EmployeeDetails {
	
	String firstName,lastName,address,phoneNumber;
	int empId,managerId;
	
	void updatePrimaryInfo(String firstName, String lastName,int empId,int managerId ) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.empId=empId;
		this.managerId=managerId;
	}
	
	void updateSecondaryInfo(String address,String phoneNumber) {
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	void  displayPrimaryInfo() {
		System.out.println("Display Primary Info of Employee-");
		System.out.println("Firstname="+firstName);
		System.out.println("Lastname="+lastName);
		System.out.println("Employee-Id="+empId);
		System.out.println("Manager-Id="+managerId);
		System.out.println("");
		displayOtherInfo();
		displayAllInfo();
	}
	
	void displayOtherInfo() {
		System.out.println("Display OtherInfo of Employee-");
		System.out.println("Employee address="+address);
		System.out.println("Employee phonenumber="+phoneNumber);
		System.out.println("");
	}
	
	void displayAllInfo() {
		System.out.println("Display AllInfo of Employee-");
		System.out.println("Firstname="+firstName);
		System.out.println("Lastname="+lastName);
		System.out.println("Employee-Id="+empId);
		System.out.println("Manager-Id="+managerId);
		System.out.println("Employee address="+address);
		System.out.println("Employee phonenumber="+phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails();
		employee.updatePrimaryInfo("Rushikesh","kapare",1011,1012);
		employee.updateSecondaryInfo("Pune","+91-8308215351");
		employee.displayPrimaryInfo();
	}

}
