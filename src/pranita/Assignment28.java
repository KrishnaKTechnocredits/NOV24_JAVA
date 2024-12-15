package pranita;

class Assignment28{
	
		int charToAscii(char ch){
			int ascii = ch ;
			return ascii;
		}
		
		void printCharToAscii(){
			System.out.println("Characters with their Ascii values :");
			for(char ch1 = 'A';ch1<='Z';ch1++){
				int ans = charToAscii(ch1);
				System.out.println(ch1 + " : " + ans);
			}
		}
		
		 void printCharactersForAscii(int startRange, int endRange) {
			System.out.println("The ASCII to Character from 65 to 100 :");
			for (int i = startRange; i <= endRange; i++) {
				System.out.println(i + " : " + (char) i);
			}
		}
		
		public static void main (String[]args){
		Assignment28 assignment28 = new Assignment28();
		assignment28.printCharToAscii();
		assignment28.printCharactersForAscii(65,100);
		}
	}

