/* print table for 1 to 5 numbers.*/

package nikita.patternpriting;

public class Assignment36 {
	void m1() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Table for number " + i + ":");
			for(int j = 1; j<=10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));		
				}
			System.out.println("------------------------");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Assignment36 a36 = new Assignment36();
		a36.m1();
	}
}
