package fazrana.inheritanceAss24;

public class Case2Child {
	public static void main(String[] args) {
		Employee employee=new Employee();
		
		System.out.println(employee.x);// available in parent and inheritant to children
		System.out.println(employee.y);
		System.out.println(employee.z);
		
		employee.m1(); // available in parent and inheritant to children
		employee.m2();
		employee.m3();
	}
}
