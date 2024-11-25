package krishna;

//get string length without spaces
public class Assignment21 {
	
	void findInputLengthWithoutSapces(String str) {
	      	int lengthWithoutSpaces = 0;
	      	int spaceCount = 0;

	      	for (int i = 0; i < str.length(); i++) {
	      		if (str.charAt(i) != ' ') {
	      			lengthWithoutSpaces++;
	            } else {
	                spaceCount++;
	            }
	        }

	        System.out.println("Length without spaces: " + lengthWithoutSpaces);
	        System.out.println("Space characters: " + spaceCount);
	    }
	
    public static void main(String[] args) {
       new Assignment21().findInputLengthWithoutSapces("prem lata gupta");
    }
}

