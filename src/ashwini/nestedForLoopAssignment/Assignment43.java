package ashwini.nestedForLoopAssignment;
/* write a logic for below pattern
 A
 B C
 D E F
 G H I J
 */
public class Assignment43 {
	void printPattern() {
		char ch='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment43 assn43=new Assignment43();
		assn43.printPattern();
	}

}
