
//Assignment - 32 : 7th Dec
//print the freq of each character.
//
//input : aakanksha
//
//a -> 4
//k ->2
//n->1
//s->1
//h->1

//hint : charAt , indexOf

package komal.String;

public class Assignment32 {

	void getFreqEachChar(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentCh = input.charAt(i);
			if (currentCh == ch) {
				count++;
			}
		}
		System.out.println("Count of " + ch + " is " + count);
	}

	public static void main(String args[]) {
		Assignment32 a32 = new Assignment32();
		String input = "aakanksha";
		for (int i = 0; i < input.length(); i++) {
			char currentCh = input.charAt(i);

			System.out.println(currentCh + "hi");
			int currentIndex = input.indexOf(currentCh);
			if (currentIndex == i) {
				a32.getFreqEachChar(input, currentCh);
			}
		}

	}

}
