package poojaR;
public class Assignment_7 {
	String firstName, lastName, address, phoneNo;
	int empId, managerId;

	void updatePrimaryInfo(String firstName, String lastName, int id, int mgrId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = id;
		this.managerId = mgrId;
	}

	void updateSecondaryInfo(String address, String phoneNo) {
		this.address = address;
		this.phoneNo = phoneNo;
	}

	void displayPrimaryInfo() {
		System.out.println("Employee First Name = " + firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
	}

	void displayOtherInfo() {
		System.out.println("Employee address = " + address);
		System.out.println("Employee Phone Number = " + phoneNo);
	}

	void displayAllInfo() {
		System.out.println("Employee First Name = " + firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
		System.out.println("Employee address = " + address);
		System.out.println("Employee Phone Number = " + phoneNo);
	}

	public static void main(String[] args) {
		Assignment_7 assignmet_7 = new Assignment_7();
		System.out.println("-----------Employee Details----------");
		assignmet_7.updatePrimaryInfo("Pooja", "Rajguru", 1020, 301);
		assignmet_7.updateSecondaryInfo("Pune", "8180035615");
		assignmet_7.displayPrimaryInfo();
		System.out.println("-------------------------------------");
		assignmet_7.displayOtherInfo();
		System.out.println("-------------------------------------");
		assignmet_7.displayAllInfo();
		System.out.println("-------------------------------------");
	}
}