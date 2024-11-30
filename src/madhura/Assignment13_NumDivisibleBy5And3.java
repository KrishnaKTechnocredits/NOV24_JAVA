package madhura;

public class Assignment13_NumDivisibleBy5And3 {
		
	void numDivisibleBy5And3(int startIndex, int endIndex) {
		System.out.println ("Numbers divisible by " +startIndex+ " and " +endIndex+ " : ");
		for (;startIndex<=endIndex;startIndex++) {
			if (startIndex%5==0 && startIndex%3==0) {
				System.out.println (startIndex);
			}
		}
	}
	
	public static void main (String [] args) {
		Assignment13_NumDivisibleBy5And3 numdiv = new Assignment13_NumDivisibleBy5And3();
		numdiv.numDivisibleBy5And3(5,40);
	}
}
