package sindhu;

public class Student {
	String name = "Sindhu";
	int rno = 1;
	
	void printInfo(){
		System.out.println(name);
		System.out.println(rno);
	}	
	
	public static void main(String[] args){
		Student s = new Student();
		s.printInfo();
	}
}	
