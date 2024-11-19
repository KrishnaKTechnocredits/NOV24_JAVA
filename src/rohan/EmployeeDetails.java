package rohan;
public class EmployeeDetails {
	String FirstName,lastName,Address,PhoneNumber ;
	int empID,managerId ;
	
	void updatePrimaryInfo(String Firstname , String lastName , int empId , int managerID){
		this.FirstName = Firstname;
		this.lastName = lastName;
		this.empID = empId;
		this.managerId = managerID;
	}
	void updateSecondaryInfo(String Address,String PhoneNumber){
		this.Address = Address;
		this.PhoneNumber = PhoneNumber ;
	}
	void displayPrimaryInfo(){
		System.out.println("Firstname is = "+FirstName);
		System.out.println("lastname is = "+lastName);
		System.out.println("empID is = "+empID);
		System.out.println("managerId is = "+managerId);
	}
	void displayOthetInfo(){
		System.out.println("Address is = "+Address);
		System.out.println("Phone number is = "+PhoneNumber);	
	}
	void allInfo(){
		System.out.println("Full name is "+FirstName+" "+lastName);
		System.out.println("Given EmpId is "+empID);
		System.out.println("Given ManagerId is "+managerId);
		System.out.println("Given Address is "+Address);
		System.out.println("PhoneNumber is "+PhoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo("Tanish","Patel",200,101);
		employeeDetails.updateSecondaryInfo("Solapur","9922445533");
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOthetInfo();
		System.out.println("-----------");
		employeeDetails.allInfo();
	}
}
