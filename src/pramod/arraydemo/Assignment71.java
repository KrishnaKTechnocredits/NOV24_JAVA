
/*
Assignment - 71 : 5th Jan'2025 [IMP] [12 mins]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
*/
package pramod.arraydemo;
class Assignment71{
	
	int getDigitCount(String word){
		int count = 0;
		for(int i = 0; i< word.length(); i++){
			char ch = word.charAt(i);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}

	String getWordOfHighestDigit(String str){
		String[] words = str.split(" ");
		int maxNum = 0;
		String maxWord = "";
		for(int i = 0; i<words.length;i++){
			String word = words[i];
			int count= getDigitCount(word);
			if(maxNum<count){
				maxNum = count;
				maxWord = word;
			}
		}
		return maxWord;
	}

	public static void main(String[] args){
		Assignment71 A71=new Assignment71();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Given String is : "+ str);
		String word = A71.getWordOfHighestDigit(str);
		System.out.println("Word having highest digit is : "+word);
	}
}