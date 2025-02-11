/* print below pattern
#*#*#
#*#
#*#*#
#*#

 */
package nitesh.nestedloop;

public class PatternAssignment45 {
	
	void printpattern() {
		for(int i =1;i<=4;i++) {
			int count = 0;
			if(i%2 !=0) {
				count =5;
			}else {
				count =3;
			}
			for(int j=1;j<=count;j++) {
				if(j%2!=0) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternAssignment45 patternassignment45 = new PatternAssignment45();
		patternassignment45.printpattern();
	}
}
