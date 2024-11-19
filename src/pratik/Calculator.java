package pratik;	

public class Calculator {
    int num1=10;
		  int num2=2;
		  int ans;
		  
		void add(){
		  ans = num1+num2;
		  System.out.println("Addition is "+ans);
		 }
        void  substraction (){
		  ans=num1-num2;
		  System.out.println("Substraction is "+ans);
		 }
        void multiply (){
		  ans=num1*num2;
		  System.out.println("Multiply is "+ans);
		 }
		 void divide(){
		  ans=num1/num2;
		  System.out.println("Divide is "+ans);
		 }
		 public static void main(String[]args){
		 Calculator calculator= new Calculator();
		 calculator.add();
		 calculator.substraction();
		 calculator.multiply();
		 calculator.divide();
		
		 }
		 

}
