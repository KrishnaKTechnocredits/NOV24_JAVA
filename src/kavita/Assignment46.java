package kavita;
/*Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r
Time:17min */
public class Assignment46 {
	void middleumber(String[] names) {
		
		 for(int index=0;index<names.length;index++) {
			 
			 String str=names[index];
			 int middleindex;
			 
			 if(str.length()%2==0) {
				 middleindex=str.length()/2-1;  // even length of the name
			 }else {
				 middleindex=str.length()/2;  // odd length of the name
			 }
			 char ch=str.charAt(middleindex);
			 System.out.println(str+ " has a middle character -->"+ch);
		 }
		
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment46 assignment46=new Assignment46();
		assignment46.middleumber(names);
	}
}
