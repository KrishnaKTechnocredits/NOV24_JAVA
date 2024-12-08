package anuja.anuja_interview;

/*write a logic to print below pattern.

*
**
***
*****/
public class Assignment38 {
	
	void printTrianglePattern(int n) {
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		assignment38.printTrianglePattern(4 );
	}

}
