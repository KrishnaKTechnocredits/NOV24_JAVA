package pratik;

public class PgAssignment7 {

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phonenumber;

	void updatePrimaryInfo(String fname, String lname, int empid, int mgid) {
		firstName = fname;
		lastName = lname;
		empId = empid;
		managerId = mgid;
	}

	void updateSecondaryInfo(String add, String pno) {
		address = add;
		phonenumber = pno;
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

	void displayInfo() {
		displayPrimaryInfo();
		displaySeconadryInfo();

	}

	public static void main(String[] args) {
		PgAssignment7 a = new PgAssignment7();
		a.updatePrimaryInfo("Pratik", "Gaikwad", 156834, 987432);
		a.updateSecondaryInfo("Pune", "0983523233");
		a.displayInfo();

	}
}
