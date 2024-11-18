package NishitP;

class EmployeeDetail
{
	String firstName;
	String lastName;
	int employeeID;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(String fName, String lName, int id, int mngID)
	{
		firstName = fName;
		lastName = lName;
		employeeID = id;
		managerID = mngID;
	}
	
	void updateSecondaryInfo(String address, String phoneNumber)
	{
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void displayPrimaryInfo()
	{
		System.out.println("First name is: " + firstName);
		System.out.println("Last name is: " + lastName);
		System.out.println("Employee ID is: " + employeeID);
		System.out.println("Manager ID is: " + managerID);
		System.out.println("\n");
	}
	
	void displaySecondaryInfo()
	{
		System.out.println("Address is: " + address);
		System.out.println("Phone number is: " + phoneNumber);
		System.out.println("\n");
	}
	
	void displayAllInfo()
	{
		System.out.println("First name is: " + firstName);
		System.out.println("Last name is: " + lastName);
		System.out.println("Employee ID is: " + employeeID);
		System.out.println("Manager ID is: " + managerID);
		System.out.println("Address is: " + address);
		System.out.println("Phone number is: " + phoneNumber);
	}
	
	public static void main(String[] args)
	{
		EmployeeDetail employeeDetail = new EmployeeDetail();
		employeeDetail.updatePrimaryInfo("Nishit", "Ladani", 001, 111);
		employeeDetail.updateSecondaryInfo("XYZ ABC", "+91-9999999999");
		employeeDetail.displayPrimaryInfo();
		employeeDetail.displaySecondaryInfo();
		employeeDetail.displayAllInfo();
	}
}