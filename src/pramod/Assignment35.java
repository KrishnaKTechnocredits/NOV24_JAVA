/*
Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

if(uCount > lCount)
	return "upper";
else if(lCount > uCount)
   return "lower";
else
   return "same";
   
   */
   
package pramod;
class Assignment35{
	
	int getFrequency(String str, char ch){
		int count=0;
		for(int i=0 ; i<str.length(); i++){
			char currentch=str.charAt(i);
			if(ch==currentch)
				count++;
		}
		return count;	
	}
		
	void printDigitFrequency(String str){
		System.out.println("Given string is: "+str);
		int uCase=0;
		int lCase=0;
		int count=0;
		int lCount=0;
		for(int i=0; i<str.length(); i++){
			char ch=str.charAt(i);
			int index = str.indexOf(ch);
			if(Character.isUpperCase(ch)&&i==index){
				count=getFrequency(str,ch);
				uCase = uCase + count;
			}
			else{
				Assignment35 as=new Assignment35();
				lCount=as.getFrequency(str,ch);
				lCase = lCase+lCount;
			}			
		}
		if(uCase>lCase){
			System.out.println("Upper");
		}
		else if(uCase<lCase){
			System.out.println("Lower");
		}
		else{
			System.out.println("Same");
		}
	}
	
	public static void main(String[] args){
		Assignment35 digitfrq = new Assignment35();
		String input = "teChnOcreDitsABCDEGGHIa";
		digitfrq.printDigitFrequency(input);
	}
}