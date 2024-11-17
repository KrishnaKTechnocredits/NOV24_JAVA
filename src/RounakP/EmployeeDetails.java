package RounakP;

class EmployeeDetails{
	String firstName;
	String lasName;
	int empid;
	int managerid;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Tecno";
		lasName = "Credits";
		empid = 4;
		managerid = 7;			
	}
	
	void updateSecondaryInfo(){
		address = "Nagpur";
		phoneNumber = "+91-976543742";
	}
	
	void displayPrimaryInfo(){
		System.out.println(firstName);
		System.out.println(lasName);
		System.out.println(empid);
		System.out.println(managerid);		
	}
	
	void displayOtherInfo(){
		System.out.println(address);
		System.out.println(phoneNumber);		
	}
	
	void displayAllInfo(){
		System.out.println(firstName);
		System.out.println(lasName);
		System.out.println(empid);
		System.out.println(managerid);
		System.out.println(address);
		System.out.println(phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails E = new EmployeeDetails();
		E.updatePrimaryInfo();
		E.updateSecondaryInfo();
		E.displayPrimaryInfo();
		E.displayOtherInfo();
		E.displayAllInfo();
	}
}