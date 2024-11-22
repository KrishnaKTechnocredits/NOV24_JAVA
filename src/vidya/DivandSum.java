package vidya;

public class DivandSum {
	int num1;
	int num2;
	
	void divisionNdSum(int num1,int num2) {
		int sum = 0;
		int count = 0;
		for(int i = num1;i<=num2;i++) {
			if(i % 3 == 0&& i % 5 == 0) {
				sum = sum+i;
				count++;
				//System.out.println("Number divisible by 3 & 5 is " +i);
			}
		}
				System.out.println("The sum of numbers divisible by 3 & 5 is " +sum);
				System.out.println("In given range " +num1 +" and "+num2+ "," +count+" number are divisible by 3 &5");
		
	}
	
	public static void main(String[] a) {
		DivandSum divsum = new DivandSum();
		divsum.divisionNdSum(1, 60);
		
	}
	

}
