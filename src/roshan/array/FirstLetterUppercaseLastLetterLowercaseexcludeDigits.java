package roshan.array;

import java.util.Arrays;

public class FirstLetterUppercaseLastLetterLowercaseexcludeDigits {
	String excludeDigit (String input) {		
		String noDigitStr = "";
		for (int i=0;i < input.length();i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
            noDigitStr += ch;            	
		}
		}
		return 	noDigitStr ;

	}
	

 String reverseString(String input) {
String excludenum =excludeDigit(input);
	  String RevString = "";
	 for(int i = excludenum.length()-1;i>=0;i--) {
		  RevString += excludenum.charAt(i);   // remember input.charAt(i) like this need to ittrate only  input will not work
		 
	 }
	 return  RevString ;
	 }
 
 String getfirstandlastlatercaps (String  input) {
	String Str = reverseString (input);
	String Firstch = Str.substring(0,1).toUpperCase(); // define end legth care fully
	String Lastch = Str.substring(Str.length()-1).toLowerCase(); //use str.length not index.length
	Str = Firstch + Str.substring(1,Str.length()-1) + Lastch ;
	return Str;
	
 }
 String [] getreverseArray (String [] input) {
	 String [] output = new String [input.length]; //dont make length -1 it should same as input length
	 for (int i= input.length-1,j=0 ; i>=0 ; i--,j++) {
		 output[j]= getfirstandlastlatercaps(input[i]);
	 }
	 return output;
 }
 public static void main(String[] args) {
String [] input = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
FirstLetterUppercaseLastLetterLowercaseexcludeDigits firstletteruppercaselastletterlowercaseexcludedigits = new FirstLetterUppercaseLastLetterLowercaseexcludeDigits ();
String [] result = firstletteruppercaselastletterlowercaseexcludedigits.getreverseArray(input);
System.out.println(Arrays.toString(result));
}
	 
 }



//Note :-using any return out from another method call call string or character class method on it 	



/*
 * Assignment - 65 : 22nd Dec'2024 [20 min] reverse each string in array and
 * place at in reverse order.
 * 
 * input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"} output : [HSNa,StidErc,
 * IvHsaa, HCet]
 * 
 * Hint : First letter in Uppercase + last Letter in lowercase + all other
 * characters in same case + exclude digits
 * 
 */