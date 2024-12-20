package anuja.Array2;
/*
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r */
public class Assignment46 {

	public void getMiddleCharFromString(String[] name) {
		for (int i = 0 ; i<name.length;i++) {
			int middlechar = name[i].length()/2;
			if(name[i].length()/2 % 2 == 0) {
				System.out.println(name[i].charAt(i)+"--"+name[i]);
				}
			else {
				int len1= name[i].length()+1/2;
				i=len1/2;
				System.out.println(name[i].charAt(i)+"--"+name[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment46.getMiddleCharFromString(names);
	}
}
