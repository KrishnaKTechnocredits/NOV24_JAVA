/*
 * Assignment - 7 : 16th Nov'2024 (30 mins) [parameter practice)
Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

String firstName, lastName, employeeId, managerId;

void updatePrimaryInfo(String fname, String lName, int id, int mngId){
	firstName = fname;
	lastName = lName;
	employeeId = id;
	managerId = mngId;
}
create 5 methods from which 2 methods are parameterized method (1,2).
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAl
 */

package AmrutaK;

public class Assignment_7 {
    String firstName;
    String lastName;
    int employeeID;
    int managerID;
    String address;
    String phoneNumber;

    void updateprimaryinfo(String fname, String lname, int empId, int mngId) {
    	firstName = fname;
        lastName = lname;
        employeeID = empId;
        managerID = mngId;
    }
    void updatesecondaryinfo(String add, String phnNum) {
    	address = add;
        phoneNumber = phnNum;
    }
    void displayprimaryinfo() {
        System.out.println("Primary Information is as below:");
        System.out.println("First Name is --> " +firstName);
        System.out.println("Last Name is --> " +lastName);
        System.out.println("Employee ID is --> " +employeeID);
        System.out.println("Manager ID is --> " +managerID);
    }
    void displaysecondaryinfo() {
        System.out.println("Other Information is as below:");
        System.out.println("Address is --> " + address);
        System.out.println("Phone number is --> " + phoneNumber);

    }
    void displayallinfo() {
        System.out.println("------------- All Information is as below: ---------");
        System.out.println("First Name is --> " + firstName);
        System.out.println("Last Name is --> " + lastName);
        System.out.println("Employee ID is --> " + employeeID);
        System.out.println("Manager ID is --> " + managerID);
        System.out.println("Address is --> " + address);
        System.out.println("Phone number is --> " + phoneNumber);
    }
    public static void main(String args[]) {
    	Assignment_7 a7 = new Assignment_7();
    	a7.updateprimaryinfo("Amruta","Kharat",51224,8967);
    	a7.displayprimaryinfo();
    	a7.updatesecondaryinfo("Baner Pune","+91-7896458721");
    	a7.displaysecondaryinfo();
    	a7.displayallinfo();
    }
}
