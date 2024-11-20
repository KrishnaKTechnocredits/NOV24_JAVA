package kishor;

public class Assignment12_Even {
	void printEvenNumber(int startrange,int endrange) {
		for(int i=startrange;i<=endrange;i++) {
			if(i%2==0) {
				System.out.println("even numbers are "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12_Even assignment12_even = new Assignment12_Even();
		assignment12_even.printEvenNumber(10, 15);
	}
}
