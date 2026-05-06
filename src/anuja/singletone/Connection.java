package anuja.singletone;

public class Connection {
	public static void main(String[] args) {
		Assignment98 obj = Assignment98.returnObject();
		Assignment98 obj2 = Assignment98.returnObject();

		
		System.out.println(obj);
		System.out.println(obj2);//same memory adress will be printed, so only one times it gets created

		
	}
}
