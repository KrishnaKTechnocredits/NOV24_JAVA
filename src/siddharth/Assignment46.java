package siddharth;

/*Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r */

public class Assignment46 {
	void printMiddleChar(String[] name) {
		for(int index=0;index<name.length;index++) {
			if(name[index].length()%2==0) {
				System.out.println(name[index]+" -> "+name[index].charAt(name[index].length()/2-1));
			}else if(name[index].length()%2!=0){
				System.out.println(name[index]+" -> "+name[index].charAt(name[index].length()/2));
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment46.printMiddleChar(names);
	}
	
}
