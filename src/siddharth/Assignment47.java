package siddharth;

/*Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana */

public class Assignment47 {
	
	void printNames(String[] names) {
		for(int index=0;index<names.length;index++) {
			if(names[index].length()>6) {
				System.out.println(names[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment47.printNames(names);
	}
}
