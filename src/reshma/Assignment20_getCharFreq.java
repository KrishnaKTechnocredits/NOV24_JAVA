package reshma;

public class Assignment20_getCharFreq {
	int count=0;
	int getCharFreq(String str,char ch) {
		for(int index=0;index<str.length();index++) {
			if (str.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[]args) {
		Assignment20_getCharFreq assignment20=new Assignment20_getCharFreq();
		assignment20.getCharFreq("aakanksha",'a');
		System.out.println("Count of a in aakanskha is " +assignment20.count);	
	}
}
