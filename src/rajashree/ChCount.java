//Assignment_23
package rajashree;
class ChCount{
	int ucount;
	int lcount;
	int spccount;
	int dcount;
	int scount;
	
	void updatecount(String str){
		for(int index = 0;index<str.length();index++){
			char c = str.charAt(index);
			if(Character.isLetter(c)){
				if(Character.isUpperCase(c)){
					ucount++;
				}else{
					lcount++;
				}
			}else if(Character.isDigit(c)){
					dcount++;
			}else if(c == ' '){
				scount++;
			}else{
				spccount++;
				}
		}
		System.out.println("uppercase ->" + ucount);
		System.out.println("lowercase ->" + lcount);
		System.out.println("digit ->" + dcount);
		System.out.println("specialcharacter ->" + spccount);
		System.out.println("space ->" + scount);
		
	}
	public static void main(String[] args){
		ChCount chCount = new ChCount();
		chCount.updatecount("Te4c_hno Credi3ts");
	}
}