package anuja.returntype_test;
// before casting output of ,1 into int, earlier it was compilation error. coz int can not hold value of float and
//output from m2 is float.
public class Question7 {

	public static void main(String[] args) {
		Question7 a = new Question7();
		double d = a.m1(7.0f , 2.0f);
		System.out.println(d);
	}
	
	double m1(float num1 , float num2){
		int number = (int)m2(num1 , num2);
		return 2 * number;
	}
	
	float m2( float num1 , float num2){
		return (num1 + num2 / 2);
	}
	
}
