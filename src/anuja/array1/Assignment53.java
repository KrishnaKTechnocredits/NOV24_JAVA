package anuja.array1;
/*
print the array in reverse order. 

input : {10,34,22,16,19,99}*/
public class Assignment53 {

	public void arrayReverese(int[] num) {
		for(int i = num.length-1 ; i>=0; i--) {
			System.out.println(num[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		int[] num = {10,34,22,16,19,99};
		System.out.println("Just print the array is reverse order \n");
		assignment53.arrayReverese(num);
	}
}
