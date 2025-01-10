/*Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1*/

package pankaj;

public class Assignment69 {

	void printArray(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			
			String word = arr[i];
			
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						arr[j] = "";
						count++;
					}
				}
				System.out.println(word + "::" + count);
			}
		}

	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		Assignment69 A = new Assignment69();
		A.printArray(str);
	}

}
