package prashantP;
class EmployeeDetails{
	String firstName="Prashant";
	String lastName="Pawar";
	String address="ABC";
	int empId=101;
	int managerId=1;
	String phoneNumber="+91-9765463742";
	
	void updatePrimaryInfo(){
		firstName="Sachin";
		lastName="Patil";
		empId=102;
		managerId=200;
	}
	
	void updateSecondaryInfo(){
		address="PQR";
		phoneNumber="+91-898765653";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Employee first name is-:"+firstName);
		System.out.println("Employee last name is-:"+lastName);
		System.out.println("Employee empId is-:"+empId);
		System.out.println("Employee managerId is-:"+managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("Employee address is-:"+address);
		System.out.println("Employee phoneNumber is-:"+phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Employee first name is-:"+firstName);
		System.out.println("Employee last name is-:"+lastName);
		System.out.println("Employee empId is-:"+empId);
		System.out.println("Employee managerId is-:"+managerId);
		System.out.println("Employee address is-:"+address);
		System.out.println("Employee phoneNumber is-:"+phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeedetails=new EmployeeDetails();
		employeedetails.updatePrimaryInfo();
		employeedetails.updateSecondaryInfo();
		employeedetails.displayPrimaryInfo();
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
	}
}	