package TechnoCredits;

public class Example1 {
	String firstName,lastName;
	
	void updateData() {
		firstName = "Maulik";
		lastName = "Kanani";
	}
	
	void display() {
		Example1 ex1 = new Example1();
		ex1.updateData();
		//updateData();
		System.out.println(ex1.firstName);
		System.out.println(ex1.lastName);
	}
	
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		ex1.display();
		System.out.println(ex1.firstName); //
		System.out.println(ex1.lastName); //
	}
}
