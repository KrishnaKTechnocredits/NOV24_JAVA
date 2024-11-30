package deepali.inheritanceCases;

public class Case3 {

	public static void main(String[] args) {
		Manager manager = new Employee();
		System.out.println(manager.id);
		System.out.println(manager.name);
//		System.out.println(manager.empSalary);CE
		manager.getManagerDetails();
		manager.display();
//		manager.getEmpDetails();CE
	}

}
//Note- compiler alway check left hand side variables and methods.
//empsalary and getEmpDetails are not visible to compiler
//during run time if method is same in both the class then behaviour get changed.
