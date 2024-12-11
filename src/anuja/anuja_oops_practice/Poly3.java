package anuja.anuja_oops_practice;
//check overloading with static access non modifier
public class Poly3 {
	
	int sum ;
	static int sum1;
	
	int addition1(int x, int y){
		System.out.println(" Non static Addition is : " +sum);
		return sum;
	}
	
	static double addition1(int z, int y , int t){
		sum1 = z+y+t;
		System.out.println("Static Addition is : " +sum1);
		return sum1;
	}
	
	public static void main(String[] args) {
		Poly3 poly3 = new Poly3();
		poly3.addition1(3, 4);
		Poly3.addition1(1, 2, 3);

}
}
