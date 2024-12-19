package nilam.Array;

public class Assignment52 {
	
	int[] getMaxMinNum(int[] numArray) {
		int [] output=new int[2];
		int minNum=numArray[0], maxNum=numArray[0];
		
		for(int index=1;index<numArray.length;index++) {
			if(minNum>numArray[index]) {
				minNum=numArray[index];
			}
			
			if(maxNum<numArray[index]) {
				maxNum=numArray[index];
			}
		}
		output[0]=minNum;
		output[1]=maxNum;
		return output;
	}
	public static void main(String[] args) {
		Assignment52 assignment52=new Assignment52();
		int[] numArray= {50,5,7,5,96};
		int[] minMaxNum=assignment52.getMaxMinNum(numArray);
		System.out.println("Minimum number is: "+minMaxNum[0]);
		System.out.println("Maximum number is: "+minMaxNum[1]);
	}
}
