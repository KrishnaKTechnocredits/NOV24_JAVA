package kishor;

public class Assignment38_Pattern1 {
	
	void printPatterm() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment38_Pattern1 assignment38 = new Assignment38_Pattern1();
		assignment38.printPatterm();
	}
}
