package siddharth.Assignment24Inheritence;

public class Case6 {
	public static void main(String[] args){
		Manager mngr = new Employee();
		Employee emp = new Employee();
		emp = (Employee) mngr; //Employee emp = new Employee();

		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.departmentId);
		System.out.println(emp.departmentName);
		System.out.println(' ');
		emp.getId();
		emp.getName();
		emp.getDepartmentName("QA");
		emp.getEmployeeDeptId();
		emp.getDepartmentName();
	}

}