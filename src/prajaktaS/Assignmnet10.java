package prajaktaS;


public class Assignmnet10 {

	void months(int index) {
		if (index >=1 && index<=4){	
			
			if (index==1)
			{
				System.out.println("Month index "+index+ " is in Q1, its January");
			}
			else if (index==2)
			{
		
				System.out.println("Month index "+index+" is in Q1, its February");
			}
			else if (index==3) 
			{
				System.out.println("Month index "+index+" is in Q1, its March");
			}
			else if (index==4)
			{
			System.out.println("Month index "+index+" is in Q1, its April");
			}
		}
		else if (index >=5 && index<=8) {
			
			if(index==5)
			{
			System.out.println("Month index "+index+" is in Q2, its May");
			}
			else if (index==6)
			{
			System.out.println("Month index "+index+" is in Q2, its June");
			}
			else if (index==7)
			{
			System.out.println("Month index "+index+" is in Q2, its July");
			}
			else if (index==8)
			{
			System.out.println("Month index "+index+" is in Q2, its August");
			}
		}
		else if (index >= 9 && index<=12){
		
			if (index==9)
			{
			System.out.println("Month index "+index+" is in Q3, its September");
			}
			else if (index==10)
			{
			System.out.println("Month index "+index+" is in Q3, its October");
			}
			else if (index==11)
			{
			System.out.println("Month index "+index+" is in Q3, its November");
			}
			else if (index==12)
			{
			System.out.println("Month index "+index+" is in Q3, its December");
			}
		}
		else if(index>12){
			System.out.println("Invalid month index, it can't be greater than 13");
		}
		else if(index<0) {
			System.out.println("Invalid month index, it can't be negative");
		}
		else {
			System.out.println("Invalid month index");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Assignmnet10 assignment10=new Assignmnet10();
			assignment10.months(5);
			assignment10.months(2);
			assignment10.months(-3);
			assignment10.months(13);
	}

}
