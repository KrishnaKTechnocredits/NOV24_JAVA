package titikshaG;
class EmployeeDetail{
	static String firstName;
	static String lastName;
	static int empId;
	static int managerId;
	static String address;
	static String phoneNumber;
	
	 static void updatePrimaryInfo(){
		 firstName = " titiksha";
		 lastName = "Goel";
		 empId =1684386;
		 managerId = 2019876;
		 
	 }
	 
	 static void  updateSecondaryInfo(){
		 address = " Delhi ";
		 phoneNumber = "+91-9765463742";
		
	 }
	 
	static void displayPrimaryInfo(){
		System.out.println(" First name is :"+ firstName);
		System.out.println(" Last name is :"+ lastName);
		System.out.println(" Employee id is :"+ empId);
		System.out.println(" Manager id is :"+ managerId);
		 
	 }
	 
	static void displayOtherInfo(){
		System.out.println(" Address is :"+ address );
		System.out.println(" Phonenumber is :"+ phoneNumber);
		 
	 }
	 
	static void displayAllInfo(){
		displayPrimaryInfo();
	displayOtherInfo();}
		 
	public static void main(String[] args){
		updatePrimaryInfo();
		System.out.println(" ");
		
		updateSecondaryInfo();
		System.out.println(" ");
		
		displayPrimaryInfo();
		System.out.println(" ");
		
		displayOtherInfo();
		System.out.println(" ");
		
		displayAllInfo();
		}
	
}