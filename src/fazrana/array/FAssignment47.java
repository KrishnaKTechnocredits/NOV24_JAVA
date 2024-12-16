//Assignment - 47 : 15th Dec'2024 [12 mins]
//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Premlata
//Fazrana
// 5min
package fazrana.array;

public class FAssignment47 {
	void printNum(String[] array) {
		for(int i=0; i< array.length;i++) {
			if(array[i].length() >6) {
				System.out.println(array[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		FAssignment47 fassignment47=new FAssignment47();
		fassignment47.printNum(names);
	}
}
