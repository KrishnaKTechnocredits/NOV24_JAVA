//Assignment - 7 : 16th Nov'2024 (30 mins) [parameter practice)
//Create a class called EmployeeDetails having following instance variable.
//firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

//String firstName, lastName, employeeId, managerId;

//void updatePrimaryInfo(String fname, String lName, int id, int mngId){
	//firstName = fname;
	//lastName = lName;
	//employeeId = id;
	//managerId = mngId;
//}
//create 5 methods from which 2 methods are parameterized method (1,2).
//1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
//2) updateSecondaryInfo() -> address, phoneNumber
//3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
//4) displayOtherInfo() -> address, phoneNumber
//5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

//main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl

package ravindra;
class EmployeeDetails2{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(String firstName, String lastName, int empId, int managerId){
		this.firstName=firstName;
		this.lastName=lastName;
		this.empId=empId;
		this.managerId=managerId;
	}
	
	void updateSecondaryInfo(String address,String phoneNumber){
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	void displayPrimaryInfo(){
		System.out.println("first name is "+firstName);
		System.out.println("lastName name is "+lastName);
		System.out.println("empId name is "+empId);
		System.out.println("managerId name is "+managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("address name is "+address);
		System.out.println("phoneNumber name is "+phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("first name is "+firstName);
		System.out.println("lastName name is "+lastName);
		System.out.println("empId name is "+empId);
		System.out.println("managerId name is "+managerId);
		System.out.println("address name is "+address);
		System.out.println("phoneNumber name is "+phoneNumber);
	}
	
	public static void main(String []args){
		EmployeeDetails2 employeeDetails2=new EmployeeDetails2();
		employeeDetails2.updatePrimaryInfo("Ravindra","Mule",100,02);
		employeeDetails2.updateSecondaryInfo("Pune","8657444466");
		employeeDetails2.displayPrimaryInfo();
		employeeDetails2.displayOtherInfo();
		employeeDetails2.displayAllInfo();
	}
}
