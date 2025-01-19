package siddharth.Assignment24Inheritence;

public class Case2 {
	public static void main(String[] args){
		Employee emp = new Employee();

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
