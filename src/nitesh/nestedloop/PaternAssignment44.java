/*Assignment - 44 : 8th Dec[15 mins]
write a logic to print below pattern.
 *
 * #
 * # * 
 * # * #
 * # * # *
 */
package nitesh.nestedloop;

public class PaternAssignment44 {
	int row = 5;
	void printpatern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {	
				if(j%2 ==0) {
					System.out.print("#");
				}
				else
					System.out.print("*");
			} 
			System.out.println();
		}   
		
	}
	public static void main(String[] args) {
		PaternAssignment44 paternAssignment44 = new PaternAssignment44();
		paternAssignment44.printpatern();
	}
}
