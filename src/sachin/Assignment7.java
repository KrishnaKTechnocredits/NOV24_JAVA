package sachin;

class Assignment7 {
    String firstName="Yogesh";
	String lastName="Kale";
	int empId= 500;
	int managerId= 100;
	String address="Chira Bazar Mumbai 412360";
	String phoneNubmer="+91-9765463742";
	
	void updatePrimaryInfo (){
	
	   firstName="Sachin";
	   lastName="Bhoite";
	   empId=501;
	   managerId=101;
	
	}
	
    void updateSecondaryInfo(){
	
	  address="Airoli new Mumbai 412300";
	  phoneNubmer= "91-8888876027";

     }	
	 
	void displayPrimaryInfo(){
	 
	  System.out.println("Employee FirstName is :" +firstName);
	  System.out.println("Employee LastName is :" +lastName);
	  System.out.println("Employee Employee id is :" +empId);
	 
	 }
	 
	void displayOtherInfo(){
	  
	  System.out.println("Employee address is :" +address);
	  System.out.println("Employee address is :" +phoneNubmer);
	  
	 }
	 
	void displayAllInfo(){
	
	  System.out.println("Employee FirstName is :" +firstName);
	  System.out.println("Employee LastName is :" +lastName);
	  System.out.println("Employee Employee id is :" +empId);
	   System.out.println("Employee address is :" +address);
	  System.out.println("Employee address is :" +phoneNubmer);
	
	
	
	}


    public static void main (String [] args) {
	
    	Assignment7 employeedetails = new Assignment7();
	
	   employeedetails.updatePrimaryInfo();
	   employeedetails.updateSecondaryInfo();
	   employeedetails.displayPrimaryInfo();
	   employeedetails.displayOtherInfo();
	   employeedetails.displayAllInfo();
	
	 }
}