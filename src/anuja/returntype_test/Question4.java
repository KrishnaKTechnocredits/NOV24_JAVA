package anuja.returntype_test;
//out put is- 2
public class Question4 {

	int cnt = 2;
	
	void m1() {
		cnt++;
		m2();
	}
	
	void m2() {
		cnt++;
	}
	
	public static void main(String[] args) {
		for(int i = 0 ; i< 4; i++) {
			Question4 a = new Question4();
			a.m1();
		}
		
		System.out.println(new Question4().cnt);
	}
}
