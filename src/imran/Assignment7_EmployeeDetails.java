package imran;

public class Assignment7_EmployeeDetails {
	
	String firstname, lastname, address, phone_no;
	int empid, managerid;
	
	void updatePrimaryInfo(String fname, String lname, int id, int mngid)
	{
		firstname = fname;
		lastname = lname;
		empid = id;
		managerid= mngid;
	}
	
	void updateSecondaryInfo(String add, String phn)
	{
		address = add;
		phone_no = phn;
	}
	
	void displayPrimaryInfo()
	{
		System.out.println(" The Primary information are as Follows");
		System.out.println(" The First name is " +firstname);
		System.out.println(" The Last name is " +lastname);
		System.out.println(" The Empid is " +empid);
		System.out.println(" The managerId is " +managerid);
	}
	
	void displayOtherInfo()
	{
		System.out.println(" The Other information are as Follows");
		System.out.println(" The Address is " +address);
		System.out.println(" The Phone number is " +phone_no);
	}	
	
	void displayAllInfo()
	{
		System.out.println(" The Overall information are as Follows");
		System.out.println(" The First name is " +firstname);
		System.out.println(" The Last name is " +lastname);
		System.out.println(" The Empid is " +empid);
		System.out.println(" The managerId is " +managerid);
		System.out.println(" The Address is " +address);
		System.out.println(" The Phone number is " +phone_no);
	}
	
	public static void main(String[] args) {
		Assignment7_EmployeeDetails assignment7_EmployeeDetails_1 = new Assignment7_EmployeeDetails();
		assignment7_EmployeeDetails_1.updatePrimaryInfo("Imran","Ansari",1001,101);
		assignment7_EmployeeDetails_1.updateSecondaryInfo("Nazeerabad","9876543210");
		assignment7_EmployeeDetails_1.displayPrimaryInfo();
		assignment7_EmployeeDetails_1.displayOtherInfo();
		assignment7_EmployeeDetails_1.displayAllInfo();
	}
}
