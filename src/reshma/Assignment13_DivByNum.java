package reshma;

public class Assignment13_DivByNum {
	void printDivByNum(int startindex,int endindex){
		System.out.println("Divisible by 3 & 5, numbers are: ");
	for (int i=startindex;i<=endindex;i++){
	if(i%3==0 && i%5==0){
	System.out.println(i);
	}
	}
	}
	
	public static void main(String[] args) {
		Assignment13_DivByNum d=new Assignment13_DivByNum();
		d.printDivByNum(10,40);
	}
}
