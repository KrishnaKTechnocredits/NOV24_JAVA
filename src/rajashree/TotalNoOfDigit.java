//Assignment_22
package rajashree;
class TotalNoOfDigit{
	int count=0;
	int countNoOfDigit(String str){
		for(int index=0; index<str.length(); index++){
			char c = str.charAt(index);
			if(Character.isDigit(c)){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		TotalNoOfDigit totalcount = new TotalNoOfDigit();
		int count = totalcount.countNoOfDigit("aa1kan33ks4h5a");
		System.out.println("total "+count+ " digits are there in given input.");
	}
}
				
		