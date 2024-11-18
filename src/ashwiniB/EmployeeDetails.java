package ashwiniB;

class  EmployeeDetails{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="Ashwini";
		lastName="Bhuskat";
		empId=5678;
		managerId=123;
	}
	
	void updateSecondaryInfo(){
		address = "KBC Society,Pune";
		phoneNumber="+91-9970897898";
	}
	
	void displayPrimaryInfo() {
		System.out.println("Primary Information of Employee...");
		System.out.println("First name is  "+firstName);
		System.out.println("Last Name is "+lastName);
		System.out.println("Employee Id is "+empId);
		System.out.println("Manager ID is "+managerId);
	}
	void  displayOtherInfo(){
			System.out.println("Other Information of Employee...");
			System.out.println("Employee address is "+address);
			System.out.println("Employee phoneNumber is  "+phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("All Information of Employee...");
		System.out.println("First name is  "+firstName);
		System.out.println("Last Name is "+lastName);
		System.out.println("Employee Id is "+empId);
		System.out.println("Manager ID is "+managerId);
		System.out.println("Employee address is "+address);
		System.out.println("Employee phoneNumber is  "+phoneNumber);
	}
	public static void main(String[] args){
		 EmployeeDetails employeeDetails = new  EmployeeDetails();
		 employeeDetails.updatePrimaryInfo();
		 employeeDetails.updateSecondaryInfo();
		 employeeDetails.displayPrimaryInfo();
		 employeeDetails.displayOtherInfo();
		 employeeDetails.displayAllInfo();
	}
}