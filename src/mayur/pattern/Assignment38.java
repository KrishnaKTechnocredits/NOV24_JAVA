/*
 * Assignment - 38 : 8th Dec [15 mins]
write a logic to print below pattern.

*
**
***
****
 */

package mayur.pattern;

public class Assignment38 {
	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
