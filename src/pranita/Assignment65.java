package pranita;

import java.util.Arrays;

public class Assignment65 {
	String firstLetInUpperCase(String word) {
		
		return word.substring(0, 1).toUpperCase()+ word.substring(1, word.length()-1)+ word.substring(word.length()-1).toLowerCase();
	}
	String getRevWord(String word) {
		 String output ="";
		 for(int index=word.length()-1;index>=0;index--) {
			 output=output+word.charAt(index);
		 }
		
		return output;
	}
	String getWordWithoutDigit(String word){
		String output="";
		for(int index=0;index<word.length();index++) {
			char ch=word.charAt(index);
			if(!Character.isDigit(ch)) {
				output=output+ch;
			}
		}
		return output;
	}
	String[] getProcessedArray(String[] arr) {
		String []output=new String[arr.length];
		for(int index=0,outputIndex=arr.length-1;index<arr.length;index++,outputIndex--) {
			String word=arr[index];
			word=getRevWord(arr[index]);
			word=getWordWithoutDigit(word);
			word=firstLetInUpperCase(word);
			output[outputIndex]= word;
		}
		
		return output;
	}

	public static void main(String[] args) {
		Assignment65 a65 = new Assignment65();
		String[] arr={"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		String[] ans=a65.getProcessedArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));

	}

}