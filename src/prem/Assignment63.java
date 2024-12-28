package prem;

import java.util.Arrays;

public class Assignment63 {
	
		String getReverseOrderReverseSmallLetterString(String input){
			String revName= "";
			for (int i= input.length()-1; i>=0 ; i--){
					revName =revName +input.charAt(i);
			if (i==0){
				revName= revName.toLowerCase();
			}	
			}
			return revName;
		}	
			
		void printReverseStringReverseOrder(String[] name){
			String[] output = new String[name.length];
			for(int i=0, j=name.length-1;i<=name.length-1;i++,j--){
			output[j] = getReverseOrderReverseSmallLetterString(name[i]);
			}
			System.out.print(Arrays.toString(output));
		}	

		public static void main(String[] args){
		Assignment63 assign63 = new Assignment63();
		String[] input ={"TeCh", "Aashvi", "Credits", "AnsH"};
		assign63.printReverseStringReverseOrder(input);
		}
}