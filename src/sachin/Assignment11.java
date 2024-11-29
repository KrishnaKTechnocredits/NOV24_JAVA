package sachin;

public class Assignment11 {
	 
	void maxNumber(int num1,int num2){
		if(num1>num2){
		 System.out.println(num2 +" "+ "is smaller between "+ num1+" and "+num2 );
		}else{
		 System.out.println(num2 +" "+ "is greater between "+ num1+" and "+num2 );
		   
		 }
	}
	
	void minNumber(int num1,int num2){
		if(num1<num2){
		 System.out.println(num1 +" "+ "is smaller between "+ num1+" and "+num2 );
		}else {
		 System.out.println(num2 +" "+ "is grater between "+ num1+" and "+num2 );
		   
		}
	}
	
	public static void main (String [] args){
	 Assignment11 assignment11 =  new Assignment11();
	 assignment11.minNumber(10,17);
	 assignment11.maxNumber(10,17);
	 }
 }
	