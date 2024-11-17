package rajashreeA;
class EmployeeDetails{
	
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(String fName,String lName,int x,int y){
		firstName = fName;
		lastName = lName;
		empId = x;
		managerId = y;
	}
	
	void updateOtherInfo(String eaddress,String ephonenumber){
		address = eaddress;
		phoneNumber = ephonenumber;
	}
	
	void displayPrimaryInfo(){
		System.out.println("Employee first name is " + firstName);
		System.out.println("Employee last name is " + lastName);
		System.out.println("Employee employee ID is " + empId);
		System.out.println("Employee's manager ID is " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("Employee adress is " + address);
		System.out.println("Employee phone number is " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Employee first name is " + firstName);
		System.out.println("Employee last name is " + lastName);
		System.out.println("Employee employee ID is " + empId);
		System.out.println("Employee's manager ID is " + managerId);
		System.out.println("Employee adress is " + address);
		System.out.println("Employee phone number is " + phoneNumber);
		}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo("Rajashree","Acharya",15,1000);
		employeeDetails.updateOtherInfo("Banglore","9090909090");
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}
}
	
		