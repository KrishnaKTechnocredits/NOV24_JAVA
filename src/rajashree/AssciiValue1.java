package rajashree;
class AssciiValue1{
	//28.write a method to print all the characters having ascii value from 65 to 100
	void printAsciiValue(){
		for(int index=65; index<=100;index++){
			char ch = (char)index;
			System.out.print(ch);
		}
	}
	
	public static void main (String[] args){
		AssciiValue1 assciiValue = new AssciiValue1();
		assciiValue.printAsciiValue();
	}
}