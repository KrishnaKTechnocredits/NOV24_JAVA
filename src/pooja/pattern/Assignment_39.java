package pooja.pattern;
/*
 * Assignment - 39 : 8th Dec[15 mins]

write a logic to print below pattern.

1
1 2
1 2 3
1 2 3 4
*/
public class Assignment_39 {
	
	void printDigitPattern() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment_39 assignment_39 = new Assignment_39();
		assignment_39.printDigitPattern();
	}
}