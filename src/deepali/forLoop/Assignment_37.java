package deepali.forLoop;
//write loop inside loop (nested for loop), and print frequency of each character. 

//input : aakanksha
//a->4
//k->2
//n->1
//s->1
//h->1
public class Assignment_37 {

	void getFrequencyOfCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (i == index) {
				for (int j = 0; index < str.length(); index++) {
					Character chIndex = str.charAt(index);
					if (chIndex == ch) {
						count++;
					}
				}
				System.out.println("Character count : " + ch + "->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_37 assignment = new Assignment_37();
		assignment.getFrequencyOfCharacter("aakanksha");
	}
}
