package rushikesh;

public class Assignment_4 {

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;

	void updateprimaryInfo() {

		firstName = "Rushikesh";
		lastName = "kapare";
		empId = 1010;
		managerId = 1011;
	}

	void updatesecondaryInfo() {
		address = "pune";
		phoneNumber = "+91-8308215351";
	}

	void displayPrimaryInfo() {

		System.out.println("Primary_Info-");
		System.out.println("firstName is " + firstName);
		System.out.println("lastName is " + lastName);
		System.out.println("empId is " + empId);
		System.out.println("managerId is " + managerId);
		System.out.println();
	}

	void displayOtherInfo() {

		System.out.println("Other_Info-");
		System.out.println("address is " + address);
		System.out.println("phoneNumber is " + phoneNumber);
		System.out.println();
	}

	void displayAllInfo() {

		System.out.println("Employee_All_Info-");
		System.out.println("firstName is " + firstName);
		System.out.println("lastName is " + lastName);
		System.out.println("empId is " + empId);
		System.out.println("managerId is " + managerId);
		System.out.println("address is " + address);
		System.out.println("phoneNumber is " + phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_4 assignment_4 = new Assignment_4();
		assignment_4.updateprimaryInfo();
		assignment_4.updatesecondaryInfo();
		assignment_4.displayPrimaryInfo();
		assignment_4.displayOtherInfo();
		assignment_4.displayAllInfo();
	}

}
