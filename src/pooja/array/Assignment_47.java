package pooja.array;
/*
 * Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana

*/
public class Assignment_47 {
	
	void printCharLength6andMore(String[] strs) {
		System.out.println("Strings having more than 6 characters in it are : ");
		for(int i=0;i<strs.length;i++) {
			if(strs[i].length()>6) {
				System.out.println(strs[i]);
			}
		}
	}
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment_47 assignment_47 = new Assignment_47();
		assignment_47.printCharLength6andMore(names);		
	}
}