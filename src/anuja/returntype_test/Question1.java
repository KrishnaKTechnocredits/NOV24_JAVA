package anuja.returntype_test;
//all methods are static, but in exam it was non static gives CE hence I named them as static-
// instance is created then no need to mark it as static. instacne meanse object.
//if object is not craeted and used class name to call them then need to mark as static.
//anser is- version4.7

public class Question1 {
	
	String s = "";
	
	public static void main(String[] args) {
		Question1 question1 = new Question1();
		System.out.println(question1.m1());
	}
	
	String m1() {
		return("version" + m2());
	}
	
	 float m2() {
		return (m3()+1);
	
	}
	
	 float m3() {
		return 3.7f;
	}

}
