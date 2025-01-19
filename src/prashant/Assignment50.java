/*Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47*/

package prashant;
public class Assignment50 {
	
	int minimumNum(int[] num)
    {
    	int max=num[0];
    	
    	for(int index=0;index<num.length;index++)
    	{
    		if(num[index] < max)//use max to check who is greater 
    		{
    			max=num[index];//update max
    			
    		}
    	}
    	
    	return max;
    	
    }

	public static void main(String[] args) 
	{
		int[] num= {44,45,22,25,47,29,46};
		int[] num1= {-44,-45,-22,-25,-47,29,46};
		
		
		Assignment50 assignment50=new Assignment50();
		int maxnum=assignment50.minimumNum(num);
		System.out.println(maxnum);
		
		int maxnum1=assignment50.minimumNum(num1);
		System.out.println(maxnum1);

	}

}
