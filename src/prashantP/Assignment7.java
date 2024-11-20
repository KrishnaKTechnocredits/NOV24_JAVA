package prashantP;



public class Assignment7 {
	String firstName, lastName, address, phoneNumber;
	int employeeId, managerId;
	
	void updatePrimaryInfo(String firstName, String lastName, int employeeId, int managerId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.managerId = managerId;
	}
	
	void updateSecondaryInfo(String address, String phoneNumber) {
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void displayPrimaryInfo(){
		System.out.println("Primary Info-:");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + employeeId);
		System.out.println("Manager ID is: " + managerId);
		
	}

	void displayOtherInfo(){
		System.out.println("Other Info-:");
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		
	}

	void displayAllInfo(){
		System.out.println("All Info-:");
		System.out.println("Employee First Name is: " + firstName);
		System.out.println("Employee Last Name is: " + lastName);
		System.out.println("Employee ID is: " + employeeId);
		System.out.println("Manager ID is: " + managerId);
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber);
		
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.updatePrimaryInfo("Prashant","Pawar",400,986);
		assignment7.updateSecondaryInfo("Pune", "999999999");
		assignment7.displayPrimaryInfo();
		assignment7.displayOtherInfo();
		assignment7.displayAllInfo();
	}
}
