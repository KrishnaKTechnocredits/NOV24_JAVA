package madhura;

public class Assignment12_EvenNumbers {
	
	void printEvenNumbers(int startRange, int endRange) {
		System.out.println ("Even numbers between "+startRange+ " and " +endRange+ " :");
		for(;startRange <= endRange; startRange++) {
			if(startRange%2 == 0) {
				System.out.println (startRange);
			}
		}
	}
	
	public static void main (String[] args) {
		Assignment12_EvenNumbers evennum = new Assignment12_EvenNumbers();
		evennum.printEvenNumbers(10, 15);
	}
}