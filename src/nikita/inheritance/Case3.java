package nikita.inheritance;

public class Case3 {

	public static void main(String[] args) {
		Manager m = new Employee();
		System.out.println(m.x);
		System.out.println(m.y);
	//	System.out.println(m.z);
		
		m.m1();
		m.m2();	
//		m.m3();

	}

}
