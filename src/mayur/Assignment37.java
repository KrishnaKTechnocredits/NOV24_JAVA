/*
 * Assignment - 37 : 8th Dec [20 mins]
write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1
 */

package mayur;

public class Assignment37 {
	
	void displayCharFreq(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == ch) {
						count++;
					}
				}
				System.out.println("count of character -" + ch + " --> " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment37 obj = new Assignment37();
		obj.displayCharFreq("aakanksha");
	}

}
