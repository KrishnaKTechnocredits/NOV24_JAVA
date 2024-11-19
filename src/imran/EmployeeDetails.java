package imran;
// Assignment :7

public class EmployeeDetails {

	String firstName,lastName,address,phone_no;
	int empId,managerId;
	
	void updatePrimaryInfo(String fName,String lName,int eId, int mngId)
	{
		firstName= fName;
		lastName= lName;
		empId = eId;
		managerId= mngId;
	}
	
	void updateSecondaryInfo(String add, String phn)
	{
		address= add;
		phone_no= phn;
	}
	
	void displayPrimaryInfo()
	{
		System.out.println(" The Primary Information are as Follows");
		System.out.println("The First Name is "+ firstName);
		System.out.println("The lastname is "+ lastName);
		System.out.println("Employee id is"+ empId);
		System.out.println("Manager id is "+ managerId);
	}
	void displaySecondaryInfo()
	{
		System.out.println("The Primary Information are as Follows");
		System.out.println("The Address is "+address);
		System.out.println("The phone no is "+ phone_no);
	}
	
	void displayAllInfo()
	{
		System.out.println(" The Overall Information are as Follows");
		System.out.println("The First Name is "+ firstName);
		System.out.println("The lastname is "+ lastName);
		System.out.println("Employee id is"+ empId);
		System.out.println("Manager id is "+ managerId);
		System.out.println("The Address is "+address);
		System.out.println("The phone no is "+ phone_no);
	}
	
	public static void main(String[] args) {
		EmployeeDetails employeeDetails1 = new EmployeeDetails();
		employeeDetails1.updatePrimaryInfo("Imran", "Ansari", 1001,101);
		employeeDetails1.updateSecondaryInfo("Nazeerabad","9876543210");
		employeeDetails1.displayPrimaryInfo();
		employeeDetails1.displaySecondaryInfo();
		employeeDetails1.displayAllInfo();
	}
	
}
