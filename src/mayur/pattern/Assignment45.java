/*
 * Assignment - 45 : 10th Dec 
#*#*#
#*#
#*#*#
#*#

 */

package mayur.pattern;

public class Assignment45 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k = 0;
			if (i%2!=0) {
				k=5;
			}else {
				k=3;
			}
			for (int j=1;j<=k;j++) {
				if (j%2 != 0) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
