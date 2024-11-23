package anuja;
/*print last 5 numbers which is divisible by 5*/
/*input 10 500*/
public class Assignment17 {
//method to print last 5 num divisiable by 5
//use reverse for loop
	int count = 0;
	void printLast5NumDivisibleBy5(int first, int last) {
	System.out.println("Last 5 num which are devisible by 5 are as below from the range of "+first+", "+last+"\n");
	//for loop to iterate all num, start from max   which is last and do it till reach to 1st num
		for(;last>=first; last--) {
			//write condition to check if divisible or not  by5
			if(last%5==0) {
				System.out.println(last + "\n");
				count++;
				if(count==5) {
					break;
				}
			}
		}
	}
	//main methode with object calling print method
	public static void main(String[] args) {
		Assignment17 Assignment17 = new Assignment17();
		Assignment17.printLast5NumDivisibleBy5(10, 500); //user defined input
	}
}
