package nitish;

public class CharacterC {
	
	int output(String str,char ch){
		int count=0;
		for(int x=0;x<str.length();x++) {
			if(str.charAt(x)==ch) {
				System.out.println("\t"+" Index at this "+str.charAt(x)+" is "+x);
			    count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "Nitish Mehta";
		char ch ='i';
		CharacterC charC = new CharacterC();
		int charCount = charC.output(str,ch);
		System.out.println("\nCount of the character '" +ch+"' occuring in '" +str+"' is "+charCount);
		
	}

}
