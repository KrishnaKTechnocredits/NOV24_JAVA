package mahesh;

public class Assignment_17 {
	
	int count = 1;
	
	void printNumbers (int startRange, int endRange) {
		System.out.println("The last 5 numbers in the range of "+startRange+" and "+endRange+" divisible by 5 are -");
		for (int i=endRange; i>=startRange; i--) {
			if (count<=5) {
				if (i%5==0) {
					System.out.println(i);
					count++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_17 assignment = new Assignment_17 ();
		assignment.printNumbers(10, 500);
	}

}
