package anuja.string;

public class PracticeString {

	int num;
	int sum;
	char ch;

	public int getSum(){
	    String str = "1234";
	    for (int i =0 ; i <= str.length() ; i++){
	      if(Character.isDigit(str.charAt(i))){
	        num  =  Character.getNumericValue(ch);
	        sum = sum + num ; 
	      }
	    }
	    return sum ;
	  }

	public static void main(String[] args) {
		PracticeString a = new PracticeString();
		int result = a.sum;
		System.out.println("Sum of all digits from a given string is " + result);
	}

}
