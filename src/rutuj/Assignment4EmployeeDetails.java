package rutuj;

public class Assignment4EmployeeDetails {
	
	String firstName;
	String lastName;
	int managerId;
	int empId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo()
	{
		firstName = "Rutuj";
		lastName = "Farande";
		empId = 0123;
		managerId = 55555;	
		
	}
	void updateSeconderyMethod()
	{
		address = "pune";
		phoneNumber = "8888888888";
	}
	void displayPrimaryInfo()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
		
	}
	void displayOtherInfo()
	{
		System.out.println(address);
		System.out.println(phoneNumber);
	}
	void displayAllInfo()
	{
		System.out.println("Employee Details");
		System.out.println("First NAme -"+ firstName);
		System.out.println("Last Name -" + lastName);
		System.out.println("Employee Id -" +empId);
		System.out.println("Manager Id -" + managerId);
		System.out.println("Employee Address - "+address);
		System.out.println("Phone Number - " + phoneNumber);
	}
	
	public static void main(String[] args)
	{
		Assignment4EmployeeDetails ex5 = new Assignment4EmployeeDetails();
		ex5.updatePrimaryInfo();
		ex5.updateSeconderyMethod();
		ex5.displayPrimaryInfo();
		ex5.displayOtherInfo();
		ex5.displayAllInfo();
		
	}
}
