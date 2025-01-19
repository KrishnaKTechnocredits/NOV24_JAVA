package rajashree;
class AssciiValue{
	//Write a method which returns ascii value of given character.26
	void printAsciiValue(Character ch){
		int asci = ch;
		System.out.println(asci);
	}
	
	public static void main (String[] args){
		AssciiValue assciiValue = new AssciiValue();
		assciiValue.printAsciiValue('A');
		assciiValue.printAsciiValue('x');
		assciiValue.printAsciiValue(' ');
		assciiValue.printAsciiValue('.');
	}
}
		