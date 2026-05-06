package roshan.array;



public class FrequencyOFDigitInWordSentense {
	void  getStringWordSentense(String sentense){
		String [] word = sentense.split(" ");
		for(int i=0;i < word.length;i++) {	
			System.out.println(getTotalDigitInWord(word[i])) ;
		}
	}
		String getTotalDigitInWord(String sentense){ //stucked while spliting
			int count=0;
			for(int i=0;i<sentense.length();i++) {
				char ch = sentense.charAt(i);
				if(Character.isDigit(ch)) {
					count++ ;
				}
				
			}
			return sentense + "->>" + count ;
			
		}

public static void main(String[] args) {
	String sentense  = "H2i22 H1ello Techno C2red3i3t4s5" ;
	FrequencyOFDigitInWordSentense frequencyofdigitinwordsentense = new FrequencyOFDigitInWordSentense ();
	frequencyofdigitinwordsentense.getStringWordSentense(sentense);
}




}
/*
 * Assignment - 70 : 5th Jan'2025 [IMP]
 * 
 * Print count of digit in each word. String str =
 * "H2i22 H1ello Techno C2red3i3t4s5";
 * 
 * output : H2i22 -> 3 H1ello -> 1 Techno -> 0 C2red3i3t4s5 -> 5
 */

