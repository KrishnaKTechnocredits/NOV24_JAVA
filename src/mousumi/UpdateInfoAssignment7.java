package mousumi;

public class UpdateInfoAssignment7 {
		String firstName;
		String lastName;
		int empId;
		int managerId;
		String address;
		String phonenumber;
		
		void updatePrimaryInfo(String fname ,String lname,int empid,int mngrid) {
			firstName=fname;
			lastName=lname;
			empId=empid;
			managerId=mngrid;
		}
		
		void updateSecondaryInfo(String add,String pno) {
			address=add;
			phonenumber=pno;
		}
		
		void displayPrimaryInfo() {
			System.out.println("First name is:" + firstName);
			System.out.println("Last name is:" + lastName);
			System.out.println("Employee id is:" + empId);
			System.out.println("Manager id is:" + managerId);
		}
		
		void displaySeconadryInfo() {
			System.out.println("Emp Address is:" + address);
			System.out.println("Emp phone number is:" + phonenumber);
			}
		
		void displayAllInfo() {
			displayPrimaryInfo();
			displaySeconadryInfo();
			
		}
		
		public static void main(String[] args) {
			UpdateInfoAssignment7 assignment7 = new UpdateInfoAssignment7();
			assignment7.updatePrimaryInfo("Mousumi","Banji",12345,54321);
			assignment7.updateSecondaryInfo("Pune","+91-7751835099");
			assignment7.displayAllInfo();
			
		}
}		
