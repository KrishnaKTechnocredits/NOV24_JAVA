package anuja.Array2;
/*
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r */
public class Assignment46 {
	
	char middleCh;

	public char getMiddleCHarFromStringOfArray(String[] names) {
		
		
		
		for(int i = 0; i<names.length ; i++) {
			int strLength = names[i].length();
			if(names[i].length()%2 == 0) {
				middleCh = names[i].charAt(strLength/2-1);
				System.out.println(names[i]+ " -- >" +middleCh);
			}
			else{
				middleCh = names[i].charAt(strLength/2);
				System.out.println(names[i]+ " -- >" +middleCh);
				
			}
			
		}
		return middleCh;
		
	}
	
	public static void main(String[] args) {
		Assignment46  assignment46 = new Assignment46();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment46.getMiddleCHarFromStringOfArray(names);
	}

}
