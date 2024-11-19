package madhura;

public class Assignment7_EmployeeDetails7 {

		String firstName, lastName, address, phoneNumber;
		int empID, managerID;
		
		void updatePrimaryInfo(String firstName, String lastName, int empID, int managerID){
			this.firstName = firstName;
			this.lastName = lastName;
			this.empID = empID;
			this.managerID = managerID;
		}
		
		void updateSecondaryInfo(String address, String phoneNumber){
			this.address = address;
			this.phoneNumber = phoneNumber;
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
			Assignment7_EmployeeDetails7 empdetails7 = new Assignment7_EmployeeDetails7();
			empdetails7.updatePrimaryInfo("Sam", "Dsouza", 12345, 789654);
			empdetails7.updateSecondaryInfo("New Delhi", "+91-9765463742");
			empdetails7.displayPrimaryInfo();
			empdetails7.displayOtherInfo();
			empdetails7.displayAllInfo();
		}
}
