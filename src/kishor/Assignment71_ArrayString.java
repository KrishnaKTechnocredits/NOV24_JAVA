package kishor;
//return the word having highest digits in the given String .
//String str = "H2i22 H1ello Techno C2red3i3t4s5";

public class Assignment71_ArrayString {
	
	int getDigitCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				count++;
			}
		}
		return count;
	}
	
	String getHighestDigitString(String str) {
		String[] arr= str.split(" ");
		String MaxString=arr[0];
		int MaxCount=0;
		for(int i=0;i<arr.length;i++) {
			int count=getDigitCount(arr[i]);
			if(count>MaxCount) {
				MaxCount=count;
				MaxString=arr[i];
			}
		}
		return MaxString;
	}
	
	public static void main(String[] args) {
		Assignment71_ArrayString assignment71 = new Assignment71_ArrayString();
		String ans=assignment71.getHighestDigitString("H2i22 H1ello Techno C2red3i3t4s5");
		System.out.println("MaxDigitString is:- "+ans);
	}
}
