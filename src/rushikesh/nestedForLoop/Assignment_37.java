package rushikesh.nestedForLoop;

public class Assignment_37 {
	
	void printFreqencyOfChar(String str) {
		for (int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			int indexOfChar=str.indexOf(ch);
			int count=0;
			if(indexOfChar==index) {
				for (int innerIndex=0;innerIndex<str.length();innerIndex++) {
					if (str.charAt(innerIndex)==ch) {
						count++;
					}
				}
				System.out.println(ch+"->"+count);
			}
		}
	}
	
	public static void main (String[] args) {
		Assignment_37 assignment_37 =  new Assignment_37();
		assignment_37.printFreqencyOfChar("aakansha");
	}
}
