/* Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
 */
package nitesh.loop;

class FirstThreeNumber{
	int count;

	void printFirstThree(int startRange,int endRange){
		for(int i=startRange;i<=endRange;i++){
			if(i%3 == 0 && i%4==0){
				count++;
				System.out.println("First 3 numbers divisible by 3 and 4 is :" + i);
				if(count == 3){
					break;
				}
			}
		}
	}
	public static void main(String[] args ){
		FirstThreeNumber firstthreenumber = new FirstThreeNumber();
		firstthreenumber.printFirstThree(10,50);		
	}
}