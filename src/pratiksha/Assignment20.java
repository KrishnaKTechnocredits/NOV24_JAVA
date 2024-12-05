package pratiksha;

public class Assignment20 {
/* Find the given character count from given string. 

	input : aakanskha, a
	output : Count of a in aakanskha is 4.  		 

	hint : 
	int getCharFreq(String str, char ch){
	     return count; */
	
	static int count;
	
	int getCharFreq(String str, char ch) {
		for (int i=0;i<=str.length();i++) {
			
			char temp=str.charAt(i);
			
			if (temp==ch) {
				
				count++;
				
				if(i==str.length()-1) {
					
					return count;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Assignment20 assign20 = new Assignment20();
		
		int ans = assign20.getCharFreq("aakansha", 'a');
		
		System.out.println("count of a in aakansha is "+ans);
	}
	
	}


