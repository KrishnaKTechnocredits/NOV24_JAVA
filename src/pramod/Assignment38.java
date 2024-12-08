/*Assignment - 38 : 8th Dec [15 mins]
write a logic to print below pattern.

*
**
***
****

*/

package pramod;
class Assignment38{
	
	void printPattern() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Assignment38 printP = new Assignment38();
		printP.printPattern();
	}
}