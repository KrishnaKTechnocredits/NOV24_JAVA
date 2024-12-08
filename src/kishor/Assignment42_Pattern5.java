package kishor;

public class Assignment42_Pattern5 {
	
	void printPatter() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment42_Pattern5 assignment42 = new Assignment42_Pattern5();
		assignment42.printPatter();
	}
}
