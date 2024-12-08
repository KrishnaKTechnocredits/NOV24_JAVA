/*
Assignment - 36 : 8th Dec [10 mins]
print table for 1 to 5 numbers.
*/

package amruta.PatternPrintingCode;

public class Assign_36_Print1to5Table {

	void print1to5Table() {
		for (int index = 1; index <= 5; index++) {
			for (int innerIndex = 1; innerIndex <= 10; innerIndex++) {
				System.out.println(index + " * " + innerIndex + " = " + (index * innerIndex));
			}

			System.out.println("-------------------------");
		}
	}

	public static void main(String[] args) {
		Assign_36_Print1to5Table a36 = new Assign_36_Print1to5Table();
		a36.print1to5Table();
	}
}