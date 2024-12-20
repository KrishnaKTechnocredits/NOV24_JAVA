/*Assignment - 37 : 8th Dec [20 mins]
write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1
*/

package prashant;

public class Assignment37 {
	
	void getFreqNestedForLoop(String input)
	{
    	for(int index=0;index<input.length();index++) 
    	{
    		int count=0;
    		char ch=input.charAt(index);
    		if(input.indexOf(ch)==index) 
    		{ 
    		   for(int innerIndex=0;innerIndex<input.length();innerIndex++) 
    		   {
    			  char ch1=input.charAt(innerIndex);
    		
    			    if (ch==ch1) 
    			   {
    				count++;
    			   }
    			}
    		     System.out.println("Frequency of "+ ch+ " is " +count); 
    	     }
    	   }
	}

	public static void main(String[] args) {
		
		Assignment37 assignment37 =new Assignment37();
		assignment37.getFreqNestedForLoop("aakanksha");
		

	}

}
