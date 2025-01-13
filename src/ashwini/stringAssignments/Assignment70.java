package ashwini.stringAssignments;

/*
 Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5

 */
public class Assignment70 {
	int getTotalDigitInWord(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char singleword = word.charAt(i);
			if (Character.isDigit(singleword)) {
				count++;
			}
		}
		return count;
	}

	void getCountOfDigit(String input) {
		String [] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			int count= getTotalDigitInWord(arr[index]);
			System.out.println(arr[index]+"-->" + count);
		}
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment70 a70 = new Assignment70();
		a70.getCountOfDigit(str);
	}

}
