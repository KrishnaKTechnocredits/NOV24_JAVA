/*
Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 

*/

package pramod;
class Assignment21 {
    
    void printCharLenExcSpace(String str) {
        int Space=0;
        int LenExcSpac=str.length();
        System.out.println("Orignal string as :"+str);
        for(int index=0; index<str.length(); index++) {
            if(str.charAt(index)==' ') {
                Space++;
            }
         }
         int withoutspace=LenExcSpac-Space;
         System.out.println("Length without space is:"+withoutspace+" and Space characters are:"+Space);
    }
    public static void main(String[] args) {
        Assignment21 m=new Assignment21();
        m.printCharLenExcSpace("PRAMOD MANE");
        
    }
}