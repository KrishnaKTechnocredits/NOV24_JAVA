package nitesh;

public class EmployeeDetail {
	static String firstName = "Nitesh";
	static String lastName = "Shukla";
	static int empId = 123;
	static int managerId = 412;
	static String address = "307, Libra space, Indore, M.P";
	static String phone = "+918421882621";
	
	void updatePrimaryInfo() {
		firstName = "Ranu";
		lastName = "Sharma";
		empId = 321;
		managerId = 451;
	}  
	
	void updateSecondaryInfo() {
		address = "khajrana,Indore";
		phone = "+918451882652";
	}
	
	void displayPrimaryInfo() {
		System.out.println("FirstName is " +firstName);
		System.out.println("Lastname is " +lastName);
		System.out.println("EmployeeId is " +empId);
		System.out.println("ManagerID is " +managerId);
	}
	
	void displayOtherInfo() {
		System.out.println("Address is " +address);
		System.out.println("Phone number is " +phone);
	}
	
	void displayAllInfo() {
		System.out.println("Name is " +firstName+" "+ lastName );
		System.out.println("EmployeeId is " +empId);
		System.out.println("ManagerID is " +managerId);
		System.out.println("Address is " +address);
		System.out.println("Phone number is " +phone);
	}
	
	public static void main(String[] args) {
		EmployeeDetail employeedetail = new EmployeeDetail();
		employeedetail.updatePrimaryInfo();
		employeedetail.updateSecondaryInfo();
		employeedetail.displayPrimaryInfo();
		employeedetail.displayOtherInfo();
		employeedetail.displayOtherInfo();
	}
}
