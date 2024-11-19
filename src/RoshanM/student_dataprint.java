package roshanM;

class student{
	String name = "roshan";
	int rollno = 21;
	
	void printInfo(){
	System.out.println(name);
	System.out.println(rollno);
	}
	
	public static void main(String[] args){
		student s = new student();     //object
		s.printInfo();    //method calling
	}
}
