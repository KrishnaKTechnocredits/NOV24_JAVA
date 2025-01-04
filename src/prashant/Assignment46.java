

/*Assignment - 46 : 15th Dec'2024 [15 mins]
Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r*/


package prashant;

public class Assignment46 {
	
	void printMiddleChar(String[] names)
	{
		for(int index=0;index<names.length;index++)
		{
			int len=names[index].length();
			if(len % 2 ==0 )
			{
				char middleChar = names[index].charAt((names[index].length() / 2) - 1); // Middle left character
				System.out.println(names[index] + "=>" + middleChar);
			}
			else if (len % 2 - 1 == 0)
			{
				// If length is odd, then we want middle character:
				char middleChar = names[index].charAt(names[index].length() / 2); // Middle character
				System.out.println(names[index] + "=>" + middleChar);
			}
			
		}
		
		  //int len=names[0].length(); System.out.println(len);
		 
		
	}
	
	

	public static void main(String[] args) { 
		
		String[] names= {"Rohan", "Premlata", "Anuja", "Fazrana"};
		
		Assignment46 assignment46 =new Assignment46();
		assignment46.printMiddleChar(names);
		
		
		
 
	}

}
