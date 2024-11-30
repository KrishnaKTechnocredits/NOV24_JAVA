package ashwini;

class EmployeeDetails2_Assignment7{
	String firstName; 
	String lastName; 
	int empId;
	int	managerId;
	String address; 
	String phoneNumber;
	
	void updatePrimaryInfo(String fname, String lName, int id, int mngId){
		firstName = fname;
		lastName = lName;
		empId = id;
		managerId = mngId;
	}
	
	void  updateSecondaryInfo(String add,String phno){
		address=add; 
		phoneNumber=phno;
	}
	
	void displayPrimaryInfo( ) {
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
		EmployeeDetails2_Assignment7 employeeDetails2 = new  EmployeeDetails2_Assignment7();
		 employeeDetails2.updatePrimaryInfo("Ashwini","Bhuskat",1234,5678);
		 employeeDetails2.updateSecondaryInfo("Pune","+91 9011889887");
		 employeeDetails2.displayPrimaryInfo();
		 employeeDetails2.displayOtherInfo();
		 employeeDetails2.displayAllInfo();
	}
	}
