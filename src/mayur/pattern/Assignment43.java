/*
 * Assignment - 43 : 8th Dec[10 mins]

write a logic to print below pattern.

A
B C
D E F
G H I J
 */

package mayur.pattern;

public class Assignment43 {
	public static void main(String[] args) {
		char ch='A';
		for (int i=1;i<=4;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
