package swapnil;

public class Assignment37 {
	void getFreqChar(String str) {
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			 if(str.indexOf(ch)==i) {
				int count = 0;
				for(int j=0;j<str.length();j++) {
					if (str.charAt(j)==ch){
						count++;
		}
		
	}
				System.out.println(ch+"->"+count);
}
		}
		}
	

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		assignment37.getFreqChar("aakansha");

	}

}
