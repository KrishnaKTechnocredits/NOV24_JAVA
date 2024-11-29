package fazrana.inheritanceAss24;

public class Case5ChildToParent {
	public static void main(String[] args) {
		Manager manager=new Manager();
		Employee employee=new Employee();
		manager=employee;// Manager manager =new Employee, dynamic polymorphism
		
		System.out.println(manager.x);
		System.out.println(manager.y);
//		System.out.println(manager.z); //CE member is not available on ref type Manager
		
		manager.m1();
		manager.m2();
//		manager.m3(); //CE member is not available on ref type Manager
	}
}
