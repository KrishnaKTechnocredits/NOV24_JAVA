package mahesh;

public class Assignment_15 {
	
	int count = 1;

	void printNumbers (int startRange, int endRange) {
		
		System.out.println("The first 3 numbers divisible by both 3 and 4 for the range "+startRange +" to "+endRange);
		
		for (int i=startRange; i<=endRange; i++) {
			if (count<=3) {
				if (i%3==0 && i%4==0) {
				System.out.print(i+" ");
				count++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Assignment_15 assignment = new Assignment_15();
		assignment.printNumbers(10, 500);
	}
}
