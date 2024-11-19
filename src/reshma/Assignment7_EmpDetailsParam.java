package reshma;

public class Assignment7_EmpDetailsParam {
	String FirstName;
	String LastName;
	int EmpId;
	int ManagerId;
	String EmpAdd;
	String EmpMobNo;
	
	void updatePrimaryInfo(String FName,String LName,int EId,int MId){
		FirstName=FName;
		LastName=LName;
		EmpId=EId;
		ManagerId=MId;
	}
	
	void updateSecondaryInfo(String EAdd,String EMobNo ){
		EmpAdd=EAdd;
		EmpMobNo=EMobNo;
	}
	
	void displayPrimaryInfo(){
		System.out.println("FirstName is "+ FirstName);
		System.out.println("LastName is "+ LastName);
		System.out.println("Empid is "+ EmpId);
		System.out.println("ManagerId is "+ ManagerId);
	}
	
	void displayOtherInfo(){
		System.out.println("EmpAdd is "+ EmpAdd);
		System.out.println("EmpMobNo is "+ EmpMobNo);
	}
		
	void displayAllInfo(){
		System.out.println("Employee All Details- FirstName is: "+ FirstName);
		System.out.println("LastName is: "+ LastName);
		System.out.println("Empid is: "+ EmpId);
		System.out.println("ManagerId is: "+ ManagerId);
		System.out.println("EmpAdd is: "+ EmpAdd);
		System.out.println("EmpMobNo is: "+ EmpMobNo);
	}
	
	public static void main (String[] args){
		Assignment7_EmpDetailsParam e=new Assignment7_EmpDetailsParam();
		String FName="Reshma";
		String LName="Bhosale";
		int EId=101;
		int MId=1010;
		String EAdd="Flat A10, Ganesh Nagar, New Sangvi, Pune";
		String EMobNo="+91-9765463743";
		e.updatePrimaryInfo(FName,LName,EId,MId);
		e.updateSecondaryInfo(EAdd,EMobNo);
		e.displayPrimaryInfo();
		e.displayOtherInfo();
		e.displayAllInfo();
	}
}

