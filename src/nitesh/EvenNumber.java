package nitesh;

public class EvenNumber {
	//int startrange;
	//int endrange;
	
	void printEvenNumber(int startrange,int endrange) {
		//this.startrange = startrange;
		//this.endrange = endrange;
		for (int index=startrange;index<=endrange;index++) {
			if (index%2==0) {
				System.out.println("Even numbers are"+" "+index );
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumber evennumber = new EvenNumber();
		evennumber.printEvenNumber(10,15);
	}

}
