/*Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
 */
package nitesh.string;

public class GetCharacterFreq {
	static int count;

	int getCharFreq(String str,char ch){
		for(int i=0 ;i<=str.length()-1;i++ ){
			if(str.charAt(i)==ch){
				count++;
			}
		}return count;
	}
	public static void main(String[] args){
		GetCharacterFreq getcharacterfreq = new GetCharacterFreq();
		getcharacterfreq.getCharFreq("aakanskha", 'a');
		System.out.println("Count of a in aakanskha is :"+ count);
	}
}
