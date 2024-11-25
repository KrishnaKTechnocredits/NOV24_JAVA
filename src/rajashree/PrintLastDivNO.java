//Assignment_18
class PrintLastDivNO{
	int getLastDivNumber(int startIndex, int endIndex){
		int output=0;
		for(int index=endIndex; index>=startIndex;index--){
			if(index%5==0){
				output=index;
				break;
			}
		}
		return output;
	}
	public static void main (String[] args){
		PrintLastDivNO printLastDivNo = new PrintLastDivNO();
		int output=printLastDivNo.getLastDivNumber(10,498);
		System.out.println(output+ " is the last number which is div by 5 in the given range.");
	}
}
				
				