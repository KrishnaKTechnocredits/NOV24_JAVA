/*Assignment - 32 : 7th Dec
print the freq of each character.

input : aakanksha

a -> 4
k ->2
n->1
s->1
h->1*/

package prashant;

public class Assignment32 {
	
	int getCharFrequency(String input, char inpuchar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == inpuchar) {
				count++;
			}
		}
		return count;
	}

	void getAllCharFrequency(String input) {
		for (int i = 0; i < input.length(); i++) {
			char inputchar = input.charAt(i);
			int temp = input.indexOf(inputchar);
			if (temp == i) {
				int totalcount = getCharFrequency(input, inputchar);
				System.out.println(inputchar + "--->" + totalcount);
			}
		}

	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		String input = "aakanksha";
		assignment32.getAllCharFrequency(input);

		// char inputchar='a';
	}


}
