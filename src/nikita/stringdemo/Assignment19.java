/* Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : on3hc et
          	*/

package nikita.stringdemo;

public class Assignment19 {
	void printInputChars(String str) {
		for (int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str = "te ch3no";
		new Assignment19().printInputChars(str);
		}
	}

