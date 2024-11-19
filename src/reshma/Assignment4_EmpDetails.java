package reshma;

//import assignment4.EmployeeDetails;

public class Assignment4_EmpDetails {
	String FirstName;
	String LastName;
	int EmpId;
	int ManagerId;
	String EmpAdd;
	String EmpMobNo;
	
	void updatePrimaryInfo(){
		FirstName="Reshma";
		LastName="Bhosale";
		EmpId=1011;
		ManagerId=1011_1;
	}
	
	void updateSecondaryInfo(){
		EmpAdd="Flat A-10,Ganesh Nagar,Pune 412101";
		EmpMobNo="+91-9765463743";
	}
	
	void displayPrimaryInfo(){
		System.out.println("FirstName is: "+ FirstName);
		System.out.println("LastName is: "+ LastName);
		System.out.println("Empid is: "+ EmpId);
		System.out.println("ManagerId is: "+ ManagerId);
	}
	
	void displayOtherInfo(){
		System.out.println("EmpAdd is "+ EmpAdd);
		System.out.println("EmpMobNo is "+ EmpMobNo);
	}
		
	void displayAllInfo(){
		System.out.println("Employee all Details FirstName is: "+ FirstName);
		System.out.println("LastName is: "+ LastName);
		System.out.println("Empid is: "+ EmpId);
		System.out.println("ManagerId is: "+ ManagerId);
		System.out.println("EmpAdd is: "+ EmpAdd);
		System.out.println("EmpMobNo is: "+ EmpMobNo);
	}
	
	public static void main (String[] args){
		Assignment4_EmpDetails e=new Assignment4_EmpDetails();
		e.updatePrimaryInfo();
		e.updateSecondaryInfo();
		e.displayPrimaryInfo();
		e.displayOtherInfo();
		e.displayAllInfo();
	}
}
