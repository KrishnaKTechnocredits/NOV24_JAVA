package swapnil;

public class Assignment33 {
		void getFreqChar(String str) {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(Character.isUpperCase(ch)) {
				 if(str.indexOf(ch)==i) {
					int count = uppercase(str,ch);
			  System.out.println(ch+"->"+count);
				 }
				}
			}
		}

		int uppercase(String str,char ch) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				if (str.charAt(j)==ch){
					count++;
				}
			}
			return count;
			
		}
		public static void main(String[] args) {
			Assignment33 assignment33 = new Assignment33();
			assignment33.getFreqChar("AAB2cBB2BAd2ed3dd");

		}
}

	
