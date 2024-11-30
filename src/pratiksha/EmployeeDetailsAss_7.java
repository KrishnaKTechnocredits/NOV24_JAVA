package pratiksha;

public class EmployeeDetailsAss_7 {
	
	String firstName,lastName,address,PhoneNumber;
	int empId,managerId;
	
	void updatePrimaryInfo(String firstName,String lastName,int empId,int managerId) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.empId= empId;
		this.managerId=managerId;
	}
	void updateSecondaryInfo(String address, String PhoneNumber) {
		this.address=address;
		this.PhoneNumber=PhoneNumber;
	}
	void displayPrimaryInfo() {
		System.out.println("First Name is --"+firstName);
		System.out.println("Last Name is --"+lastName);
		System.out.println("Emp Id is --"+empId);
		System.out.println("Manager Id is --"+managerId);
	}
	void displayOtherInfo() {
		System.out.println("Empolyee Address is--" +address);
		System.out.println("Empolyee Phone number is --"+PhoneNumber);
		
	}
	void displayallInfo() {
		System.out.println("Employee Full name --"+firstName+ " " +lastName);
		System.out.println("Emp Id is --"+empId);
		System.out.println("Manager Id is --"+managerId);
		System.out.println("Empolyee Address is--" +address);
		System.out.println("Empolyee Phone number is --"+PhoneNumber);
	}
	public static void main(String[] args) {
		EmployeeDetailsAss_7  E= new EmployeeDetailsAss_7 ();
		E.updatePrimaryInfo("Pratiksha", "Sarode", 121, 223);
		E.updateSecondaryInfo("viman nagar", "+91-7767084542");
		E.displayPrimaryInfo();
		E.displayOtherInfo();
		System.out.println("---------------------");
		E.displayallInfo();
	}
	}

