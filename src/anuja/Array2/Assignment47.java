package anuja.Array2;
/*Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana*/
public class Assignment47 {

	public String getNamesLenGreater6(String[] names) {
		String name = "auja" ;
		
		for(int i = 0 ; i<names.length; i++) {
			if(names[i].length() > 6) {
				System.out.println(names[i]);
			}
		}
		
		
		return name;
		
	}
	
	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		String [] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment47.getNamesLenGreater6(names);
	}
}
