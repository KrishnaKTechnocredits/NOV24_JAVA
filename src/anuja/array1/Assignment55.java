package anuja.array1;
/*return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}*/
public class Assignment55 {
	public int[] getUnionOfTwo(int[] arr1, int[] arr2) {
		int[] unionArr = new int[arr1.length + arr2.length];
		int index = 0 ;
		System.out.println("Input Aarray 1 ");
		for(int i= 0 ; i<arr1.length ; i++ , index++) {
			unionArr [index] = arr1 [i];
			System.out.print(arr1[i] +" ");

			
			//index++;
		}
		System.out.println("\n" +"Input Aarray 2 ");
		
		for(int j= 0  ; j<arr2.length ; j++ , index++) {
			unionArr [index] = arr2 [j];
			//index++;
			System.out.print(arr2[j] +" ");
		}
		return unionArr;
	}
	
	public static void main(String[] args) {
		Assignment55 a = new Assignment55();
		int[] arr1 = {10,19,18};
		int[] arr2 = {99,8};
		int[] result = a.getUnionOfTwo(arr1 , arr2);
		System.out.println("\n -------------------");
		System.out.println("Union of two array is ");
		for(int index = 0 ; index < result.length ; index++) {
			System.out.print(result[index] +" ");
		}
	}
}
