package vidya;

public class Division {
	
	int num1;
	int num2;
	
	void division(int num1,int num2) {
		for(int i = num1;i<=num2;i++) {
			if(i % 3 == 0&& i % 5 == 0) {
				System.out.println("Number divisible by 3 & 5 is " +i);
			}
		}
	}
	
	public static void main(String[] a) {
		Division div = new Division();
		div.division(5, 40);
	}
	

}
