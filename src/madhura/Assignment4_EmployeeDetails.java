package madhura;

public class Assignment4_EmployeeDetails {

		String firstName;
		String lastName;
		int empID;
		int managerID;
		String address;
		String phoneNumber;
		
		void updatePrimaryInfo(){
			firstName = "Sam";
			lastName = "Dsouza";
			empID = 12345;
			managerID = 789654;
		}
		
		void updateSecondaryInfo(){
			address = "23 fable street New Delhi";
			phoneNumber = "+91-9765463742";
		}
		
		void displayPrimaryInfo(){
			System.out.println("First Name is " +firstName);
			System.out.println("Last Name is " +lastName);
			System.out.println("EmpID is " +empID);
			System.out.println("ManagerID is " +managerID);
		}
		
		void displayOtherInfo(){
			System.out.println("\nAddress is "+address);
			System.out.println("Phone number is "+phoneNumber);
		}
		
		void displayAllInfo(){
			System.out.println("\nFirst Name is " +firstName);
			System.out.println("Last Name is " +lastName);
			System.out.println("EmpID is " +empID);
			System.out.println("ManagerID is " +managerID);
			System.out.println("Address is "+address);
			System.out.println("Phone number is "+phoneNumber);
		}
		
		public static void main (String [] args){
			Assignment4_EmployeeDetails empdetails = new Assignment4_EmployeeDetails();
			empdetails.updatePrimaryInfo();
			empdetails.updateSecondaryInfo();
			empdetails.displayPrimaryInfo();
			empdetails.displayOtherInfo();
			empdetails.displayAllInfo();
		}
	}
