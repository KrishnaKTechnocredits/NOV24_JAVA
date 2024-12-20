package anuja.anuja_interview;

public class StatictoNonstatic {

	public static void main(String[] args) {
	//	StatictoNonstatic a =new StatictoNonstatic();
		//a.m4();
	//	StatictoNonstatic.m4();
		}
	
	void m4()
	{
		System.out.println("m4");
		//int i = 100; 
		m3();
	}
	
	static void m3() {
		System.out.println("m3");
	}
}
