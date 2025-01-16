/*
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

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl
}
 */
package nitesh.basicprogram;


class EmployeeDetails1{
	String firstName = "Pappu"; 
	String lastName = "Kangi";
	int empId = 456;
	int managerId = 789;
	String address = "420, Prem Galli ,Gulf";
	String phoneNumber = "+918734567730";

	void updatePrimaryInfo(String fname, String lName, int id , int mngId){
		System.out.println("FirstName before update :"+" "+ firstName);
		System.out.println("Lastname before update:"+" "+ lastName);
		System.out.println("Employee Id Before update:"+" "+ empId);
		System.out.println("Manager ID Before update:"+" "+ managerId);
		System.out.println("Adddress before Update:"+" "+ address);
		System.out.println("Phonenumber Before Update:"+" "+ phoneNumber);

		firstName = fname;
		lastName = lName;
		empId = id;
		managerId = mngId;
	}

	void updateSecondaryInfo(String Adds, String Pnum ){
		address = Adds;
		phoneNumber = Pnum;
	}

	void displayPrimaryInfo(){
		System.out.println("Updated firstName is:"+" "+ firstName);
		System.out.println("Updated LastName is:"+" "+ lastName);
		System.out.println("Updated Employee Id is:"+" "+ empId);
		System.out.println("Updated ManagerId is:"+" "+ managerId);
	}

	void displayOtherInfo(){
		System.out.println("Updated Address is:"+" "+ address);
		System.out.println("Updated Phonenumber is:"+" "+ phoneNumber);
	}

	void displayAllInfo(){
		System.out.println("Updated firstName is:"+" "+ firstName);
		System.out.println("Updated LastName is:"+" "+ lastName);
		System.out.println("Updated Employee Id is:"+" "+ empId);
		System.out.println("Updated ManagerId is:"+" "+ managerId);
		System.out.println("Updated Address is:"+" "+ address);
		System.out.println("Updated Phonenumber is:"+" "+ phoneNumber);
	}
	public static void main(String[] args){
		EmployeeDetails1 employeedetails1 = new EmployeeDetails1();
		employeedetails1.updatePrimaryInfo("Nitesh","Shukla",456,123);
		employeedetails1.updateSecondaryInfo("307 Libra Life,Indore","+918421882621");
		employeedetails1.displayPrimaryInfo();
		employeedetails1.displayOtherInfo();
		employeedetails1.displayAllInfo();
	} 
}