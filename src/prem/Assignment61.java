package prem;

public class Assignment61 {
	
	String printString(String name) {
		String revName ="";
		for(int j=name.length()-1; j>=0;j--) {
		revName =revName + name.charAt(j);
	    }
		return revName;
    }
	
	void printReverseArrayString(String[] input) {
		for(int i=0; i<=input.length-1;i++) {
			String name = printString(input[i]);
		System.out.println(name);
		}
	}
	
	public static void main(String[] args){
	Assignment61 assign61 = new Assignment61();
	String[] input= {"tech", "aashvi", "credits"};
	assign61.printReverseArrayString(input);	
	}
}
