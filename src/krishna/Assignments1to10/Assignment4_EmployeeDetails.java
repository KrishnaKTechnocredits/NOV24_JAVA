package Assignments1to10;

import java.util.Scanner;

public class Assignment4_EmployeeDetails {

	String firstName ;
	String lastName;
	String address;
	String contactNo;
	int empId;
	int managerId;
	
	void updatePrimaryInfo(String empFirstName,String empLastName,int eId , int mId){
		firstName = empFirstName;
		lastName = empLastName;
		empId = eId;
		managerId = mId;
	}
	
	void secondaryInfoUpdate(String empAddress , String mobileNo) {
		address = empAddress;
		contactNo = mobileNo;
	}
	
	void displayPrimaryInfo() {
		System.out.println("employee first name is " + firstName);
		System.out.println("employee last name is " + lastName);
		System.out.println("employee id is " + empId);
		System.out.println("manager id is " + managerId);
	}
	
	void displayOtherInfo() {
		System.out.println("employee address is " + address);
		System.out.println("employee contact number is " + contactNo);
	}
	
	void displayAllInfo() {
		System.out.println("employee first name is " + firstName);
		System.out.println("employee last name is " + lastName);
		System.out.println("employee id is " + empId);
		System.out.println("manager id is " + managerId);
		System.out.println("employee address is " + address);
		System.out.println("employee contact number is " + contactNo);
	}
	
	public static void main(String[] args) {
		Assignment4_EmployeeDetails test = new Assignment4_EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter employee first name");
		String firstName = sc.nextLine();
		System.out.println("please enter employee last name");
		String lastName = sc.next();
		System.out.println("please enter address");
		String address = sc.next();
		System.out.println("please enter contact no");
		String contactNo = sc.next();
		System.out.println("please enter emp id");
		int empId = sc.nextInt();
		System.out.println("please enter manager id ");
		int managerId = sc.nextInt();
		
		test.updatePrimaryInfo(firstName, lastName, empId, managerId);
		test.secondaryInfoUpdate(address, contactNo);
		test.displayPrimaryInfo();
		test.displayPrimaryInfo();
		test.displayAllInfo();
		
	}
	
}
