package fazrana.inheritanceAss24;

public class Case1Parent {
	public static void main(String[] args) {
		Manager manager= new Manager();
		
		System.out.println(manager.x);
		System.out.println(manager.y);
		manager.m1();
		manager.m2();
	}
}
