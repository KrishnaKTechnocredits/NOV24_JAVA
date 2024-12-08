package kishor;

public class Assignment43_Pattern6 {
	
	void printPatter() {
		char ch='A';
		for(int c=1;c<=4;c++) {
			for(int j=1;j<=c;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment43_Pattern6 assignment43 = new Assignment43_Pattern6();
		assignment43.printPatter();
	}
}
