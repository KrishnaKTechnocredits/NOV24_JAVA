package siddharth;

/*Assignment - 38 : 8th Dec [15 mins] write a logic to print below pattern.
*
**
***
****/

public class Assignment38 {
	
	void printPattern(char ch) {
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		assignment38.printPattern('*');
	}
}
