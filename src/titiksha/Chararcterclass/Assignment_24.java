//Assignment - 23 : 26th Nov'2024 [30 mins]
//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//lowercase -> 11
//digit -> 2
//space -> 1
//special char -> 1
//Hint : use Character class static methods.


package titiksha.Chararcterclass;

public class Assignment_24 {
	int scount;
	int ucount;
	int dcount;
	int lcount;
	int specialcount;
	String specialcharacters="";
	String uppercharacter="";
	String lowercharcter="";
	String specialcharacter="";
	void getcharacterCount(String str) {
		System.out.println("total chararcetr count is");
		for (int num = 0; num < str.length(); num++) {
			char ch = str.charAt(num);
			boolean flag = Character.isDigit(ch);
			
			if (ch == ' ') {
				scount++;}
			else if (Character.isUpperCase(ch)==true ) {
				ucount++;
			}
			else if (Character.isLowerCase(ch)==true ) {
				lcount++;
			}
			else if (flag == true) {
				dcount++;
			}
			else {
				specialcount++;
			}
				
		}
		System.out.println("The spececount is: ".concat(String.valueOf(scount)));
		System.out.println(specialcharacter);
		System.out.println("The upper count is : "+ucount);
		System.out.println("The lower count is :"+ dcount);
		System.out.println("The special character count is "+lcount);
		}

	public static void main(String[] args) {
		Assignment_24 prac = new Assignment_24();
		prac.getcharacterCount("Titiksha5aa he5llow goel");

	}
}
