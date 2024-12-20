package nikita.inheritance;

public class Case6 {

	public static void main(String[] args) {
		Manager m = new Employee();
		Employee e = new Employee();
		e = (Employee) m; //explicit typecast
		System.out.println(e.x);
		System.out.println(e.y);
		System.out.println(e.z);
		
		e.m1();
		e.m2();
		e.m3();
	}

}
