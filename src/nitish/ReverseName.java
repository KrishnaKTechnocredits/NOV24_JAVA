package nitish;

public class ReverseName {
	
	void output(String str){
		System.out.println("Below are the characters in reverse order"+"\n");
		for(int x=str.length()-1;x>=0;x--) {
			System.out.println("\t"+str.charAt(x));
		}
	}
	
	public static void main(String[] args) {
		String str = "Nitish Mehta";
		System.out.println("Length is "+str.length() +"\n");
		ReverseName reverseName = new ReverseName();
		reverseName.output(str);
		
	}

}
