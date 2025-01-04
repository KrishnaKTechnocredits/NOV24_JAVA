package anuja.array1;
/*
return the minimum number from given 	. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47*/
public class Assignment50 {
	
	public int getMin(int[] num) {
		int min = num[0];
		for(int i = 0 ; i<num.length ; i++) {
			if(min > num[i])
				min = num[i];
		}
		return min ;
	}
	
	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		
		 int[] min1= {44,45,22,25,47,29,46};
		 int[] min2 = {-44,-45,-22,-25,-47,29,46};
		 
		int result1 = assignment50.getMin(min1);
		System.out.println("Min Nuber from Array2 is " +result1);
		
		System.out.println("----------------------");
		int result2 = assignment50.getMin(min2);

		System.out.println("Min Nuber from Array2  is " +result2);
		assignment50.getMin(min2);
	}

}
