package Assignment_Array;

public class Assignment46 {
	
	void printMiddleCharacter(String[] str) {
		for(int i =0;i<str.length;i++) {
			if(str[i].length()%2==0) {
				System.out.println("Middle character for name "+ str[i]+ " is "+  (str[i].charAt((str[i].length()-1)/2)));
			}else
				System.out.println("Middle character for name "+ str[i]+ " is "+  (str[i].charAt(str[i].length()/2)));
		}
	}

	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		new Assignment46().printMiddleCharacter(names);
	}
}
