package ashwini;

public class Assignment33 {

	//Assignment33-->Find count of each uppercase character in the given string :input -AABcBBBAdeddd

			int freqOfChar(String str,char letter) 
		{
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(letter==ch) {
					count++;
				}
			}
			return count;
		}
			
			void printFreqOfChar(String input) {
				for(int j=0;j<input.length();j++) {
					char ch1=input.charAt(j);
					Assignment33 assn33=new Assignment33();
					int ans= assn33.freqOfChar(input, ch1);
					int index = input.indexOf(ch1);
					if(j==index && Character.isUpperCase(ch1)) {
					System.out.println("Letter " +ch1 + " frequency is " + ans);
					}
			}
			}	
				
		     public static void main(String[] args) {
			Assignment33 assn33 = new Assignment33();
			assn33.printFreqOfChar("AABcBBBAdeddd");
			
		}

	}

