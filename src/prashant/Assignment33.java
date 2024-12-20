/*Assignment - 33 : 7th Dec [15 mins]
print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4*/

package prashant;

public class Assignment33 {
	
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
			if (temp == i && Character.isUpperCase(inputchar)) {
				int totalcount = getCharFrequency(input, inputchar);
				System.out.println(inputchar + "--->" + totalcount);
			}
		}

	}

	public static void main(String[] args) {
		
		Assignment33 assignment33=new Assignment33();
		String input="AABcBBBAdeddd";
	    assignment33.getAllCharFrequency(input);
	}

}
