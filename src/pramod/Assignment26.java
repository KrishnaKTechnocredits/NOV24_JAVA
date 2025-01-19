/*Assignment - 26 : 2nd Dec'2024 [10 mins]

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46
*/

package pramod;
class Assignment26 {
	
	int getAssciiValue(char ch) {
		System.out.println("Given character is " + ch);
		int ascii = ch;
		return ascii;
	}
		
	public static void main(String[] args) {
		Assignment26 av = new Assignment26();
		int answer;
		answer = av.getAssciiValue('A');
		System.out.println("Ascii vlaue is " + answer);
		
		answer = av.getAssciiValue('x');
		System.out.println("Ascii vlaue is " + answer);
		
		answer = av.getAssciiValue(' ');
		System.out.println("Ascii vlaue is " + answer);
		
		answer = av.getAssciiValue('.');
		System.out.println("Ascii vlaue is " + answer);
	}
}