package kavita;
/*return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

if(uCount > lCount)
	return "upper";
else if(lCount > uCount)
   return "lower";
else
   return "same";
   Time: 25m*/
public class Assignment35 {
	int ucount=0;
	int lcount=0;
	
	int getCharFreq(String str,char ch) {
		int count=0;
		int Stringlength=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		//System.out.println("frequench of "+ch+" is "+count);
		return count;
	}
	
	void getFreqOfUpperCase(String str) {
		 ucount=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			if(Character.isUpperCase(ch)&& i==index) {
				 ucount=ucount+getCharFreq(str,ch);
				}
				
			}
		System.out.println("Frequench of Uppercase is "+ucount);
			
		}
	
	void getFreqOfLowerCase(String str) {
		 lcount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			if(Character.isLowerCase(ch) && i==index){
				 lcount=lcount+getCharFreq(str,ch);
				 
					
				}
				
			}
		System.out.println("Frequench of Lowercase is "+lcount);
			
		}
	
	void printCounts() {
		if(ucount>lcount) {
			System.out.println("Upper");
		}else if(lcount>ucount) {
			System.out.println("Lower");
		}else {
			System.out.println("Same");
		}
	}
	
	public static void main(String[] args) {
		Assignment35 assignment35=new Assignment35();
		String input="teChnOcreDits";
		//assignment35.getCharFreq("teChnOcreDits",'e');
		assignment35.getFreqOfUpperCase(input);
		assignment35.getFreqOfLowerCase(input);
		assignment35.printCounts();
	}
}
