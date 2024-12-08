package rohan;

public class Assignment33 {

	public static void main(String[] args) {
		Assignment33 assignment = new Assignment33();
		assignment.UppercaseLetter("AABcBBBAdeddd");
	}
	int CharCount(String str , char ch) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
	void UppercaseLetter(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch) && str.indexOf(ch)==i){
				System.out.println(ch+"-"+CharCount(str, ch));
			}
		}
	}

}
