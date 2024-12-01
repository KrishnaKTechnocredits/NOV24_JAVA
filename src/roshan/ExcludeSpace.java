package roshan;

public class ExcludeSpace {
	static int a=0;
	static int b=0;
	
	static void getWithoutSapce (String word){
		for(int index=0 ;index<word.length();index++) {
			if( word.charAt(index)==' ') {
				 a++;
			}
			if( word.charAt(index)!=' ') {
			 b++;
			}
		}
		}
	public static void main(String[] args) {
	 ExcludeSpace.getWithoutSapce("my name is roshan Mokati");
	 System.out.println("total space count is "+ a + " "+"total alphabet are "+ b);
		
	}

}
