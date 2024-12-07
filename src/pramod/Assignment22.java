/*Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)*/

package pramod;
class Assignment22 {
    
    void getCoutOfLetterAndDigit(String str) {
        int Digit=0;
        int Letter=0;
        System.out.println("Orignal string as :"+str);
        for(int index=0; index<str.length(); index++) {
            if(Character.isDigit(str.charAt(index))) {
                Digit++;
            }
            else {
                Letter++;
            }
         }
         System.out.println("Letter count is: "+Letter+" and Digit count is:"+Digit);
    }
    public static void main(String[] args) {
        Assignment22 m=new Assignment22();
        m.getCoutOfLetterAndDigit("T1e22c3h4n5o6");
        
    }
}