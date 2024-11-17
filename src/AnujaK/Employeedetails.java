/*Assignment - 7 : 16th Nov'2024 (30 mins) [parameter practice)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

String firstName, lastName, employeeId, managerId;

void updatePrimaryInfo(String fname, String lName, int id, int mngId){
	firstName = fname;
	lastName = lName;
	employeeId = id;
	managerId = mngId;
}
create 5 methods from which 2 methods are parameterized method (1,2).
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl*/

package AnujaK;
class Employeedetails{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	public void updatePrimaryInfo(String name, String lname , int e_id, int m_id ) {
		firstName = name;
		lastName = lname;
		empId = e_id;
		managerId =m_id;	
	}
	
	public void updateSecondaryInfo(String own_address , String number ) {
		address = own_address;
		phoneNumber = number;
	}
	
	public void displayPrimaryInfo() {
		System.out.println("calling primary info:");
		System.out.println("my first name and last name is " +firstName+" "+lastName);
		System.out.println("and my emp id is "+empId+" and manager id is "+managerId);
		System.out.println("----------------------------- \n ");
	}
	
	
	public void displaySecodaryInfo() {
		System.out.println("calling secondary info:");
		System.out.println("my address is " +address);
		System.out.println("and my phoneNumber  is "+phoneNumber);
		System.out.println("----------------------------- \n ");

	}
	
	public void displayAllInfo() {
		System.out.println("calling all info:");
		System.out.println("my first name and last name is " +firstName+" "+lastName);
		System.out.println("and my emp id is "+empId+" and manager id is "+managerId);
		System.out.println("my address is " +address);
		System.out.println("and my phoneNumber  is "+phoneNumber);
		System.out.println("----------------------------- \n ");

	}
	
	public static void main(String [] args) {
		Employeedetails employeedetails = new Employeedetails();
		employeedetails.updatePrimaryInfo("Anuja", "Kannawar", 20, 54);
		employeedetails.updateSecondaryInfo("Pune, viman nagar", "+91 777777777");
		employeedetails.displayPrimaryInfo();
		employeedetails.displaySecodaryInfo();
		employeedetails.displayAllInfo();
		
	}
}

