package fazrana.inheritanceAss24;

public class Case3DynamicPoly {
	public static void main(String[] args) {
		Manager manager=new Employee();
		
		System.out.println(manager.x);
		System.out.println(manager.y);
//		System.out.println(manager.z); //CE member is not available on ref type Manager
		
		manager.m1();
		manager.m2();
//		manager.m3(); //CE member is not available on ref type Manager
	}
}
