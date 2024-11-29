package anuja;
/*Assignment - 4 : 13th Nov'2024 (25 mins)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()*/
public class Assignment4 {

	String firstName;
	String lastName;
	int empId;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo() {
		
		firstName = "Anuja";
		lastName = "Kannawar";
		empId = 1875;
		managerID = 45;

	}
	
	void updateSecondaryInfo() {
		address = "Pune, Viman nagar, 411014";
		phoneNumber = "+91 9552577543" ;
	}
	
	void displayPrimaryInfo() {
		System.out.println("-----------------------------");
		System.out.println("displayPrimaryInfo called \n");
		System.out.println("My name is "+ firstName +" " +lastName +".\n");
	}
	
	void displayOtherInfo() {
		System.out.println("----------------------------");
		System.out.println("displayOtherInfo called \n");
		System.out.println("My emp id is " + empId +" and manager id is " +  managerID + " .\n");
	}
	
	void displayAllInfo() {
		System.out.println("-----------------------------");
		System.out.println("displayAllInfo called \n");		System.out.println("My name is "+ firstName +" " +lastName +".\n");
		System.out.println("My emp id is " + empId +" and manager id is " +  managerID + " .\n");

	}
	
	public static void main(String[] args) {
		Assignment4 assignment4 = new Assignment4();
		assignment4.updatePrimaryInfo();
		assignment4.updateSecondaryInfo();
		assignment4.displayPrimaryInfo();
		assignment4.displayOtherInfo();
		assignment4.displayAllInfo();
	}
}
