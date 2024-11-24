//Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
//Find the given character count from given string. 
//
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//
//hint : 
//int getCharFreq(String str, char ch){
//     return count;
//}

package harshada;

public class StringAss2 {
	int count;
	int getCharFreq(String str, char ch){
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		StringAss2 stringAss2=new StringAss2();
		String str="aakanskha";
		int count=stringAss2.getCharFreq(str, 'a');
		System.out.println("Count of a in "+str+" is "+count);
	}
}
