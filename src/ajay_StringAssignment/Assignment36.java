/*
 * 
Assignment - 36 : 8th Dec [10 mins]
print table for 1 to 5 numbers.

--------------------------------------------------------------------*/
package ajay_StringAssignment;

public class Assignment36 {

	void m1() {

		System.out.println("Number" + " " + "Multiplier" + " " + "Output");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "     " + "*" + "    " + j + " " + "     " + "=" + "   " + (i * j));
			}
			System.out.println("------------------------------------");
		}
	}

	public static void main(String[] args) {
		Assignment36 Tb = new Assignment36();
		Tb.m1();
	}

}
