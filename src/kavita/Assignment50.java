package kavita;
/*Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47

Time: 8m*/
public class Assignment50 {
	int getMinimumNum(int[] arr){
		int miniNumber=arr[0];
		for(int index=1;index<arr.length;index++){
			if(miniNumber>arr[index]){
				miniNumber=arr[index];
			}
		}
		System.out.println("Minimu Number is the given arraye is "+miniNumber);
		return miniNumber;
	}
	
	public static void main(String[] args){
		Assignment50 assignment50=new Assignment50();
		int[] input={44,45,22,25,47,29,46};
		int[] temp={-44,-45,-22,-25,-47,29,46};
		assignment50.getMinimumNum(input);
		assignment50.getMinimumNum(temp);
	}
}
