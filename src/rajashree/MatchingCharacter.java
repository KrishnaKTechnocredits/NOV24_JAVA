//Assignment_20
package rajashree;
class MatchingCharacter{
	
	void countMatchingChar(String str,char x){
		int count =0;
		for(int index=0; index<str.length(); index++){
			if(str.charAt(index)== x){
				count++;
			}
		}
		System.out.println("Count of " +x+ " in " +str+ " is " +count);
	}
	public static void main (String[] args){
		MatchingCharacter matchingCharacter = new MatchingCharacter();
		matchingCharacter.countMatchingChar("aakanskha",'a');
	}
}