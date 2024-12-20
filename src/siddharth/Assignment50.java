package siddharth;

/*
 Assignment - 50 : 16th Dec'2024 [10 mins] [imp] return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22

input : {-44,-45,-22,-25,-47,29,46}
output : -47
 */

public class Assignment50 {
	
	int getMinNum(int[] arr) {
		int minNum = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(minNum>arr[index]) {
				minNum=arr[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int input1[] = {44,45,22,25,47,29,46};
		int answer1 = assignment50.getMinNum(input1);
		System.out.println("Output1 : "+answer1);
		int input2[] = {-44,-45,-22,-25,-47,29,46};
		int answer2 = assignment50.getMinNum(input2);
		System.out.println("Output1 : "+answer2);
	}
}
