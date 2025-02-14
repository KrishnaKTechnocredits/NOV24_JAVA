package roshan.array;

public class ReturnWordHavingHigestDigitCount {
	String getword (String sentense) {
		String [] word = sentense.split(" ");
		int maxcount = 0 ; 
		String maxstring = "" ;
		for(int i=0;i<word.length;i++) {
			int count = getdigitcount(word[i]);   // forgot to hold in another variable
			if( maxcount < count) {
				maxcount = count ;
			   maxstring = word[i];              // current word which have max digit
			}		
			
		}
		return maxstring;
	}
	
	int getdigitcount(String word) {
		int count = 0;

		for (int i=0 ; i< word.length() ;i++) {
			char ch =word.charAt(i);
			if (Character.isDigit(ch)) {
				count++; 
				}
			}
		return count ;
		}
		
	public static void main(String[] args) {
		String sentense = "H2i22 H1ello Techno C2red3i3t4s5";
		ReturnWordHavingHigestDigitCount highdighitcountword = new ReturnWordHavingHigestDigitCount();
	     String result = highdighitcountword.getword(sentense);
	     System.out.println("String which have higest count of digit is : " + result);
	     
	}
		
	}






/*
 * Assignment - 71 : 5th Jan'2025 [IMP]
 * 
 * return the word having highest digits count in the given String . String str =
 * "H2i22 H1ello Techno C2red3i3t4s5";
 * 
 * output : C2red3i3t4s5
 */