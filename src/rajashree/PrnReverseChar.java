//Assignment_19
package rajashree;
class PrnReverseChar{
	
	void printRevCha(String str){
		for(int index=str.length()-1; index>=0;index--){
			System.out.println(str.charAt(index));
		}
	}
	public static void main(String[] args){
		PrnReverseChar prnRevesrseChar = new PrnReverseChar();
		prnRevesrseChar.printRevCha("te ch3no");
	}
}