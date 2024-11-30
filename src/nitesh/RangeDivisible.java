package nitesh;

public class RangeDivisible {

	void printDiv(int startrange,int endrange) {
		for(int index =startrange;index<endrange;index++) {
			if (index%3==0 && index%5==0) {
				System.out.println("Divisible by 5 & 3, numbers are:"+" "+index);
			}
		} 
	}
	public static void main(String[] args) {
		PrintDivisible printdivisible = new PrintDivisible();
		printdivisible.printDiv(5, 40);
	}
}

