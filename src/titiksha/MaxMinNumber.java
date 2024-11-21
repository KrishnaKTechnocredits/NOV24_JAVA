package titiksha;

public class MaxMinNumber 
{
	void maximumNum(int num1 ,int num2) {
		int max;
		if(num1>num2) {
			max=num1;
		}
		else {
			max=num2;
		}
		System.out.println(max + " is bigger between " + num1 + "&" + num2);
		}
	
	void minimum(int num1,int num2) {
		int min;
		if(num1<num2) {
			min=num1;
		}
		else {
			min=num2;
		}
		System.out.println(min + " is smaller between " + num1 + "&" + num2);
		}
	public static void main(String[] args) {
		MaxMinNumber maxmin = new MaxMinNumber();
		maxmin.maximumNum(17,10);
		maxmin.minimum(10,17);
	}
}
