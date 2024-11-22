package sindhu;

public class MinMaxNumbers {
	void maxNum(int a,int b){
		if(b>a){
			System.out.println(b+" is bigger between "+a+" and "+b);
		}
	}
	
	void minNum(int a,int b){
		if(a<b){
			System.out.println(a+" is smaller between "+a+" and "+b);
		}
	}
	
	public static void main(String[] args){
		MinMaxNumbers numbers = new MinMaxNumbers();
		numbers.maxNum(10,17);
		numbers.minNum(10,17);
	}
}
