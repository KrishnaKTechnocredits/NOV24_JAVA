package rohan;

public class Assignment14 {
	public static void main(String[] args) {
		Assignment14 div = new Assignment14();
		div.division(1, 70);;
	}

	void division(int StartRange, int EndRange) {
		int count=0, sum=0 ;
		for (int num = StartRange; num <= EndRange; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println("In range between " +StartRange+ " to " +EndRange+" calculated sum is :"+sum);
		System.out.println("In range between " +StartRange+ " to " +EndRange+ ","+count+" number are dividible by 3 and 5");
	}
}
