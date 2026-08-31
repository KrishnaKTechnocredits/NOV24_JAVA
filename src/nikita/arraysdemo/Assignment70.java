/* Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5*/

package nikita.arraysdemo;

public class Assignment70 {
	
	int getDigitCount(String str) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	void printDigitCount(String str) {
		String[] arr = str.split(" ");
		for(int i = 0; i<arr.length; i++) {
			int count = getDigitCount(arr[i]);
			System.out.println(arr[i] + "-->" + count);
		}
	}

	public static void main(String[] args) {
		Assignment70 a70 = new Assignment70();
		a70.printDigitCount("H2i22 H1ello Techno C2red3i3t4s5");
	}
}
