package PoojaR;
class Assignment4{
	String firstName,lastName,address,phoneNumber;
	int empId,managerId;
	
	void updatePrimaryInfo(){
		firstName = "Pooja";
		lastName = "Rajguru";
		empId = 1111;
		managerId = 3333;		
	}
	
	void updateSecondaryInfo(){
		address = "Baner";
		phoneNumber = "8180065489";
	}
	
	void displayPrimaryInfo(){
		System.out.println(" Display Primary Infprmatoin of Employee ");
		System.out.println("-----------------------------------------");
		System.out.println("Employee's First name = " + firstName ); 
		System.out.println("Employee's Last name is = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
		System.out.println();
	}
	
	void displayOtherInfo(){
		System.out.println(" Display Other Information of Employee ");
		System.out.println("-----------------------------------------");
		System.out.println("Employee's Address = " + address);//, 
		System.out.println("Employee's Phone Number = " + phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo(){
		System.out.println(" Display All Information of Employee ");
		System.out.println("-----------------------------------------");
		System.out.println("Employee's First Name = " + firstName); 
		System.out.println("Employee's Last Name = " + lastName);
		System.out.println("Employee Id = " + empId);
		System.out.println("Manager Id = " + managerId);
		System.out.println("Employee's Address = " + address);
	}
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.updatePrimaryInfo();
		assignment4.updateSecondaryInfo();
		assignment4.displayPrimaryInfo();
		assignment4.displayOtherInfo();
		assignment4.displayAllInfo();
	}
}