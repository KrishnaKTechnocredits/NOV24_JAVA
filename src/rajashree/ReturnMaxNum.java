package rajashree;
//49.return the maximum number from given array. 

public class ReturnMaxNum {
	
	int MaxNum(int[] arr) {
		int maxnum =arr[0];
		for(int index=1; index<arr.length;index++) {
			if(maxnum < arr[index])
			maxnum = arr[index]; 
		}
		return maxnum;
	}
	public static void main (String[] args) {
		ReturnMaxNum ex1 = new ReturnMaxNum();
		int [] arr = {44,45,22,25,47,29,46};
		int [] arr1 = {-44,-45,-22,-25,-47,-29,-46};
		int num = ex1.MaxNum(arr);
		System.out.println(num);
		int num1 = ex1.MaxNum(arr1);
		System.out.println(num1);
	}
}
