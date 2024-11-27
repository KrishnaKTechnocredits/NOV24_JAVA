//Assignment_21
package rajashree;
class LengthOfStr{
	void lenWitoutSpace(String str){
		int TotalLength=str.length();
		int spaceCount=0;
		int charCount=0;
		for(int index=0; index<str.length(); index++){
		 if(str.charAt(index)==' '){
			spaceCount++;
		 }
		}
		charCount=TotalLength-spaceCount;
		System.out.println("length without space is " +charCount+ " and space characters are " +spaceCount);
	}
	public static void main (String[] args){
		LengthOfStr lenghtOfStr = new LengthOfStr();
		lenghtOfStr.lenWitoutSpace("prem lata gupta");
	}
}
