package rajashree;
//52.return maximum and minimum number from given array. 

public class ReturnMaxAndMinNo {
	
	int[] getMaxAndMinNo(){
		int[] arr = {44,45,22,25,47,29,46};
		int maxNum=arr[0];
		int minNum=arr[0];
		int[] output=new int[2];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum=arr[i];
			}
			if(arr[i]<minNum) {
				minNum=arr[i];
			}
		}
		output[0]=maxNum;
		output[1]=minNum;
	
		return output;
	}
	public static void main(String[] args) {
		ReturnMaxAndMinNo ex1 = new ReturnMaxAndMinNo();
		int[] output1=ex1.getMaxAndMinNo();
		for(int i=0; i<output1.length ;i++) {
			System.out.println(output1[i]);
		}
	}

}
