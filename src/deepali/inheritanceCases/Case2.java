package deepali.inheritanceCases;

public class Case2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.empSalary);
		employee.getManagerDetails();
		employee.display();
		employee.getEmpDetails();
	}

}
