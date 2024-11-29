package deepali.inheritanceCases;

public class Case6 {

	public static void main(String[] args) {
		Manager manager = new Employee();
		Employee employee = new Employee();
		employee = (Employee)manager;
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.empSalary);
		employee.getManagerDetails();
		employee.display();
		employee.getEmpDetails();
	}

}
//Note- we can not assign manager to employee so need to explicitly typecast this
//it become Employee employee = new Employee();

