package ashwini.ArrayProgram;

public class TestChallenge2 {
	int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
         return count;
    }
	String[] revStringArray(String[] arr) {
		String[] output=new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            
            if (countVowels(str) > 1) {
                output[i] = new StringBuilder(str).reverse().toString();
            } else {
                output[i] = str;
            }
        }		
		return output;
	}

	public static void main(String[] args) {
		TestChallenge2 tc2=new TestChallenge2();
		String[] arr= { "apple", "sky", "orange", "try", "eagle"};
		String[] ans=tc2.revStringArray(arr);
		System.out.print("Input: apple , sky ,orange , try , eagle}");
		System.out.println(" ");
		System.out.print("output: {");
		for (int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+ " ");
	}
		System.out.print("}");

	}
}