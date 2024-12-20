package vidya;

public class Assignment37 {
	void freqOfChar(String str) {
		for(int i =0;i< str.length();i++) {
			int count = 0;
			char ch = str.charAt(i); //get single character
			int index =str.indexOf(ch); //index of single character
			if(index == i) {			//compare index and character
			for(int j = 0;j< str.length();j++) {		//compare the character with whole string
				char currentChar = str.charAt(j);
				if(ch == currentChar) {
					count++;
				}
			}
			System.out.println("Frequency of char " + ch + " in a given string is " + count);		
			}
				
		}
		
	}
	public static void main(String[] args) {
		Assignment37 assg37 = new Assignment37();
		String str = "aaKaNKshA";
		assg37.freqOfChar(str);
	}

}
