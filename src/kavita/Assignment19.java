package kavita;
/*Print all the characters of given string in reverse order. /te ch3no*
 * Time:Time: 26m*/

public class Assignment19 {
	String getString(String str){
		int stringLength = str.length();
		System.out.println("Print each alphabet in order ");
		for (int index=0;index<=stringLength-1;index++){
			System.out.println( str.charAt(index));
		}
		return str;
	}
	
	String getReverseString(String str){
		int stringLength = str.length();
		System.out.println("Print each alphabet in reverse order ");
		for (int index1=stringLength-1;index1>=0;index1--){
			System.out.println( str.charAt(index1));
		}
		return str;
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();	
		assignment19.getString("te ch3no");
		assignment19.getReverseString("te ch3no");
	}
}
