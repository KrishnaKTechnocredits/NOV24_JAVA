package harshada;

public class Example1 {
	String firstName,lastName;
	
	void updateData() {
		firstName="HArshada";
		lastName="Jagtap";
	}
	
	void display() {
		Example1 ex1=new Example1();
		ex1.updateData();
		System.out.println(ex1.firstName);
		System.out.println(ex1.lastName);
	}
	
	public static void main(String[] args) {
		Example1 ex1=new Example1();
		ex1.display();
		System.out.println(ex1.firstName);
		System.out.println(ex1.lastName);
	}
}
