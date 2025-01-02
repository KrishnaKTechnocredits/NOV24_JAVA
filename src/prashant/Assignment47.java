/*Assignment - 47 : 15th Dec'2024 [12 mins]
Print only names having length more than 6 characters from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Premlata
Fazrana
*/

package prashant;



public class Assignment47 {
	
	
		
		void printNamesLenght(String[] names)
		{
			for(int index=0;index<names.length;index++)
			{
				int len=names[index].length();
				if(len>=6)
				{
					System.out.println(names[index]);
				}
				
				
			}
			/*
			 * int len=names[0].length(); System.out.println(len);
			 */
			
		}

		public static void main(String[] args) 
		{
			
	         String[] names= {"Rohan", "Premlata", "Anuja", "Fazrana"};
			
	        Assignment47 assignment47 =new Assignment47();
	        assignment47.printNamesLenght(names);
		}

	}



