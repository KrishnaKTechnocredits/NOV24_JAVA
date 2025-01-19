package ashwini.ArrayProgram;
/*Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana */

public class Assignment47Array {

	void charLengthArr() {
	 String[] names= {"Rohan", "Premlata", "Anuja", "Fazrana"};
	 for(int index=0;index<names.length;index++) {
		  if( names[index].length() > 6 ) {
			 System.out.println(names[index]);
		 }
	 }
}
	public static void main(String[] args) {
		Assignment47Array assn47 = new Assignment47Array();
		assn47.charLengthArr();

	}

}
