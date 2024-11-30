/* Create a class called EmployeeDetails having following instance variable.
firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.
1) updatePrimaryInfo() -> firstName, lastName, empId, managerId
2) updateSecondaryInfo() -> address, phoneNumber
3) displayPrimaryInfo() -> firstName, lastName, empId, managerId
4) displayOtherInfo() -> address, phoneNumber
5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()
*/

package nikita;

public class Assignment04 {
	
	String firstName, lastName, address, phoneNumber;
	int empId, managerId;
	
	void updatePrimaryInfo() {
		firstName = "Nikita";
		lastName = "Wani";
		empId = 10;
		managerId = 1011;
		}

	void updateSecondaryInfo() {
		address = "Mumbai";
		phoneNumber = "+91-78545255458";
		}

	void displayPrimaryInfo() {
		System.out.println("Employee Primary Information: ");
		System.out.println("First Name is: " + firstName);
		System.out.println("Last Name is: " + lastName);
		System.out.println("Employee Id is: " + empId);
		System.out.println("Manager Id is: " + managerId);
		System.out.println();
		}

	void displayOtherInfo() {
		System.out.println("Employee Other Information: ");
		System.out.println("Employee Address is: " + address);
		System.out.println("Phone Number is: " + phoneNumber); 
		System.out.println();
		}

	void displayAllInfo() {
		System.out.println("Employee Full Information: ");
		System.out.println("Employee Name is: " + firstName +" " + lastName);
		System.out.println("Employee Id is: " + empId);
		System.out.println("Manager Id is: " + managerId);
		System.out.println("Employee Address is: " + address);
		System.out.println("Employee Phone Number is: " + phoneNumber); 
		}
	
	public static void main(String[] args) {
		Assignment04 a4 = new Assignment04();
		a4.updatePrimaryInfo();
		a4.updateSecondaryInfo();
		a4.displayPrimaryInfo();
		a4.displayOtherInfo();
		a4.displayAllInfo();
	}

}
