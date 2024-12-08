package anuja.anuja_interview;

/*A
B C
D E F
G H I J*/
public class Assignment43 {

	void printPatternOfChar() {
		char ch1 = 'A';
		//char ch2 = 'J';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch1 +" ");
				ch1++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.printPatternOfChar();
	}
}
