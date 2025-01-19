package kavita;

/*write loop inside loop (nested for loop), and print frequency of each character. 
input : aakanksha
a->4
k->2
n->1
s->1
h->1
Time: 17m*/
public class Assignment37 {
	// To find single character frequency
	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int j = 0; j < input.length(); j++) {
			char currentch = input.charAt(j);
			if (ch == currentch) {
				count++;
			}
		}
		return count;

	}

	void freqOfAllChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = 0;// make everytime count=0 or restet
			int index = input.indexOf(ch);// getting index of each character
			// character index and loop index is same then count increased else no need to
			// go into loop
			if (i == index) {
				count = getCharFreq(input, ch);
				System.out.println(ch + "->" + count);
			}

		}
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		assignment37.freqOfAllChar("aakanksha");
	}
}
