package ravindra;

public class ReturnUpperIfUfreqHigher_Lower_same {
	String returnFrequncy(String input) {
		int upperCaseCount=0;
		int lowerCaseCount=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			else {
				lowerCaseCount++;
			}
		}
		
		if(upperCaseCount>lowerCaseCount) {
			return "upper";
		}
		else if(upperCaseCount<lowerCaseCount) {
			return "lower";
		}
		else {
			return "Same";
		}
	}
	
	public static void main(String[] args) {
		String input="teChnOcreDits";
		ReturnUpperIfUfreqHigher_Lower_same returnUpperIfUfreqHigher_Lower_same=new ReturnUpperIfUfreqHigher_Lower_same();
		String return_value=returnUpperIfUfreqHigher_Lower_same.returnFrequncy(input);
		System.out.println(return_value);
	}
}
