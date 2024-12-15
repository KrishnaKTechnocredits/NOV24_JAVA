//Assignment - 45 : 10th Dec 
//#*#*#
//#*#
//#*#*#
//#*#


package titiksha.NestedLoop_Patternprinting;

public class Patternprinting3 {
	public void patternPrinting(char ch, char ch2) {
		for (int i = 1; i <= 4; i++) {
			if (i % 2 != 0) { // For odd rows 
				for (int j = 1; j <= 5; j++) { 
					if (j % 2 != 0) { //loop for odd columns
						System.out.print(ch);
					} else {
						System.out.print(ch2);
					}
				}

			} else { // For even rows
				for (int j = 1; j <= 3; j++) {
					if (j % 2 != 0) { //loop for odd columns
						System.out.print(ch);
					} else {
						System.out.print(ch2);
					}
				}
			}
			System.out.println(); // Move to the next line
		}
	}

	public static void main(String[] args) {
		Patternprinting3 obj = new Patternprinting3();
		obj.patternPrinting('#', '*'); // Call method with # and *
	}
}