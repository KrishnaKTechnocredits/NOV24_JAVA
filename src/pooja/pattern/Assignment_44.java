package pooja.pattern;

/*
 * Assignment - 44 : 8th Dec[15 mins]
write a logic to print below pattern.
					
*				
* #				
* # * 				
* # * #				
* # * # *             		
 			
 */
public class Assignment_44 {

	void printPattern() {
		for (int i = 1; i <= 5; i++) {// rows
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_44 assignment_44 = new Assignment_44();
		assignment_44.printPattern();
	}
}