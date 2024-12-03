package deepali;
/*Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
*/
public class Assignment_20 {
	int count=0;
	int getCharFreqCount(String str,char ch){
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}return count;
	}
	public static void main(String [] args) {
		Assignment_20 assignment = new Assignment_20();
		int count = assignment.getCharFreqCount("aakanskha",'a');
		System.out.println(count);
		
	}
}


