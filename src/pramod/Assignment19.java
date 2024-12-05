/*Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t  
		 
*/

package pramod;
class Assignment19 {
    
    void getString(String str) {
        System.out.println("Orignal string as :"+str);
        System.out.println("Reversed string as belwo:");
        for(int index=str.length()-1; index>=0; index--) {
            System.out.println(str.charAt(index));
        }
        
}
    public static void main(String[] args) {
        Assignment19 m=new Assignment19();
        m.getString("Pramod");
    }
}