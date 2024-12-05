package anuja;

/*make parameterised methos for display all info from program assignemtn4.*/
public class Assignment07 {

	String fName;
	String lName;
	int em_Id;
	int mn_ID;
	String address1;
	String phNumber;

	void updatePrimaryInfo(String firstName, String lastName, int employeeID, int managerID) {

		fName = firstName;
		lName = lastName;
		em_Id = employeeID;
		mn_ID = managerID;
	}

	void updateSecondaryInfo(String address, String phoneNumber) {
		address1 = address;
		phNumber = phoneNumber;
	}

	void displayPrimaryInfo() {
		System.out.println("-----------------------------");
		System.out.println("displayPrimaryInfo called \n");
		System.out.println("My name is " + fName + " " + lName + ".\n");
		System.out.println("My emp id is " + em_Id + " and manager id is " + mn_ID + " .\n");
	}

	void displayOtherInfo() {
		System.out.println("----------------------------");
		System.out.println("displayOtherInfo called \n");
		System.out.println("Address is " + address1 + " and phone number is " + phNumber + ".\n");
	}

	void displayAllInfo() {
		System.out.println("-----------------------------");
		System.out.println("displayAllInfo called \n");		
		System.out.println("My name is "+ fName +" " +lName +".\n");
		System.out.println("My emp id is " + em_Id +" and manager id is " +  mn_ID + " .\n");
		System.out.println("Address is "+address1+ " and phone number is "+phNumber+ ".\n");

	}

	public static void main(String[] args) {
		Assignment07 assignment07 = new Assignment07();
		assignment07.updatePrimaryInfo("Anuja", "Paikrao", 20, 54);
		assignment07.updateSecondaryInfo("Pune Viman nagar", "+91 9552577543");
		assignment07.displayPrimaryInfo();
		assignment07.displayOtherInfo();
		assignment07.displayAllInfo();
	}
}
