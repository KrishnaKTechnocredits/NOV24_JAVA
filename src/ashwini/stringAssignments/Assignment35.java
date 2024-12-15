package ashwini.stringAssignments;

public class Assignment35 {
	/*Return "Upper" if uppercase frequency is higher than lowercase 
	frequency other return "lower.if noth having same frequency then return "same"*/
	 
	String getFreq(String input) {
		int lcount=0;
		int ucount=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
			ucount++;
			}else {
				lcount++;
			}
		}
		if(ucount>lcount) {
					return "Upper";
				}else if(lcount>ucount) {
					return "lower";
				}else 
					return "same";
				
			
			}
		
	public static void main(String[] args) {
		Assignment35 a35=new Assignment35();
		String ans= a35.getFreq("teChnOcreDits");
		System.out.println(ans);
	}

}
