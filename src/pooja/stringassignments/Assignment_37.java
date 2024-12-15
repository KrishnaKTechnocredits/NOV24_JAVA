package pooja.stringassignments;

/*Assignment - 37 : 8th Dec [20 mins]
write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1
*/
public class Assignment_37 {

	void printFrequencyOfCharNestedForLoop(String str) {

		for (int i = 0; i < str.length(); i++) {
			int cnt = 0;
			char ch = str.charAt(i);// a
			int index = str.indexOf(ch);// a=0
			if (i == index) {
				for (int j = 0; j < str.length(); j++) {
					char ch2 = str.charAt(j);
					if (ch == ch2)
						cnt++;
				}
				System.out.println(ch + " -> " + cnt);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		assignment_37.printFrequencyOfCharNestedForLoop("aakanksha");
	}
}