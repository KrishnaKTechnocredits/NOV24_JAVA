package anuja.returntype_test;
// out put is 49, only calculation no logic
public class Question8 {

	
	public static void main(String[] args) {
		Question8 a = new Question8();
		double d = a.m1(7.0f);
		System.out.println(d);
	}
	
	double m1(float num) {
		if(num * num > 2 * num)
			return num * num;
		return 2 * num;
	}
}
