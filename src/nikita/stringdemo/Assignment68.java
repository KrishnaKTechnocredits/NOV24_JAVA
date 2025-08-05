/* Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits

*/

package nikita.stringdemo;

public class Assignment68 {
	
	String getReArrangeString(String input) {
		String Ucase = "";
		String Lcase = "";
		int digit = 0;
		
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				Ucase += ch;
			}
			else if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
					digit += num;
			}
			else 
			{
				Lcase +=  ch;
			}
		}
		return Ucase+digit+Lcase;
	}

	public static void main(String[] args) {
		Assignment68 a68 = new Assignment68();
		String str = "Te1ch6NOCre4dits";
		System.out.println("Given String is: " + str);
		String ans = a68.getReArrangeString(str);
		System.out.println("Rearrange string is : " + ans);
	}
}
