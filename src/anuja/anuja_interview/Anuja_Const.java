package anuja.anuja_interview;

public class Anuja_Const {
 
	static int count = 0;
	
	Anuja_Const(String name){
		//super();
		System.out.println("default constructor \n");
		count++;
	}
	
	Anuja_Const(int x){
		this("name this");
		System.out.println("int constructor \n");
		count++;

	}
	
	void display() {
		System.out.println("Display method \n ");
	}
	
	public static void main(String[] args) {
		Anuja_Const anuja_Const = new Anuja_Const(10);
		Anuja_Const anuja_Const1 = new Anuja_Const("anuja");

		System.out.println(count);
		
	}
}
