package sindhu;

public class MinMaxNumbers {
	void maxNum(int a,int b){
		if(b>a){
			System.out.println(b+" is bigger between "+a+" and "+b);
		}
		if(b<a) {
			System.out.println(a+" is bigger between "+a+" and "+b);
		}
	}

	public static void main(String[] args){
		MinMaxNumbers numbers = new MinMaxNumbers();
		numbers.maxNum(10,17);
	}
}
