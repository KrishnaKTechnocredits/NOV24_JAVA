package mahesh;

class EmployeeDetails {

	String firstName;
	String lastName;
	int employeeid;
	int managerid;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
	
		firstName = "Gangadhar";
		lastName = "Shaktiman";
		employeeid = 23245;
		managerid = 12345;
	}

	void updateSecondaryInfo() {

		address = "M G Road, Pune";
		phoneNumber = "+91-8888888888";
	}

	void dispayPrimaryInfo() {
		
		System.out.println("Emp First Name is " +firstName);
		System.out.println("Emp Last Name is " +lastName);
		System.out.println("Emp Id is " +employeeid);
		System.out.println("Manager Id is "+managerid);
		System.out.println("-----------------------------------");
	}
	
	void dispayOtherInfo() {

		System.out.println("Emp First Address is " +address);
		System.out.println("Emp Phone Number is " +phoneNumber);
		System.out.println("-----------------------------------");
	}
	
	void dispayAllInfo() {
		
		System.out.println("Emp First Name is " +firstName);
		System.out.println("Emp Last Name is " +lastName);
		System.out.println("Emp Id is " +employeeid);
		System.out.println("Manager Id is "+managerid);
		System.out.println("Emp First Address is " +address);
		System.out.println("Emp Phone Number is " +phoneNumber);
	}	
	
	public static void main(String[] args) {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.dispayPrimaryInfo();
		employeeDetails.dispayOtherInfo();
		employeeDetails.dispayAllInfo();
	}
		
}