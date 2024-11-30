package swapnil;

public class Assignment22 {
	int count;
	int count1;
	 
	int getdigit(String str) {
		for (int num=0;num<str.length();num++) {
			boolean flag = Character.isDigit(str.charAt(num));
				if (flag == true) {
					count++;
				}
		}
			
		return(count);	
	}
	
	int getletter(String str) {
		for (int num=0;num<str.length();num++) {
			if (Character.isLetter(str.charAt(num))) {
				count1++;
			}	
		}
		return(count1);
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.getdigit("aa1kan33ks4h5a");
		assignment22.getletter("aa1kan33ks4h5a");
		System.out.println("Total " +assignment22.count+ " digits are there in given input.");
		System.out.println("Total " +assignment22.count1+ " letter are there in given input.");
		
		

	}

}


/*
Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
 */