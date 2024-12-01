package pankaj.NotepadAssignment;

public class Assignment07 
{
	String firstName;
	String lastName;
	int emp_id;
	int manager_id;
	String address;
	String Phone_number;
	
	void updatePrimaryInfo(String fname,String lname,int eid,int mid)
	{
		firstName=fname;
		lastName=lname;
		emp_id=eid;
		manager_id=mid;
		
	}
	void updatesecondaryInfo(String add,String ph_no)
	{
		address=add;
		Phone_number=ph_no;
	}
	void displayPrimaryInfo()
	{
		System.out.println("---------------Primary Info--------------");
		System.out.println("First name of the Employee==>>" + " " +firstName);
		System.out.println("Last name of the Employee ==>>" + " "  +lastName);
		System.out.println("Employee id               ==>>"+ " "  +emp_id);
		System.out.println("Manager id                ==>>"+ " " +manager_id);
		System.out.println("-----------------------------------------");
	}
	void displayOtherinfo()
	{
		System.out.println("---------------Secondary Info--------------");
		System.out.println("The Address of the Employee==>>"+ " "+address);
		System.out.println("The Phone Number of the Emp==>>"+ " "+Phone_number);
		System.out.println("-----------------------------------------");


	}
	void displayallInfo()
	{
		System.out.println("-------------------------------------------");
		System.out.println("First name of the Employee==>>"+ " "+firstName);
		System.out.println("Last name of the Employee ==>>"+ " "+lastName);
		System.out.println("Employee id               ==>>"+ " "+emp_id);
		System.out.println("Manager id                ==>>"+ " "+manager_id);
		System.out.println("The Address of the Employee==>>"+ " "+address);
		System.out.println("The Phone Number of the Emp==>>"+ " "+Phone_number);
		System.out.println("-------------------------------------------");

	}
	public static void main(String[] args) 
	{
		Assignment07 empdetails=new Assignment07();
		empdetails.updatePrimaryInfo("Pankaj","Patil",001,467);
		empdetails.updatesecondaryInfo("Jalgaon","[+91-9860505629]");
		empdetails.displayPrimaryInfo();
		empdetails.displayOtherinfo();
		empdetails.displayallInfo();
		
	
		
	}

}
