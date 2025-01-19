package mahesh;

public class Assignment_13 {
	void printNumber (int startRange, int endRange) {
		
		System.out.println("The number divisible by both 3 and 5 at the range "+startRange+ " to "+endRange+" are");
		
		for (int i=startRange; i<=endRange; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment_13 assignment = new Assignment_13();
		assignment.printNumber(5, 40);
	}
}
