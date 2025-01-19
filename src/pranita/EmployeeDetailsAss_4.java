package pranita;

class EmployeeDetailsAss_4{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String mobileNumber;
	
	void updatePrimaryInfo(){
		firstName = "Pranita";
		lastName = "Hange";
		empId = 1;
		managerId = 101;
	}
	
	void updateSecondaryInfo(){
		address = "Pune";
		mobileNumber ="+918408026615";
	}
	
	void displayPrimaryInfo(){
		System.out.println("PrimaryInfo");
		System.out.println("firstName is " + firstName);
		System.out.println("lastName is " + lastName);
		System.out.println("empId is " + empId);
		System.out.println("managerId " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("address is " + address);
		System.out.println("mobileNumber is " + mobileNumber);
	}
	
	void displayAllInfo(){
		System.out.println("EmployeeDetails");
		System.out.println("firstName is " + firstName);
		System.out.println("lastName is " + lastName);
		System.out.println("empId is " + empId);
		System.out.println("managerId " + managerId);
		System.out.println("address is " + address);
		System.out.println("mobileNumber is " + mobileNumber);
	}
	
	public static void main (String[]args){
		EmployeeDetailsAss_4 emp = new EmployeeDetailsAss_4();
		emp.updatePrimaryInfo();
		emp.updateSecondaryInfo();
		emp.displayPrimaryInfo();
		emp.displayOtherInfo();
		emp.displayAllInfo();
	}	
}
	
	