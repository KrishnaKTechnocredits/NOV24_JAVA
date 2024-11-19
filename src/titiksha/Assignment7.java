package titiksha;

public class Assignment7 {
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phonenumber;
	
	void updatePrimaryInfo(String fname ,String lname,int empid,int mid) {
		firstName=fname;
		lastName=lname;
		empId=empid;
		managerId=mid;
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
		Assignment7 assignment7=new Assignment7();
		assignment7.updatePrimaryInfo("titiksha","goel",1684386,190876);
		assignment7.updateSecondaryInfo("Delhi","+91-8744007329");
		assignment7.displayAllInfo();
		
	}
}
