package deepali.inheritanceCases;

public class Case5 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee employee = new Employee();
		manager = employee;
		System.out.println(manager.id);
		System.out.println(manager.name);
		//System.out.println(manager.empSalary);
		manager.getManagerDetails();
		manager.display();
		//manager.getEmpDetails();
	}

}
//Note- It became Manager manager = new Employee();
//giving comiler error as at compile time for variable and method which is not visible
//to manager.and while run time its running method from employee class if class is same.
