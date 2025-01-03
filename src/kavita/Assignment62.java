package kavita;
/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.
input={ "tech", "aashvi", "Credits", "Ansh" }
Time: 10m*/
import java.util.Arrays;
public class Assignment62 {
	String getrReverseString(String input){
		String str= "";
		for(int i=input.length()-1;i>=0;i--){
			char ch = input.charAt(i);
			str=str+ch;
		}
		return str;
	}
	
	String[] reverseStringRevOrder(String[] input){
		String[] output=new String[input.length];
		for(int i=0,j=output.length-1;i<input.length;i++,j--){
			output[j]=getrReverseString(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment62 assignment62=new Assignment62();
		String[] input={ "tech", "aashvi", "Credits", "Ansh" };
		String[] ans=assignment62.reverseStringRevOrder(input);
		System.out.println(Arrays.toString(ans));
	}
	
}
