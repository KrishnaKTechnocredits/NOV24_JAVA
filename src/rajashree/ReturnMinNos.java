package rajashree;
//50.return the minimum number from given array. 

public class ReturnMinNos {
	
	int MinNum(int[] arr) {
		int minnum =arr[0];
		for(int index=1; index<arr.length;index++) {
			if(minnum > arr[index])
			minnum = arr[index]; 
			}
			return minnum;
		}
	
	public static void main (String[] args) {
		ReturnMinNos ex1 = new ReturnMinNos();
		int [] arr = {44,45,22,25,47,29,46};
		int [] arr1 = {-44,-45,-22,-25,-47,-29,-46};
		int num = ex1.MinNum(arr);
		System.out.println(num);
		int num1 = ex1.MinNum(arr1);
		System.out.println(num1);
	}
}
