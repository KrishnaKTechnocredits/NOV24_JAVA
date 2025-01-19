package swapnil;

public class Assignment35 {
	void getucount(String input) {
		int lcount=0;
		int ucount=0;
		
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				ucount++;
				//System.out.println(ch+"-"+ucount);
			}
				else {
					lcount++;
			
			//System.out.println(ch+"-"+lcount);
				}
			}
		System.out.println("uppercount-"+ucount);
		System.out.println("lowercount-"+lcount);

	if(lcount>ucount) {
		System.out.println("lower characters are more");
	}
	else if(lcount<ucount) {
		System.out.println("upper characters are more");
		}
	else 
		System.out.println("same");
	}

public static void main(String[] args) {
	Assignment35 assignment35 =new Assignment35();
	assignment35.getucount("teChnOcreDits");
	
}

}
