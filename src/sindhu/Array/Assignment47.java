/*Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana */

package sindhu.Array;

public class Assignment47 {
	
	void getEvenString(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			if(str.length()>5) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana", "Sindhu"};
		Assignment47 assi47 = new Assignment47();
		assi47.getEvenString(names);
	}
}
