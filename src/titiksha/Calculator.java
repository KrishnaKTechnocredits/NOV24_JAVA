package titiksha;
public class Calculator{

	int num1 = 10;
	int num2 = 2;
	int ans;

	void add(){

		ans=num1+num2;

		System.out.println("Addition is " + ans);}

	void multiple(){

		ans=num1*num2;

		System.out.println("Multiple is " + ans);}

	void divide(){

		ans=num1/num2;

		System.out.println("Division is " + ans);}

	void subtraction(){

		ans=num1-num2;

		System.out.println("Subraction is " + ans);}
		
	public static void main(String[] args){

		Calculator calculator=new Calculator();

		calculator.add();

		calculator.multiple();

		calculator.divide();

		calculator.subtraction();
	
		}
}