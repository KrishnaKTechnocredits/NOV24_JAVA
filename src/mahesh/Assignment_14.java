package mahesh;

public class Assignment_14 {

	int sum = 0;
	int count = 0;
	
	void numberDivisible (int startRange, int endRange) {
		for (int i=startRange; i<=endRange; i++) {
			if (i%3==0 && i%5==0) {
			sum = sum + i;
			count++;
			}
		}
		System.out.println("In the range "+startRange+" to "+endRange+", sum of all the numbers divisible by 3 and 5 is "+sum);
		System.out.println("In the range "+startRange+" to "+endRange+ ", " + count + " numbers are divisible by 3 and 5");
	}
	
	public static void main(String[] args) {
		Assignment_14 assignment = new Assignment_14 ();
		assignment.numberDivisible(1, 70);

	}
}
