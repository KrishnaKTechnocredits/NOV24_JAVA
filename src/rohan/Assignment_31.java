package rohan;

public class Assignment_31 {
	
	int SumOfDigits(String input){
		int EvenSum = 0,OddSum=0;
		for(int i=0;i<input.length();i++){
			boolean flag = Character.isDigit(input.charAt(i));
			if(flag == true){
				int num = Character.getNumericValue(input.charAt(i));
				if(num%2==0){
				EvenSum += num;
				}else{
					OddSum += num;
				}
			}
		}
		
		int Diff = OddSum - EvenSum;
		System.out.println("Input: " + input + "\n" + "Output: " + Diff + "\n");
		return Diff;
	}
	
	public static void main(String [] args ){
		Assignment_31 a = new Assignment_31();
		int output1 = a.SumOfDigits("te1ch2no3cre7dits");
		int output2 = a.SumOfDigits("techno");
		int output3 = a.SumOfDigits("4563");
		//System.out.println(output1+","+output2+","+output3);
	}

}
