
/*
Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18
*/
package nitesh.Ascii;

class SumOfAllDigit{ 
	 
	 void sumStringDigits(String input){
		 int sum = 0;
		 for(int i=0; i<=input.length()-1;i++ ){
			 char ch = input.charAt(i);
			 if(Character.isDigit(ch)){
				 int digit = Character.getNumericValue(ch); 
				 sum += digit;
			 }
		 }System.out.println("sum " + sum);
	}
	public static void main(String [] args){
		SumOfAllDigit sumofalldigit = new SumOfAllDigit();
		sumofalldigit.sumStringDigits("te1ch2no3cre7dits");
		sumofalldigit.sumStringDigits("techno");
		sumofalldigit.sumStringDigits("4563");
	}
} 
