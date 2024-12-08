/*
Assignment - 37 : 8th Dec [10 mins]
write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1
*/

package pramod;
class Assignment37 {

	void printFrequency(String str) {
		for(int i=0; i<str.length(); i++) {
			int count=0;
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if(i==index) {
				for(int j=0; j<str.length(); j++) {
					char currentChar = str.charAt(j);
					if(ch==currentChar)
					count++;
				}
				System.out.println(ch+" -> "+count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment37 frequency = new Assignment37();
		String input="aakanksha";
		frequency.printFrequency(input);
	}
}