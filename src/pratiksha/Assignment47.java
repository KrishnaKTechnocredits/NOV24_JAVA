package pratiksha;

public class Assignment47 {
/*
 Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana

 */
	void printlength(String[]array) {
		
		for(int i=0; i<array.length;i++) {
			
			if(array[i].length()>6) {
				
				System.out.println(array[i]);
			}
		}
	}
	public static void main(String[] args) {
		
		String[]names= {"Rohan","Premlata","Anuja","Fazarana"};
		
		Assignment47 assign47 = new Assignment47();
		
		assign47.printlength(names);
	}
}
