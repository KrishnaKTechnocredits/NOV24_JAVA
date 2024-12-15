package roshan.nestedloop;

public class FreqOfAllCharOnce {
	void getFreq(String str) {
		for(int i=0;i<str.length();i++) {
			int count=0;
			char ch= str.charAt(i);
		   int index= str.indexOf(ch);
		   if(i==index) {
		
		for(int j=0;j<str.length();j++) {
			char currentc=str.charAt(j);
			if(ch==currentc) {
				count++;
			}
				
			}
			
		System.out.println(ch + "->" + count);

		   }
		}

	}
	public static void main(String[] args) {
		FreqOfAllCharOnce freqofallcharonce = new FreqOfAllCharOnce ();
		freqofallcharonce.getFreq("aakansha");
		
	}
	
	
}

