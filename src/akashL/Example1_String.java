package akashL;

public class Example1_String {
			
	
		void printInputChar(String str) {
			for(int i=0; i<str.length();i++) {
				System.out.println(str.charAt(i));
			}
		}
		
		public static void main(String[] args) {
			String str="Techno Credits";
			new Example1_String().printInputChar(str);			
		}
}