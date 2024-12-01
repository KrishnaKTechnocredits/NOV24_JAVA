package pankaj.NotepadAssignment;

public class Assignment04 
{
		String firstNames ;
		String lastNames;
		int empId;
		int managerId;
		String address;
		String phoneNumber;
		
		void updatePrimaryInfo()
		{
				 firstNames="Pankaj";
				 lastNames= "Patil";
				 empId=002;
				 managerId=200;
				
		}
		
		void updateSecondaryInfo()
		{
			address="Pune";
			phoneNumber="+91-9860505629";
			
		}
		
		void displayPrimaryInfo()
		{
			System.out.println("Employee Name==>>" + " " + firstNames + " " + lastNames);
		//	System.out.println("LastName     ==>>"+ lastNames);
			System.out.println("Emp_id       ==>>"+ " " + empId);
			System.out.println("ManagerId    ==>>"+ " " + managerId);
		}
		
		void otherInfo()
		{
			System.out.println("----------Other Info-------------");
			System.out.println("Address    ==>>" + " " + address);
			System.out.println("PhoneNumber==>>" + " " + phoneNumber);
			System.out.println("---------------------------------");
			
		}
		
		void displayAllInfo()
		{
			System.out.println("Employee Name==>>" + " " +firstNames+ " "  + lastNames);
			//System.out.println("LastName   ==>>" + " " lastNames);
			System.out.println("Emp_id       ==>>" + " " +empId);
			System.out.println("ManagerId    ==>>" + " " +managerId);
			System.out.println("Address      ==>>" + " " +address);
			System.out.println("PhoneNumber  ==>>" + " " +phoneNumber);
		}
		
		public static void main(String[] args)
		{
			Assignment04 employeedetails=new Assignment04();
			employeedetails.updatePrimaryInfo();
			employeedetails.updateSecondaryInfo();
			employeedetails.displayPrimaryInfo();
			employeedetails.otherInfo();
			employeedetails.displayAllInfo();
			
			
		}
}



