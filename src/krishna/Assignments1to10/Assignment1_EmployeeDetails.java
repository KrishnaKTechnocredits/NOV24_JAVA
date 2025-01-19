package krishna.Assignments1to10;

import java.util.Scanner;

public class Assignment1_EmployeeDetails {

	void getEmployeeDeatils(String name , String id , int age , int salary) {
		String empName = name;
		String empId = id;
		int empAge = age;
		int empSalary = salary;
		System.out.println(empName + " is employee name");
		System.out.println(empId + " is employee id");
		System.out.println(empAge + " is employee age");
		System.out.println(empSalary + " is employee salary");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter employee name");
		String empName = sc.next();
		System.out.println("please enter employee ID");
		String empID = sc.next();
		System.out.println("please enter employee age");
		int empAge = sc.nextInt();
		System.out.println("please enter employee salary");
		int empSalary = sc.nextInt();
		
		new Assignment1_EmployeeDetails().getEmployeeDeatils(empName, empID, empAge, empSalary);
	}
}
