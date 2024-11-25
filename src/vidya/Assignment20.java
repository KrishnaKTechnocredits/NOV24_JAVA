package vidya;


public class Assignment20 {
	String str = "aakanskha, a";
	char ch = 'a'; 
	
	int getCharFreq(String str, char ch) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == ch) 
				count++;
		}
			return count;
	}

		
		public static void main(String[] args) {
			Assignment20 assignment20 = new Assignment20();
			int count = assignment20.getCharFreq("aakanskha, a", 'a'); 
			System.out.println("Count of a in aakanskha, a is "+ count);
		}
			
			}
	

/*int getCharFreq(String str, char ch){
     return count;
} */