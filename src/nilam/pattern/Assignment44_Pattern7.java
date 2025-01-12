package nilam.pattern;
/*
 write a logic to print below pattern.
*
* #
* # *
* # * #
* # * # *

*/

public class Assignment44_Pattern7 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2!=0)
				System.out.print("*");
				else
					System.out.print("#");
			}System.out.print("\n");
		}
		
	}

}
