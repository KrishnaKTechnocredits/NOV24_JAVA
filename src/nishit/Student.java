package nishit;

class Student
{
	String empName = "Suresh";
	int empAge = 28;
	int empSalary = 70000;
	
	void printEmpInfo()
	{
		System.out.println(empName);
		System.out.println(empAge);
		System.out.println(empSalary);
	}
	
	public static void main(String[] args)
	{
		Student student = new Student();
		student.printEmpInfo();
	}
}