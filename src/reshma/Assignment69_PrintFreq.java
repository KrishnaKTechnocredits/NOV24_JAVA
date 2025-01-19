package reshma;
/* Print frequency of each word from given String.
String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1 */

public class Assignment69_PrintFreq {
	int returnCount(String[] arr, String word) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word)) {
				count++;
				arr[i] = "";
			}
		}
		return count;
	}
	void findFrequency(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].isEmpty()) {
				System.out.print(arr[i] + " - ");
				count = returnCount(arr, arr[i]);
				System.out.println(count);
			}
		}
	}
	public static void main(String[] args) {		
		Assignment69_PrintFreq a69 = new Assignment69_PrintFreq();
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		String[] arr = str.split(" ");
		a69.findFrequency(arr);		
		}
}
