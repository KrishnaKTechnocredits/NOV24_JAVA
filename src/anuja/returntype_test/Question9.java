package anuja.returntype_test;

public class Question9 {

	public static void main(String[] args) {
		Question9 a = new Question9();
			System.out.println(Question9.m1());
	}
	
	 static int m1() {
		 int n = 1 ;
		 int m = 0 ;
		 while (true) {
			 m = m2(n);
			 if(m % 3 == 1)
				 break;
			 n++;
		 }
		 return m;
	 }
	 
	 static int m2(int n) {
		 return ((2 * n) - 1);
	 }
	 
}
