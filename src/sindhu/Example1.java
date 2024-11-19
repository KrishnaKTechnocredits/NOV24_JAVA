package sindhu;

public class Example1 {
   
	String name = "Sindhu";
	int rno = 1;
	
	void printInfo(){
		System.out.println(name);
		System.out.println(rno);
		display();
	}	
	
	void display() {
		System.out.println("my name is "+name);
	}
	
	public static void main(String[] args){
		Example1 e = new Example1();
		e.printInfo();
	}
}
