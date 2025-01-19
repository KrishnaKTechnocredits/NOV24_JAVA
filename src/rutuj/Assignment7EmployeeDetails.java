package rutuj;

public class Assignment7EmployeeDetails {
	
	String firstName , lastName, Address, phoneNumber ; int empId , managerId;
	
	void updatePrimaryInfo(String fname , String lname , int id , int mid)
	{
		firstName = fname;
		lastName = lname;
		empId = id;
		managerId = mid;
		
	}
	void updateSeconderyInfo(String add , String Number )
	{
		Address = add;
		phoneNumber = Number;
	}
	void displayPrimeryInfo()
	{
		System.out.println("Employee firstName "+firstName);
	    System.out.println("Employee lastName "+ lastName);
	    System.out.println("Employee empId "+ empId);
	    System.out.println("Employee managerId "+ managerId);
	}
	void displayOtherInfo()
	{
		System.out.println("Employee address "+ Address);
		System.out.println("Employee phoneNumber "+ phoneNumber);
	}
	void displayAllInfo()
	{

		System.out.println("Employee firstName "+firstName);
	    System.out.println("Employee lastName "+ lastName);
	    System.out.println("Employee empId "+ empId);
	    System.out.println("Employee managerId "+ managerId);
	    System.out.println("Employee address "+ Address);
		System.out.println("Employee phoneNumber "+ phoneNumber);
	
	}
	public static void main(String[] args)
	{
		Assignment7EmployeeDetails ex1 = new Assignment7EmployeeDetails();
		ex1.updatePrimaryInfo("Rutuj", "Farande",001,1345);
		ex1.updateSeconderyInfo("pune","8888888888" );
		ex1.displayPrimeryInfo();
		ex1.displayOtherInfo();
		ex1.displayAllInfo();
	}
	

}
