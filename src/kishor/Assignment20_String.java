package kishor;

public class Assignment20_String {
	
	int getCharCount(String str , char ch) {
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment20_String assignment21 = new Assignment20_String();
		int Ans=assignment21.getCharCount("aakanskha", 'a');
		System.out.println("Count of a in aakanskha is:- "+ Ans);
	}
}
