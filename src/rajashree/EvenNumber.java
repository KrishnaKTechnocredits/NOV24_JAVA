//Assignment12
package rajashree;
class EvenNumber{
	
	void printEvenNumber(int startRange,int endRange){
		System.out.println("Even numbers are");
		for(int num=startRange;num<=endRange;num++){
			if(num%2==0){
			System.out.println(num);
			}
		}
	}
	public static void main(String[] args){
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.printEvenNumber(10,15);
	}
}
	
	