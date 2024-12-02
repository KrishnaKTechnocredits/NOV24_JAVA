package fazrana.inheritanceAss24;

public class Case6TypeCasting {
	public static void main(String[] args) {
		Manager manager=new Employee();
		Employee employee=new Employee();
		employee=(Employee)manager;// Manager manager =new Employee, dynamic polymorphism
		
		System.out.println(employee.x);
		System.out.println(employee.y);
		System.out.println(employee.z); //CE member is not available on ref type Manager
		
		employee.m1();
		employee.m2();
		employee.m3(); //CE member is not available on ref type Manager
	}
	
}
