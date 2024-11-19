package nishitP;

class EmployeeDetails
{
	String firstName;
	String lastName;
	int employeeID;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo()
	{
		firstName = "Nishit";
		lastName = "Ladani";
		employeeID = 1;
		managerID = 111;
	}
	
	void updateSecondaryInfo()
	{
		address = "Rajkot, Gujarat";
		phoneNumber = "+91-9876543210";
	}
	
	void displayPrimaryInfo()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeID);
		System.out.println(managerID);
		System.out.println("\n");
	}
	
	void displaySecondaryInfo()
	{
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println("\n");
	}
	
	void displayAllInfo()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeID);
		System.out.println(managerID);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println("\n");
	}

	public static void main(String[] args)
	{
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displaySecondaryInfo();
		employeeDetails.displayAllInfo();
	}
}