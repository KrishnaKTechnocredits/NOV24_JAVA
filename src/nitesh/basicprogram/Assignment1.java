/*Create a class called Employee having employee name , employee age, employee salary. and print them.
 */
package nitesh.basicprogram;

class Assignment1{
	String employeeName = "Nitesh";
	int employeeAge = 32;
	int employeeSalary = 320000;

	void printEmployeeInfo(){
		System.out.println("Employee Name is: "+ " "+ employeeName);
		System.out.println("Employee Age: "+ " " +employeeAge );
		System.out.println("Salary:"+ " " + employeeSalary );
	}

	public static void main(String[] agrs){
		Assignment1 assignment1 = new Assignment1();
		assignment1.printEmployeeInfo();
	}
}