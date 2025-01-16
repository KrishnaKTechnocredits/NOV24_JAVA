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
package nitesh.basicprogram.parameterpractice;

public class EmployeeDetPara {
	String firstName,lastName,address,phoneNumber;
	int empId,managerId;

	void updatePrimaryInfo(String fname,String lname,int empid,int managerid) {
		firstName = fname;
		lastName =lname;
		empId = empid;
		managerId = managerid;
	}

	void updateSecondaryInfo(String naddress,String phonenumber) {
		address = naddress;
		phoneNumber = phonenumber;		
	}

	void displayPrimaryInfo() {
		System.out.println("Employee Name is "+ " "+ firstName+ " " + lastName);
		System.out.println("Employee ID is "+ " "+ empId);
		System.out.println("Employee ManagerId is "+ " "+ managerId);
	}

	void displayOtherInfo() {
		System.out.println("Employee address is "+ " "+ address);
		System.out.println("Employee PhoneNumber is "+ " "+ phoneNumber);
	}

	void displayAllInfo() {
		System.out.println("Employee Name is "+ " "+ firstName+ " " + lastName);
		System.out.println("Employee ID is "+ " "+ empId);
		System.out.println("Employee ManagerId is "+ " "+ managerId);
		System.out.println("Employee address is "+ " "+ address);
		System.out.println("Employee PhoneNumber is "+ " "+ phoneNumber);
	}

	public static void main(String[] args) {
		EmployeeDetPara employeedetpara = new EmployeeDetPara();
		employeedetpara.updatePrimaryInfo("Nitesh","Shukla",132,452);
		employeedetpara.updateSecondaryInfo("307,Khajrana,Indore", "+918451228814");
		employeedetpara.displayPrimaryInfo();
		employeedetpara.displayOtherInfo();
		employeedetpara.displayAllInfo();
	}
}
