package kishor;
//Print count of digit in each word.
//String str = "H2i22 H1ello Techno C2red3i3t4s5";

public class Assignment70_ArrayString {
	
	int getDigitCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	void displayDigitCount(String str) {
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			int count=getDigitCount(arr[i]);
			System.out.println(arr[i]+"->"+count);
		}
	}
	
	public static void main(String[] args) {
		Assignment70_ArrayString assignment70 = new Assignment70_ArrayString();
		assignment70.displayDigitCount("H2i22 H1ello Techno C2red3i3t4s5");
	}
}
