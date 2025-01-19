package anuja.string;

/*write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1*/
public class Assignment37 {

	void printFreqOfAllChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			if (i == str.indexOf(ch)) {
				for (int j = 0; j < str.length(); j++) {
					char currentChar = str.charAt(j);
					if (currentChar == ch) {
						count++;
					}
				}
				System.out.println(ch + "-->" + count);

			}
		}

	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		assignment37.printFreqOfAllChar("aakanksha");
	}
}