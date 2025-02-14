package roshan.array;

public class FrequencyOfEachWord {
	
	public void getStringSentense(String sentence) {
		String [] word =sentence.split(" ");
		for(int i=0;i < word.length;i++) {		
			String word1 = word[i];
			if(!word1.equals("")) {
			int count = 0;
			
			for(int j=0;j < word.length;j++) {		
				if(word[j].equals(word1)) {
					word[j] = "";
					count++;
				}
				
			
			}
			System.out.println(word1 + ":"+ count);
		}
		}
	}
	
	public static void main(String[] args) {
		String sentense  = "Hi Hello Hi Hi Hi Techno Credits Techno";
		FrequencyOfEachWord frequencyofeachword = new FrequencyOfEachWord ();
		frequencyofeachword.getStringSentense(sentense);
	}
	
	
	

}


/*
 * Assignment - 69 : 5th Jan'2025 [IMP] Print frequency of each word from given
 * String.
 * 
 * String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
 * 
 * output : Hi -> 4 Hello -> 1 Techno -> 2 Credits -> 1
 */



















/*
 * Assignment - 69 : 5th Jan'2025 [IMP] Print frequency of each word from given
 * String.
 * 
 * String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
 * 
 * output : Hi -> 4 Hello -> 1 Techno -> 2 Credits -> 1
 */