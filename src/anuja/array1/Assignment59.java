package anuja.array1;
/*print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne*/
public class Assignment59 {
	
	
	public void getAllStringAndLengthEach(String[] names) {
		System.out.println("All strings with their lengths:");
		for(int i = 0 ; i<names.length ; i++) {
			System.out.println(names[i] +" --> "+names[i].length());
		}
		System.out.println("-----------------------------------------------");
	}
	
	public void getSecondMaxLength (String[] names) {
		int maxLen = names[0].length() ;
		String maxLenStr = names[0];
		int secondMaxLen = 0 ;
		String secondString = "";
		
		for(int i = 0 ; i<names.length ; i++) {
			if(maxLen < names[i].length()) {
				secondString = names[0];
				secondMaxLen = names[0].length();
				maxLen = names[i].length();
				maxLenStr = names[i];
			}
			
			else if(secondMaxLen < names[i].length()) {
				secondMaxLen = names[i].length();
				secondString = names[i];

			}
		}
		
		System.out.println("Second max single string and its length is: " + secondString +" --> "+secondString.length());
		System.out.println("----------------------------------------");
		getAllSecondMaxString(names , secondString.length());

	}
	//method to check all secondmax string
	public void getAllSecondMaxString(String[] names, int secondMxLen) {
		System.out.println("All second max string are as below \n");
		for(int i = 0 ; i< names.length ; i++) {
			if(names[i].length() == secondMxLen) {
				System.out.println(names[i] +"-->"+names[i].length());
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		String[] names = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		assignment59.getAllStringAndLengthEach(names);
		assignment59.getSecondMaxLength(names);
		
	}
}
