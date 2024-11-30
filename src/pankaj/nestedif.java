package pankaj;

public class nestedif {
	
	int num;
	
	void sumof(int startrange,int endrange)
	{
		int sum=0;
		int count=0;
	
		 for(int num=startrange; num<endrange;num++)
		 {
			 if(num%5==0 && num%3==0)
			 {
				 System.out.println("  "+num);
				 sum=sum+num;
				 count++;
				
			 }
			  
		  }
		 
		 System.out.println("There are " +count+ " "+ "numbers in the range in between"+" "+startrange+" to "+endrange);
		
		
		 
		 System.out.println("The sum of the numbers          ==>>"+sum);
	}
	

	public static void main(String[] args)
	{
		nestedif nest=new nestedif();
		nest.sumof(1,70);

	}

}
