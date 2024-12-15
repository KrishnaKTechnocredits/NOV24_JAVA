/*Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r*/

package SheetalG;

public class StringArrayCharacter {
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for(int i=0;i<names.length;i++) {
			String name =names[i];
			int length=name.length();
			int middleIndex=length/2;
			
			char middleChar = name.charAt(middleIndex);
			System.out.println(name + " -> " + middleChar);
			
		}
	}
}
