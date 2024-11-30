package kavita;

/*Find the given character count from given string.*/
/*Time: 16m*/
public class Assignment20 {
	int getCharFreq(String str, char ch) {
		int count=0;
		int stringLength = str.length();
		for(int index =0;index<=stringLength-1;index++) {
			if(str.charAt(index)==(ch)) {
				count++;
			}
		}
		
		System.out.println("Count of " +ch+ " char in string "+str+" is "+count+" .\n");
		return count;
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.getCharFreq("aakanskha" , 'a');
	}
}
	

	
