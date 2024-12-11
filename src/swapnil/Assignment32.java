package swapnil;

public class Assignment32 {
	
	void displayCharFreq(String str) {
		
		for (int i = 0;  i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch)==i) {
				int count=0;
				for (int j = 0; j < str.length();j++) {
					if (str.charAt(j) == ch) {
						count++;
					}
				}
				//System.out.println("Index of character -"+ch+" --> "+i);
				System.out.println("count of character -"+ch+" --> "+count);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.displayCharFreq("aakanksha");
	}
}