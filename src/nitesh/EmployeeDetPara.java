package nitesh;

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
