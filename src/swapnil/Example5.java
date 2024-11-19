package swapnil;
public class Example5{
	static String str = "Hello";
	static int num=100;

	static void display(){
		System.out.println("static number is "+num);
		System.out.println("static string is "+str);
	}
	void nonstatic(){
		display();
	}	
	public static void main(String[] args){
		Example5 test= new Example5();
		test.nonstatic();
		display();
	}
}