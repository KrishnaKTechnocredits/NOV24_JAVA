package kavita;
/*Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana
Time: 10m*/
public class Assignment47 {
	void printName(String[] input) {
		for(int index=0;index<input.length;index++) {
			if(input[index].length()>6) {
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment47 assignment47=new Assignment47();
		assignment47.printName(names);
	}
}
