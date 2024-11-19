package swapnilH;

public class Assignment7 {
	String firstName,lastName,address,phoneNumber;
	int empId,managerId;
	
	void updatePrimaryInfo(String fname, String lName, int id, int mngId){
		firstName = fname;
		lastName = lName;
		empId = id;
		managerId = mngId;
    }
	void updateSecondaryInfo(String add,String phoneNum) {
		address = add;
		phoneNumber = phoneNum;
	}
	void displayPrimaryInfo() {
		System.out.println("First name is " +firstName);
		System.out.println("lastName name is " +lastName);
		System.out.println("empId name is " +empId);
		System.out.println("managerId name is " +managerId);
	}
	void displayOtherInfo() {
		
		System.out.println("address name is " +address);
		System.out.println("phoneNumber name is " +phoneNumber);
	}
	void displayAllInfo() {
		System.out.println("First name is " +firstName);
		System.out.println("lastName name is " +lastName);
		System.out.println("empId name is " +empId);
		System.out.println("managerId name is " +managerId);
		System.out.println("address name is " +address);
		System.out.println("phoneNumber name is " +phoneNumber);
	}
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.updatePrimaryInfo("swapnil", "hole", 1010, 9);
		System.out.println();
		assignment7.updateSecondaryInfo("pune","+1234567");
		System.out.println();
		assignment7.displayPrimaryInfo();
		System.out.println();
		assignment7.displayOtherInfo();
		System.out.println();
		assignment7.displayAllInfo();
	}
}	