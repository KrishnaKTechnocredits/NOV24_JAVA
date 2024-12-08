package kishor;

public class Assignment39_Pattern2 {
	
	void printPatter() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment39_Pattern2 assignment39 = new Assignment39_Pattern2();
		assignment39.printPatter();
	}
}
