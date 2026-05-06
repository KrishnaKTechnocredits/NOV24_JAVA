package nitesh.string;
/*Assignment-35
 * return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".
input : teChnOcreDits
output : lower
 */
public class UpperOrLowerFreq{
	 String getString(String str) {
		int uCount =0;
		int lCount=0;
		
		for(int index=0; index<str.length();index++) {
		char currentch	=str.charAt(index);
			if(Character.isUpperCase(currentch)&& (str.indexOf(currentch)==index)) {
				uCount++;
			}
			else 
				lCount++;
			}	
		if(uCount>lCount) {
			return "Upper";
		}else if(lCount>uCount) {
			return "lower";
		}else 
			return "same";
	}
	public static void main(String[] args) {
		UpperOrLowerFreq upperorlowerfreq = new UpperOrLowerFreq();
		String result = upperorlowerfreq.getString("teChnOcreDits");
		System.out.println(result);
	}
}