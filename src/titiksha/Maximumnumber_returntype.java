//Find maximum of two numbers using return
package titiksha;

public class Maximumnumber_returntype {
	
	int maxNumber(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		else if(num1< num2){
			return num2;
		}
		return 3;
	}
	public static void main(String[] args) {
		Maximumnumber_returntype maxim=new Maximumnumber_returntype();
		int max=maxim.maxNumber(5,9);
		int max1=maxim.maxNumber(2,2);
		System.out.println("The maximum number is: "+max);
		System.out.println("The maximum number is: "+max1);
	}
}
