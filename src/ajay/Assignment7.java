package ajay;

class EmployeeDetailsPrint{
	
	String firstName;
	String lastName;
	int empId;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(String fname,String lName, int eId, int mngID){
		
		firstName=fname;
		lastName=lName;
		empId=eId;
		managerID=mngID;
	}
	void updateSecondaryInfo(String add, String phNo){
		
		address=add;
		phoneNumber=phNo;
	}
	void displayPrimaryInfo(){
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("EMPLOYEE PRIMARY DETAILS");
		System.out.println("Employee Name is = " +firstName +" " +lastName);
		System.out.println("Employee ID is ="+empId);
		System.out.println("Manager ID is ="+managerID);
	}
	void displayOtherInfo(){
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("EMPLOYEE OTHER DETAILS");
		System.out.println("Employee Address is ="+address);
		System.out.println("Employee Phone Number is ="+phoneNumber);
	}
	void displayAllInfo(){
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("Employee Name is = " +firstName +" " +lastName);
		System.out.println("Employee ID is ="+empId);
		System.out.println("Manager ID is ="+managerID);
		System.out.println("Employee Address is ="+address);
		System.out.println("Employee Phone Number is ="+phoneNumber);
	}
	public static void main(String[] args){
		EmployeeDetailsPrint employeedetails=new EmployeeDetailsPrint();
		employeedetails.updatePrimaryInfo("Ajay", "Pagar", 37, 20);
		employeedetails.updateSecondaryInfo("Near Karve Statue Kothrud", "+91-9889877877");
		employeedetails.displayPrimaryInfo();
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();
	}
}