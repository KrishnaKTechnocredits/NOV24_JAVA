package rajashree;
class AssciiToChar{
	//27.Write a method which returns character of given ascii value
	void printCharValue(int x){
		char ch = (char)x;
		System.out.println(ch);
	}
	
	public static void main (String[] args){
		AssciiToChar assciiToChar = new AssciiToChar();
		assciiToChar.printCharValue(65);
		assciiToChar.printCharValue(90);
		assciiToChar.printCharValue(55);
	}
}