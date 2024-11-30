/*Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
 */
package nitesh;

public class GetCharacterFreq {
	int count;
	
	void checkCharacterFreq(String str,char ch){
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a') {
				count++;
			} 
		} 
		System.out.println("Count of a in aakanskha is :"+" "+count);
	}
	public static void main(String[] args) {
		new GetCharacterFreq().checkCharacterFreq("aakanskha", 'a');
	}
}
