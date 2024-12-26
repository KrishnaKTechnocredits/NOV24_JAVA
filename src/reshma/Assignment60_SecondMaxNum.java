package reshma;
/* return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 */

public class Assignment60_SecondMaxNum {
	int getSecondMaxNum(int[] input){
	    int MaxNum=0;
	    int SecondMaxNum=0;
	    for(int i=0;i<input.length;i++){
	      if(input[i]>MaxNum){
	       SecondMaxNum =MaxNum;
	        MaxNum= input[i];
	      }else{
	      if(input[i]>=SecondMaxNum){
	        SecondMaxNum=input[i];
	      }
	    }
	    }
	    return SecondMaxNum; 
	  }
	  
	  public static void main (String[] args){
		  Assignment60_SecondMaxNum a60=new Assignment60_SecondMaxNum();
		  int []input= {33,33,19,55,53,11};
		  int num=a60.getSecondMaxNum(input);
		  System.out.println("Second Maximum Num is " +num);
	    }
}
