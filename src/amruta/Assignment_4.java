package amruta;

public class Assignment_4 {
		String firstName;
		String lastName;
		int empId;
		int managerId;
		String address;
		String phoneNumber;
		
		void updatePrimaryInfo(){
			firstName = "Amruta";
			lastName = "Kharat";
			empId = 32810;
			managerId = 6666;
		}
		void updateSecondaryInfo(){
			address = "Pune";
			phoneNumber = "+91-8597641258";
		}
		void displayPrimaryInfo(){
			System.out.println("--------------Displaying primary info--------------");
			System.out.println("First Name is : "+firstName);
			System.out.println("Last Name is : "+lastName);
			System.out.println("Employee Id is : "+empId);
			System.out.println("Manager Id is : "+managerId);
		}
		void displayOtherInfo(){
			System.out.println("--------------Displaying other info--------------");
			System.out.println("Address is : "+address);
			System.out.println("Phone Number is : "+phoneNumber);
		}
		void displayAllInfo(){
			System.out.println("--------------Displaying all info--------------");
			System.out.println("First Name is : "+firstName);
			System.out.println("Last Name is : "+lastName);
			System.out.println("Employee Id is : "+empId);
			System.out.println("Manager Id is : "+managerId);
			System.out.println("Address is : "+address);
			System.out.println("Phone Number is : "+phoneNumber);
		}
		
		public static void main(String[] args){
			Assignment_4 empDetails = new Assignment_4();
			empDetails.updatePrimaryInfo();
			empDetails.updateSecondaryInfo();
			empDetails.displayPrimaryInfo();
			empDetails.displayOtherInfo();
			empDetails.displayAllInfo();
		}
}
