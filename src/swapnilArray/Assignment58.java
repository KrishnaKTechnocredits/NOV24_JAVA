package swapnilArray;

public class Assignment58 {
	int maxlength =0,secMaxLength=0;
	
	void secMaxString(String[] input) {
		String secmaxString =input[0];
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
					secmaxString = input[i];
				}
				
			}
	
		System.out.println(secmaxString+ ":"+secMaxLength);
		}
		
	

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
		"PuGlobantne" };
		Assignment58 a = new Assignment58();
		a.secMaxString(input);

	}

}
