package nikita.inheritance;

public class Case5 {

	public static void main(String[] args) {
		Manager m = new Employee();
		Employee e = new Employee();
		m = e;
		System.out.println(m.x);
		System.out.println(m.y);
	//	System.out.println(m.z); 
		
		m.m1();
		m.m2();
	//	m.m3();
	}
}
