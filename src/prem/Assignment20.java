package prem;

public class Assignment20 {
	static int count;
	
	int getCharFreq(String str, char ch) {
		for(int i=0;i<=str.length();i++) {
			char temp= str.charAt(i);
			  if (temp== ch) {
				count++;
				if (i==str.length()-1){
				return count;
				}
			  }	  
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Assignment20 assign20 = new Assignment20();
		int ans= assign20.getCharFreq("aakanskha",'a');
		System.out.print("count of a in aakanskha is "+ ans);
	}
}
