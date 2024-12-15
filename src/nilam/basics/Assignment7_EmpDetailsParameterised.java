package nilam.basics;

public class Assignment7_EmpDetailsParameterised {
	
	String firstName,lastName,phNo,address;
	int empId,mngId;
	
	void updatePrimaryInfo(String fName, String lName,int eId,int mId) {
		firstName=fName;
		lastName=lName;
		empId=eId;
		mngId=mId;		
	}
	
	void updateSecondaryInfo(String add, String pno) {
		address=add;
		phNo=pno;
	}
	
	void displayPrimaryInfo() {
		System.out.println("Name :"+ firstName + " " + lastName + "\n" + "Employee Id :" + empId + "\n"+ "Manager Id :" +mngId);
	}
	
	void displaySecondaryInfo() {
		System.out.println("Address :" + address + "\n" + "Phone No :" + phNo );
	}
	
	
	public static void main(String[] args) {
		Assignment7_EmpDetailsParameterised assignment7_empDetailsparameterised=new Assignment7_EmpDetailsParameterised();
		assignment7_empDetailsparameterised.updatePrimaryInfo("Nilam", "Korade", 1010, 111);
		assignment7_empDetailsparameterised.updateSecondaryInfo("Pune", "91-555555555");
		assignment7_empDetailsparameterised.displayPrimaryInfo();
		assignment7_empDetailsparameterised.displaySecondaryInfo();
	}
}
