/*Assignment - 41 : 8th Dec[10 mins]
write a logic to print below pattern.
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5
 */
package nitesh.nestedloop;

public class PaternAssignment41 {
	
	void printpatern() {
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=4;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PaternAssignment41 paternassignment41 = new PaternAssignment41();
		paternassignment41.printpatern(); 
	}
	
}
