package reshma;

public class Assignment13_DivByNum {
	void printDivByNum(int startindex,int endindex){
		System.out.println("Divisible by 5 & 3, numbers are: ");
	for (int i=05;i<=40;i++){
	if(i%5==0 && i%3==0){
	System.out.println(i);
	}
	}
	}
	
	public static void main(String[] args) {
		Assignment13_DivByNum d=new Assignment13_DivByNum();
		d.printDivByNum(10,15);
	}
}
