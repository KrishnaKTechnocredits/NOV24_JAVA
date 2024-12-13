package ashwini.nestedForLoopAssignment;
/*write a login to print below pattern
*
* #
* # *
* # * #
* # * # *  */

public class Assignment44 {
	void printPattern() {
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("# ");
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment44 assn44=new Assignment44();
		assn44.printPattern();
	}

}
