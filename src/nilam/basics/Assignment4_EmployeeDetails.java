package nilam.basics;

public class Assignment4_EmployeeDetails {
	String firstName="Nilam";
	String lastName="Korade";
	int empId=101;
	int mngId=1001;
	String address="Pune";
	String phNo="9503556650";

	void updatePrimaryInfo(){
		firstName="Nilam";
		lastName="Korade";
		empId=101;
		mngId=1001;
	}

	void updateSecondaryInfo(){
		address="Pune";
		phNo="9503556650";
	}
	
	void displaySecondaryInfo(){
		System.out.println("Phone No."+ phNo);
		System.out.println("Address "+ address);
	}
		
	void displayPrimaryInfo(){
		System.out.println("First Name is " +firstName);
		System.out.println("Last Name is " +lastName);
		System.out.println("Emp ID is " +empId);
		System.out.println("Manager Id is " +mngId);
	}
	
	void displayAllInfo(){
		System.out.println("\n");
		System.out.println("First Name is " +firstName);
		System.out.println("Last Name is " +lastName);
		System.out.println("Emp ID is " +empId);
		System.out.println("Manager Id is " +mngId);
		System.out.println("Phone No. "+ phNo);
		System.out.println("Address "+ address);
	}
	
	public static void main(String[] args){
		Assignment4_EmployeeDetails assignment4_employeedetails= new Assignment4_EmployeeDetails();
		assignment4_employeedetails.updatePrimaryInfo();
		assignment4_employeedetails.updateSecondaryInfo();
		assignment4_employeedetails.displayPrimaryInfo();
		assignment4_employeedetails.displaySecondaryInfo();
		assignment4_employeedetails.displayAllInfo();
	}
}
