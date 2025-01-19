package anuja.returntype_test;
// ans is 14- multiple instance of same class, the changed
//value of ariables will remina theris in the instacne only
public class Question2 {
	int i=1;
	int j=2;
	int k=3;
	
	int m1() {
		return i++ + ++k;
	}
	
	int m2() {
		return j++ + i++;
	}
	
	int m3() {
		return k++ + ++j;
	}
	
	public static void main(String[] args) {
		Question2 a = new Question2();
		Question2 b = new Question2();
		Question2 c = new Question2();
		
		int finalAns = a.m1() + b.m2() + c.m3();
		System.out.println(finalAns);
		
	}
}
