package roshan.Array2;

public class UnionOfTwoArray {
	 
	int[] arrayUnion (int[] num1 ,int []num2) {
		int [] output = new int [num1.length+num2.length];

		int count=0;
		for(int i=0;i<num1.length;i++) {
			output[count] = num1 [i] ;
			count++;
		}
		
		for(int j=0 ;j<num2.length;j++) {
			output [count]=num2 [j];	
			count++;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		int [] num1= {1,2,3,4,5};
		int [] num2= {6,7,8,10};
		UnionOfTwoArray unionoftwoarry = new UnionOfTwoArray();
		int [] result = unionoftwoarry.arrayUnion(num1,num2);
		System.out.println("Union of two  array is ");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
        
		
	}
    
}
//note mistake made in code tried to add two array see thee below code return before


/*
 * Assignment - 55 : 18th Dec'2024 [15-20 mins]
 * 
 * return union of given two array.
 * 
 * input : {10,19,18} {99,8}
 * 
 * output : {10,19,18,99,8}
 */


//before written code
//package roshan.Array2;

//public class UnionOfTwoArray {
  
 // int[] arrayUnion (int[] num1 ,int []num2) {
     // int [] output = new int [num1.length+num2.length];
     // int[] union1 = new int[num1.length];
     // int[] union2 = new int[num2.length];
     // int count=0;
     // for(int i=0;i<num1.length;i++) {
         // union1[count] = num1 [i] ;
         // count++;
     // }
     
     // for(int j=0 ;j<num2.length;j++) {
         // union2 [count]=num2 [j]; 
         // count++;
     // }
     // output [count]= union1 [count] + union2[count];
     // return output;
     
 // }
 
 // public static void main(String[] args) {
     // int [] num1= {1,2,3,4,5};
     // int [] num2= {6,7,8,10};
     // UnionOfTwoArray unionoftwoarry = new UnionOfTwoArray();
     // int [] result = unionoftwoarry.arrayUnion(num1,num2);
     // System.out.println("Union of two  array is ");
     // for(int i=0;i<result.length;i++) {
         // System.out.println(result[i]);
     // }
     
     
 // }
 
//}
