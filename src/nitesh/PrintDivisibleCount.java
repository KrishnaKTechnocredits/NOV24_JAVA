package nitesh;

public class PrintDivisibleCount {
	int countindex;
	int sum;
	
	void divisibleCountCheck(int startRange,int endRange) {
		for (int index=startRange;index <endRange;index++ ) {
			if (index%3==0 && index%5==0){
				sum +=index;
				countindex++;
				}
		}
		System.out.println("In the range 1 to 70, calculated sum is "+" " +sum);
		System.out.println("In the range 1 to 70,"+" " +countindex+ " "+" numbers are divisible by 3 and 5");
	}
	public static void main(String[] args) {
		PrintDivisibleCount printdivisibleCount =new PrintDivisibleCount();
		printdivisibleCount.divisibleCountCheck(1,70);
	}
}
