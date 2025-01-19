package Assignment_Array;

public class Assignment69 {
	
	void printEachWordCount(String str) {
	    String[] arrOfWords = str.split(" ");
	    
	    for (int i = 0; i < arrOfWords.length; i++) {
	        int wordCount = 0;
	        String word = arrOfWords[i];
	        
	        if (!word.equals("")) {
	            for (int j = 0; j < arrOfWords.length; j++) {
	                if (arrOfWords[j].equals(word)) {
	                    arrOfWords[j] = "";
	                    wordCount++;
	                }
	            }
	            System.out.println(word + " -> " + wordCount);
	        }
	    }
	}


	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		new Assignment69().printEachWordCount(str);
	}
}
