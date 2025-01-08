package nilam.pattern;
/* write a logic to print below pattern.
*
**
***
****

*/

public class Assignment38_Pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} 
			System.out.print("\n");
		}
	}
}
