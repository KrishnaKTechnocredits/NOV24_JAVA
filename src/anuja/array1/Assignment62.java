package anuja.array1;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}

input : {"Te1ch", "A2as3hvi", "Cre45di555ts", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]cet]
*/
public class Assignment62 {

	public String reverseWord(String name) {
		String word = "";
		for(int i = name.length()-1; i>=0 ; i--) {
			word+= name.charAt(i);
		}
		return word;
	}
	
	public String[] revrseOrderArrayWithReverseString(String[] names) {
		String[] newArr = new String[names.length];
		
		for(int j  = names.length -1 ; j>= 0 ; j--) {
			newArr[j] = reverseWord(names[names.length -1]);
		}
		
		return newArr;
		
	}
	
	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		String[] names  =  {"Te1ch", "A2as3hvi", "Cre45di555ts", "Ansh"};
		System.out.println("Input Array1 is: ");
		System.out.println(Arrays.toString(names));
		System.out.println("---------------------------------------------------");
		String[] result = assignment62.revrseOrderArrayWithReverseString(names);
		System.out.println("Output array with reverse each string in reverse order: ");
		System.out.println(Arrays.toString(result));
	}

}
