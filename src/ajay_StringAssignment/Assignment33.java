/*
 Print Frequency of each Uppercase character
Input- aaKaNKshA
K=2
N=1
A=1
 */
package ajay_StringAssignment;

public class Assignment33 {
	void getFreqChar(String input) {
		System.out.print("Frequency of UpperCase Characters in given String " + "AABcBBBAdeddd" + " is = ");
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == currentChar) {
					count++;
				}
			}
			if (input.indexOf(currentChar) == i && Character.isUpperCase(currentChar)) {
				System.out.println(currentChar + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		assignment33.getFreqChar("AABcBBBAdeddd");
	}
}
