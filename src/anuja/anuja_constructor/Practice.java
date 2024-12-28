package anuja.anuja_constructor;
//basic construtor practice
public class Practice {
	
	void m1() {
		System.out.println(10);
	}
	//below construcot can be written any where in the code and 
	//should match with the arguments passed in the object.
	//if contructor is parametrised but not passed arguments in object then error as -add arguments to match
	//if contrucot is default and argumets pass in object then error is remove arguments to match
	Practice(int num){
		System.out.println("parameterised");
	}
	
	Practice(){
		System.out.println("dafault");
	}
	

	public static void main(String[] args) {
		Practice practice = new Practice(10);
		Practice practice1 = new Practice();

		practice.m1();
	}
}
