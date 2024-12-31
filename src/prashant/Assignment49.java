/*Assignment - 49 : 16th Dec'2024 [15 mins] [imp]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22*/

package prashant;

public class Assignment49 {
	
	int maxNum(int[] num)
    {
    	int max=num[0];
    	
    	for(int index=0;index<num.length;index++)
    	{
    		if(num[index] > max)//use max to check who is greater 
    		{
    			max=num[index];//update max
    			
    		}
    	}
    	
    	return max;
    	
    }
	
	
	public static void main(String[] args) 
	{
		int[] num= {44,45,22,25,47,29,46};
		int[] num1= {-44,-45,-22,-25,-47,-29,-46};
		
		
		Assignment49 assignment49=new Assignment49();
		int maxnum=assignment49.maxNum(num);
		System.out.println(maxnum);
		
		int maxnum1=assignment49.maxNum(num1);
		System.out.println(maxnum1);

	}


}
