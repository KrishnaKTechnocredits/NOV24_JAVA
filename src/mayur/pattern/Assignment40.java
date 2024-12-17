/*
 * Assignment - 40 : 8th Dec[15 mins]

write a logic to print below pattern.

1
2 3
4 5 6
7 8 9 10
 */

package mayur.pattern;

public class Assignment40 {
	public static void main(String[] args) {
		int count =1;
		for (int i=1;i<=4;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
}
