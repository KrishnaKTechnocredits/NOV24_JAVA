package sachin;

//Find the given character count from given string. 
//
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//
//hint : 
//int getCharFreq(String str, char ch){
//     return count;



public class Assignment20 {

	
	int getCharFreq(String str,char ch) {
		
		int count = 0;
		for(int index=0; index < str.length(); index++) {
			
			if(str.charAt(index)==ch) {
				count++;
			}	
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(new Assignment20().getCharFreq("aakanskha", 'a'));
	}

}
