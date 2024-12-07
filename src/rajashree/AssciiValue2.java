package rajashree;
class AssciiValue2{
	//29.write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9)
	void printAsciiValue(){
		for(char ch='A'; ch<= 'Z'; ++ch){
		int asci = ch;
		System.out.println(asci);
		}
	}
	void printAsciiValue1(){
		for(char ch='a'; ch<= 'z'; ++ch){
		int asci = ch;
		System.out.println(asci);
		}
	}
	void printAsciiValue2(){
		for(int ch='0'; ch<= '9'; ++ch){
		int asci = ch;
		System.out.println(asci);
		}
	}
	public static void main (String[] args){
		AssciiValue2 assciiValue = new AssciiValue2();
		assciiValue.printAsciiValue();
		assciiValue.printAsciiValue1();
		assciiValue.printAsciiValue2();
	}
}