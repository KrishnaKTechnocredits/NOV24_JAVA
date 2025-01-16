/*Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14

printEvenNum(int startRange, int endRange){
for(int num=startRange; num<=endRange; num++){

}
}

printEvenNum(int startRange, int endRange){
for(; startRange<=endRange; startRange++){

}
}
 */
package nitesh.loop;

class EvenNumberVerfication{

	void printEvenNumber(int startRange, int endRange){
		for(int num = startRange;num <= endRange;num++ ){
			if(num%2 ==0){
				System.out.println("Even Numbers are "+ num);
			}
		}
	}
	public static void main(String[] args){
		EvenNumberVerfication evennumberverification = new EvenNumberVerfication();
		evennumberverification.printEvenNumber(10,15);
	}
}