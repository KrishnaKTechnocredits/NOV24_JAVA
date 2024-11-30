package deepali.inheritanceCases;

public class Case1 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.id);
		System.out.println(manager.name);
		//System.out.println(manager.empSalary); //compilation error
		manager.getManagerDetails();
		manager.display();
		//manager.getEmpDetails(); //compilation error
	}

}
//Note- empSalary and getEmpDetails 
//are not in the memory of new Manager()
