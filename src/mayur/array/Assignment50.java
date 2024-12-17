/*
 * Assignment - 50 : 16th Dec'2024 [10 mins] [imp]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47
 */

package mayur.array;

public class Assignment50 {
	
	int getMinNum(int[] num) {	
		int temp =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] < num[i+1] && num[i] <= temp) {
				temp=num[i];
			}else if(num[i+1] < num[i] && num[i+1] <= temp){
				temp=num[i+1];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Assignment50 obj = new Assignment50();
		int[] num1 ={44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,29,46};
		System.out.println(obj.getMinNum(num1));
		System.out.println(obj.getMinNum(num2));
	}

}
