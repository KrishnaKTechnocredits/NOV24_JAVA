package anuja.returntype_test;
//output is 5-
//
public class Question6 {

	int cnt = 2;

	int m1(int i) {
		cnt++;
		return m2(i);
	}

	int m2(int i) {
		return cnt = ++cnt + i;
	}

	public static void main(String[] args) {
		Question6 a = new Question6();
		for (int i = 1; i < 2; i++) {
			a.m1(i);
		}
		System.out.println(a.cnt);
	}

}
