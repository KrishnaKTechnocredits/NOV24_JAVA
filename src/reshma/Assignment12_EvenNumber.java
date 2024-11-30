package reshma;

public class Assignment12_EvenNumber {
	void printEvenNumber(int startindex,int endindex){
		System.out.println("Even numbers are: " );
		for (int i=10;i<=15;i++){
		if(i%2==0){
		System.out.println(i);
		}
		}
		}
		
		public static void main(String[] args) {
			Assignment12_EvenNumber m=new Assignment12_EvenNumber();
			m.printEvenNumber(10,15);
		}
}
