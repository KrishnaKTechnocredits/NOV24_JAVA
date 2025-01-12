package kavita;
/*print all the second maximum length string from given array.
input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
Time:20m */
public class Assignment59 {
	void displaySecMaxLen(String[] input){
		String maxLen=input[0];
		String secMaxLen=input[1];
		if(input[1].length()>input[0].length()){
			maxLen=input[1];
			secMaxLen=input[0];
		}
		for(int i=2;i<input.length;i++){
			if(input[i].length()>maxLen.length()){
				secMaxLen=maxLen;
				maxLen=input[i];
			}else if(input[i].length()>secMaxLen.length()){
				secMaxLen=input[i];
			}
		}
		displayAllSecMaxLen(input,secMaxLen.length());
	}
	
	void displayAllSecMaxLen(String[] input,int targetlen){
		for(int i=0;i<input.length;i++){
			if(input[i].length()==targetlen){
				System.out.println(input[i]);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment59 Assignment59=new Assignment59();
		String[] input={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59.displaySecMaxLen(input);
	}
}
