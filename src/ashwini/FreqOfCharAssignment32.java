package ashwini;

public class FreqOfCharAssignment32 {
	
	void freqOfChar(String str) {
		for(int i =0; i < str.length();i++)
		{
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			System.out.println(ch+"-->"+i + "-->"+index);	
		}
	}

	public static void main(String[] args) {
		FreqOfCharAssignment32 assn32= new FreqOfCharAssignment32();
		assn32.freqOfChar("aakanksha");

	}

}
