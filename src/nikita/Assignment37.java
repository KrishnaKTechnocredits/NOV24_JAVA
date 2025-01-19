/* write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1*/


package nikita;

public class Assignment37 {

	void printFreqOfAllChar(String input) {
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int count = 0;
			int index = input.indexOf(ch);
			if(index == i) {
			for(int j=0; j<input.length(); j++) {
				char currentCh = input.charAt(j);
				if(ch == currentCh) {
					count++;
				}
			}
			System.out.println(ch + "-->" + count);
		}
	}
}

	public static void main(String[] args) {
		Assignment37 a37 = new Assignment37();
		String name = "aakanksha";
		a37.printFreqOfAllChar(name);
	}

}
