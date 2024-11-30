package anuja.allcase;

public class Case2 {
	public static void main(String[] args) {
		System.out.println("This is case2 \n");
		Employee employee = new Employee();
		System.out.println("x variable from parent " +employee.x);
		System.out.println("y whihc is common variable, it wil be from child "+ employee.y);
		System.out.println(employee.z);
		employee.m1();
		employee.m2();
		employee.m3();
		employee.m4(); //self local method of child as its different, signature is diff than class A m4 method
		employee.m4(10);//derived method from parent class as its signature is different so its new identity. 
	}
}
