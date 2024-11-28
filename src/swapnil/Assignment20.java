package swapnil;

public class Assignment20 {
	int count=0;
	
	int charcount(String str, char ch) {
		for(int num=0;num<=str.length()-1;num++) {
			if(str.charAt(num)==ch) {
				count++;
				
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.charcount("aakanskha",'a');
		System.out.println("Count of a in aakanskha is "+assignment20.count);
	}

}



/*
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
*/