package anuja.string;
/*Find the given character count from  string.*/
public class Assignment20 {
	//method to print the count of matched char, use == and run for loop to iterate
	
	int getCharFreq(String str, char ch) {
		int count=0;
		for(int index =0;index<str.length();index++) {
			if(str.charAt(index)==(ch)) {
				count++;
			}
			
				}
		
		System.out.println("Count of " +ch+ " char in string "+str+" is "+count+" .");
		return count;
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.getCharFreq("aakanskha" , 'a');
	}
}
