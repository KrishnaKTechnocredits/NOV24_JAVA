package mahesh;

public class Assignment_12 {

	void printEvenNumber (int startRange, int endRange) {
		
		System.out.println("The even numbers at the range from "+startRange+" to "+endRange+" are");
		
		for (int i=startRange; i<=endRange; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Assignment_12 assignment = new Assignment_12();
		assignment.printEvenNumber(10, 15);
	}
}
