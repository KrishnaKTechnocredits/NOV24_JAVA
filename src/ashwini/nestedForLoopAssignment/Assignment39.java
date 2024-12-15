package ashwini.nestedForLoopAssignment;
/* write a logic to print below pattern--o/p-->
1
1 2
1 2 3
1 2 3 4 */
public class Assignment39 {
	void printPattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment39 assn39=new Assignment39();
		assn39.printPattern();
	}

}
