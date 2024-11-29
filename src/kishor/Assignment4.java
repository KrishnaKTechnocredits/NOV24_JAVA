package kishor;

public class Assignment4 {
		String firstName;
		String lastName;
		int empId;
		int managerId;
		String address;
		String phoneNumber;
		
		void updatePrimaryInfo(){
			firstName = "Kishor";
			lastName = "Rahangdale";
			empId = 1234;
			managerId = 4321;
		}
		
		void updateSecondaryInfo(){
			address ="pune";
			phoneNumber="+91-7666472908";
		}
		
		void displayPrimaryInfo(){
			System.out.println("------------------------------------------");
			System.out.println("First name of candidate is " + firstName);
			System.out.println("Last name of candidate is " + lastName);
			System.out.println("Employee id of candidate is " + empId);
			System.out.println("Manager id of candidate is " + managerId);
		}
		
		void displaySecondaryInfo(){
			System.out.println("------------------------------------------");
			System.out.println("Adress of the employee is " + address);
			System.out.println("Contact number of employee is " + phoneNumber);
		}
		
		void displayAllInfo(){
			System.out.println("------------------------------------------");
			System.out.println("First name of candidate is " + firstName);
			System.out.println("Last name of candidate is " + lastName);
			System.out.println("Employee id of candidate is " + empId);
			System.out.println("Manager id of candidate is " + managerId);
			System.out.println("Adress of the employee is " + address);
			System.out.println("Contact number of employee is " + phoneNumber);
		}
		
		public static void main(String[] args){
			Assignment4 employeedetails = new Assignment4();
			employeedetails.updatePrimaryInfo();
			employeedetails.updateSecondaryInfo();
			employeedetails.displayPrimaryInfo();
			employeedetails.displaySecondaryInfo();
			employeedetails.displayAllInfo();
		}
}
