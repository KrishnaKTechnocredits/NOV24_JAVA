package swapnil;

public class Assignment4 {
		String firstName;
		String lastName;
		int empId;
		int managerId;
		String address;
		String phoneNumber;
		
		void updatePrimaryInfo(){
			firstName = "swapnil";
			lastName = "Hole";
			empId = 101010;
			managerId = 4321;
		}
		void updateSecondaryInfo(){
			address = "pune";
			phoneNumber = "+91-9384756434";	
		}
		void displayPrimaryInfo(){
			System.out.println("firstName is " +firstName);
			System.out.println("lastName is "+lastName);
			System.out.println("EmployeeId is "+empId);
			System.out.println("managerId is "+managerId);
		}
		void displaySecondaryInfo(){
			System.out.println("DisplaySecondaryInfo");
			System.out.println("address is "+address);
			System.out.println("phoneNumber is "+phoneNumber);
		}
		void displayAllInfo(){
			System.out.println("DisplayAllInfo");
			System.out.println("firstName is "+firstName);
			System.out.println("lastName is "+lastName);
			System.out.println("EmployeeId is "+empId);
			System.out.println("managerId is "+managerId);
			System.out.println("address is "+address);
			System.out.println("phoneNumber is "+phoneNumber);
		}
		public static void main(String [] args){
			Assignment4 assignment4 = new Assignment4();
			assignment4.updatePrimaryInfo();
			assignment4.updateSecondaryInfo();
			System.out.println();
			System.out.println("DisplayPrimaryInfo");
			assignment4.displayPrimaryInfo();
			System.out.println();
			assignment4.displaySecondaryInfo();
			System.out.println();
			assignment4.displayAllInfo();
		}
	}


