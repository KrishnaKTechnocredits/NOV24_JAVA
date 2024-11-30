package mahesh;

public class Assignment_20 {
	
	static int count;
	static String word;
	static char letter;
	
	int getCharFreq(String str, char ch){
		for (int index=0; index<str.length(); index++) {
			char letter = str.charAt(index);
			if (ch == letter) {
				count++;
			}
		}
		letter = ch;
		word = str;
		return count;
	}
	     
	public static void main(String[] args) {
		Assignment_20 assignment = new Assignment_20();
		assignment.getCharFreq("school",'o');
		System.out.print("Count of '"+letter+"' in '"+word+"' is "+count+".");
	}     
}
