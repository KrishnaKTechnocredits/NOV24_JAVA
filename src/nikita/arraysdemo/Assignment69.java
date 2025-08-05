/* Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1*/

package nikita.arraysdemo;

public class Assignment69 {

	void printWordFreq(String str) {
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if(word.equals(arr[j])) {
					arr[j] = "";
					count++;
					}
				}

				System.out.println(word + "-->" + count);
			}		
		}
	}

	public static void main(String[] args) {
		Assignment69 a69 = new Assignment69();
		a69.printWordFreq("Hi Hello Hi Hi Hi Techno Credits Techno");

	}

}
