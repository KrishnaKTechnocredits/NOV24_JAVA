package ashwini.nestedForLoopAssignment;
//Assignment37-->write a loop(nested for loop) and print frequency of each character.

public class Assignment37 {
	
    void getFreqNestedForLoop(String input){
    	for(int index=0;index<input.length();index++) {
    		int count=0;
    		char ch=input.charAt(index);
    		if(input.indexOf(ch)==index) { //index of ch and index value is same then inner for loop will be executed.
    		for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
    			char ch1=input.charAt(innerIndex);
    		
    			if (ch==ch1) {
    				count++;
    			}
    			
    		}System.out.println("Frequency of "+ ch+ " is " +count); 
    	}
    	}
	
}
	public static void main(String[] args) {
		Assignment37 a37= new Assignment37();
		a37.getFreqNestedForLoop("aakanksha");
	}

}
