//Assignment - 46 : 15th Dec'2024 [15 mins]
//Print middle character of all the names from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Rohan -> h 
//Premlata -> m
//Anuja -> u
//Fazrana -> r

//10min
package fazrana.array;

public class FAssignment46 {
	void printMiddleLetter(String[] array) {
		for(int i=0; i< array.length;i++) {
			if(array[i].length()%2!=0) {
				int j=array[i].length()/2;
				char ch= array[i].charAt(j);
				System.out.println(array[i]+"->>"+ch);
			}else {
				int j=(array[i].length()/2)-1;
				char ch= array[i].charAt(j);
				System.out.println(array[i]+"->>"+ch);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		FAssignment46 fassignment46=new FAssignment46();
		fassignment46.printMiddleLetter(names);
	}
}
