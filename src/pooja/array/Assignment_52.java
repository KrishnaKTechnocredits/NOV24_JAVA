package pooja.array;
/*Assignment - 52 : 16th Dec'2024 [15 mins]

return maximum and minimum number from given array.

int getMaxMinNum(int[] arr){

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
} 
*/
public class Assignment_52 {
	
	int[] getMaxAndMinNo(int[] arr) {
		int[] ans=new int[2];
		int max = arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		ans[0]=max;
		ans[1]=min;
		return ans;	
	}
	public static void main(String[] args) {
		int[] input= {44,45,22,25,47,29,46};
		int[] input2={-44,-45,-22,-25,-47,-29,-46};
		Assignment_52 assignment_52=new Assignment_52();
		int[] ans =  assignment_52.getMaxAndMinNo(input);
		int[] ans2 = assignment_52.getMaxAndMinNo(input2);
		System.out.println("The Max number from given array is : " + ans[0] + "\n" + "The Minimum number from given array is : " + ans[1]);
		System.out.println("---------------------------------------------");
		System.out.println("The Max number from given array is : " + ans2[0] + "\n" + "The Minimum number from given array is : " + ans2[1]);
	}
}