package swapnil;

public class Assignment59 {
int maxlength =0,secMaxLength=0;
	
	void secMaxString(String[] input) {
		
		if(input[0].length()>input[1].length()) {
			maxlength=input[0].length();
			secMaxLength=input[1].length();
		}
		for(int i=2;i<input.length;i++) {
			if(maxlength<input[i].length()) {
				maxlength=input[i].length();
			}
			else if(secMaxLength<=input[i].length()) {
					secMaxLength=input[i].length();
					
				}
				
			}
		secMaxAllString(input,secMaxLength);
		}
	void secMaxAllString(String[] input,int taglength) {
		for(int i=0;i<input.length;i++) {
		if(input[i].length()==taglength) {
			System.out.println(input[i]);
		}
	}
	}
	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
		"PuGlobantne" };
		Assignment59 a = new Assignment59();
		a.secMaxString(input);

	}

}
