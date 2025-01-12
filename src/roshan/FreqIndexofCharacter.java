package roshan;

public class FreqIndexofCharacter {

	void getIndexOfCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if(i==index) {
		    System.out.println(ch + " index is " + index + " and character frequency is" + count);
		}
		}	
	}

	public static void main(String[] args) {
		FreqIndexofCharacter freqindexofcharacter = new FreqIndexofCharacter();
		freqindexofcharacter.getIndexOfCharacter("aakanksha");

	}
}

/*
 * Assignment - 32 : 7th Dec [15 mins] [IMP] print the freq of each character. IMPPPPPPPPPPPP
 * 
 * input : aakanksha
 * 
 * a -> 4 k ->2 n->1 s->1 h->1
 * 
 * hint : charAt , indexOf
 */