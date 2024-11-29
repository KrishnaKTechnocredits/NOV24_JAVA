package kishor;
//Assignment:-7

public class Assignment7 {
	String firstName , lastName , address, phoneNumber;
	int empId , managerId;
	
	void updatePrimaryInfo(String fName,String lName,int eId,int mId) {
		firstName = fName;
		lastName = lName;
		empId = eId;
		managerId = mId;
	}
	
	void updateSecondaryInfo(String add,String pNumber) {
		address=add;
		phoneNumber = pNumber;
	}
	
	void displayPrimaryInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
		System.out.println("------------------------------------------------------");
	}
	
	void displaySecondaryInfo() {
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println("------------------------------------------------------");
	}
	
	void displayAllInfo() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
		System.out.println(address);
		System.out.println(phoneNumber);
	}

	public static void main(String[] args) {
		Assignment7 employeedetails = new Assignment7();
		employeedetails.updatePrimaryInfo("Kishor","Rhanagdale",123,321);
		employeedetails.updateSecondaryInfo("Gondia", "+91-7666472789");
		employeedetails.displayPrimaryInfo();
		employeedetails.displaySecondaryInfo();
		employeedetails.displayAllInfo();
	}
	
	
}
