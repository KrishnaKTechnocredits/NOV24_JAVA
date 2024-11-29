package pranita;

class NewEmployeeDetailsAss_6{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String mobileNumber;
	
	void updatePrimaryInfo( String firstName,String lastName,int empId,int manageId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.managerId = managerId;
	}
	
	void updateSecondaryInfo(String address,String mobileNumber){
		this.address = address;
		this.mobileNumber = mobileNumber;
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
		NewEmployeeDetailsAss_6 emp = new NewEmployeeDetailsAss_6();
		emp.updatePrimaryInfo("Pranita","Hange",101,1022);
		emp.updateSecondaryInfo("Pune","+918408026615");
		emp.displayPrimaryInfo();
		emp.displayOtherInfo();
		emp.displayAllInfo();
	}
		
		
		
}