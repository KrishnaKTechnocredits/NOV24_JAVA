package sachin;

public class Assignment4 {
	
	String firstName,lastName,address;
	int empId,managerID;
    String phoneNo="+91-9765463742";
    
    void primaryInfo(String fname, String lname,int empid, int mnid) {
    	 
    	this.firstName=fname;
    	this.lastName=lname;
    	this.empId=empid;
    	this.managerID=mnid;
    	
     }
    
    void secondaryInfo(String add, String phone) {
    	
    	this.address=add;
    	this.phoneNo=phone;
    	
    }
    
    void displayPrimaryInfo() {
    	
    	System.out.println("First name is :" + firstName);
    	System.out.println("Last name is :" + lastName);
    	System.out.println("Emploee id is :" +empId);
    	System.out.println("Manager id is :" + managerID);
    }
    
    void displayOtherInfo() {
    	
    	System.out.println("New Address is :" + address);
    	System.out.println("New phone number is :" + phoneNo);
    	
    }
    
    void displayAllInfo() {
    	
    	System.out.println("First name is :" + firstName);
    	System.out.println("Last name is :" + lastName);
    	System.out.println("Employee id is :" + empId);
    	System.out.println("Manager id is :" + managerID);
    	System.out.println("Address is :" + address);
    	System.out.println("Phone no is :" + phoneNo);
    	
    	
    }
	public static void main(String[] args) {
		
		Assignment4 employeedetails = new Assignment4();
		employeedetails.primaryInfo("sachin", "Bhoite", 200, 001);
		employeedetails.displayPrimaryInfo();
		employeedetails.secondaryInfo("A/P New Mumbai", "+91-9872612519");
		employeedetails.displayOtherInfo();
		employeedetails.displayAllInfo();

	}

}
