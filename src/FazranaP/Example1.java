package FazranaP;

public class Example1 {
	String x,y;
	
	void update() {
		x="new1";
		y="New2";
	}
	
	void display() {
		Example1 exp1=new Example1();
		exp1.update();
		System.out.println(exp1.x);
		System.out.println(exp1.y);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example1 exp1=new Example1();
		exp1.display();
		System.out.println(exp1.y);
	}
}
