/*
 * Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
 */

package rohan;

public class Assignment_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_71 assignment = new Assignment_71();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String[] arr1 = assignment.StringToArray(str);
		String output = assignment.MaxString(arr1);
		System.out.println("Output : " + output);
	}

	String[] StringToArray(String str) {
		String[] arr = str.split(" ");
		return arr;
	}

	int CountDigit(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	String MaxString(String[] arr) {
		String Max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (CountDigit(arr[i]) > CountDigit(Max)) {
				Max = arr[i];
			}
		}
		return Max;
	}

}
