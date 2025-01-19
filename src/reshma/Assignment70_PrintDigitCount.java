package reshma;
/* Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";
output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5 */

public class Assignment70_PrintDigitCount {
	int getDigitCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				count++;
			}		
		return count;
	}
	void PrintDigitCount(String[] str) {
		
		for (int i = 0; i < str.length; i++) {
			int count =  getDigitCount(str[i]);
				System.out.println(str[i] + " - " +count);
			}
		}
	
	public static void main(String[] args) {		
		Assignment70_PrintDigitCount a70 = new Assignment70_PrintDigitCount();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String[] arr = str.split(" ");
		a70.PrintDigitCount(arr);		
		}
}
