/* Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits

*/

package nikita.arraysdemo;

public class Assignment67 {
	
	String getReArrangeStrig(String input) {
		String Ucase = "";
		String Lcase = "";
		String digit = "";
		
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				Ucase += ch;
			}
			else if (Character.isDigit(ch)) {
					digit += ch;
			}
			else 
			{
				Lcase +=  ch;
			}
		}
		return Ucase+digit+Lcase;
	}

	public static void main(String[] args) {
		Assignment67 a67 = new Assignment67();
		String str = "Te1ch6NOCre3dits";
		System.out.println("Given String is: " + str);
		String ans = a67.getReArrangeStrig(str);
		System.out.println("Rearrange string is : " + ans);
	}
}
