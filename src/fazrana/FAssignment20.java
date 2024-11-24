//Find the given character count from given string. 
//
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//
//hint : 
//int getCharFreq(String str, char ch){
//     return count;
//}
package fazrana;

public class FAssignment20 {
	void getCount(String str,char cr) {
		int count=0;
		for (int i=0;i< str.length();i++) {
			if(str.charAt(i)==cr) {
				count++;
			}
		}
		System.out.println("Count of "+cr+ " in "+str+ " is "+count);
	}
	
	public static void main(String[] args) {
		new FAssignment20().getCount("aakanskha", 'a');
	}
}
