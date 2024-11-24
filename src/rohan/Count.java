package rohan;

public class Count {

	public static void main(String[] args) {
		Count count = new Count();
		count.StringInput("aankansha",'a');
	}
	void StringInput(String string, char ch) {
		int count=0;
		for(int i=0 ; i<= string.length()-1;i++) 
		{
			if(string.charAt(i) == ch) 
			{
				count++;
			}
		}
		System.out.println("count of "+ch+" in "+string+" is "+count);
	}

}
