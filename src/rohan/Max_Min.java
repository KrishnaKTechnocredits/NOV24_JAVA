package rohan;

public class Max_Min {

	public static void main(String[] args) {
		Max_Min maxmin = new Max_Min();
		maxmin.maximum(20,17);
		maxmin.minimum(20, 17);
	}
	void maximum(int num1,int num2) {
		if(num1>num2) 
			{
			System.out.println(num1+" is bigger between "+num1+" and "+num2);	
			}else 
			{
				System.out.println(num2+" is bigger between "+num1+" and "+num2);		
			}
	}
	void minimum(int num1,int num2) {
		if(num1<num2) 
			{
			System.out.println(num1+" is samller between "+num1+" and "+num2);	
			}else 
			{
				System.out.println(num2+" is smaller between "+num1+" and "+num2);		
			}
	}

}
