package ravindra;

public class PrintMidleCharInStringFromArray {
	void printmidleChar(String[] names) {
		for(int i=0;i<names.length;i++) {
			int lengthOfstrings=names[i].length();
			if(lengthOfstrings%2==1) {
				char ch=names[i].charAt(lengthOfstrings/2);
				System.out.println(names[i]+"->"+ch);
			}
			if(lengthOfstrings%2==0) {
				char ch=names[i].charAt((lengthOfstrings/2)-1);
				System.out.println(names[i]+"->"+ch);
			}
		}
	}
	
	public static void main(String[] args) {
		String [] names={"Rohan", "Premlata", "Anuja", "Fazrana"};
		PrintMidleCharInStringFromArray printMidleCharInStringFromArray=new PrintMidleCharInStringFromArray();
		printMidleCharInStringFromArray.printmidleChar(names);
	}
}
