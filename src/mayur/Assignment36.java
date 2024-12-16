/*
 * Assignment - 36 : 8th Dec [10 mins]
print table for 1 to 5 numbers.
 
 */

package mayur;

public class Assignment36 {
	
	void printTable(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
	public static void main(String[] args) {
		Assignment36 obj = new Assignment36();
		for (int i=1;i<=5;i++) {
			obj.printTable(i);
			System.out.println("--------");
		}		
	}
}
