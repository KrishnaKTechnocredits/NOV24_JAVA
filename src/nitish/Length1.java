package nitish;

public class Length1 {

	void output(String str,char ch){
		int count=0;
		int spaceCount = 0;
		for(int x=0;x<str.length();x++) {
			if(str.charAt(x)==ch){
				spaceCount++;
			}else {
				count++;
			}
		}
		System.out.println("Length of the String '" +str+"' without space is "+count);
		System.out.println("Count of the spaces in '" +str+"' is "+spaceCount);
	}
	
	public static void main(String[] args) {
		String str = "Nitish Mehta";
		char ch =' ';
		Length1 length1 = new Length1();
		length1.output(str,ch);
		
	}

}
