/*Assignment - 10 : 18th Nov'2024

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4

input : 5
output : Month index 5 is in Q2, its May.

input : 2
output : Month index 2 is in Q1, its Febuary.

input : -3
output: invalid month index, it can't be negative.

input : 13
output: invalid month index, it can't be greater than 13.
*/

package prashant;
public class Assignment10 {

void printMonthIndex(int index) {
		
        if(index >= 1 && index <= 3){
			
			if(index == 1){
				System.out.println("Month index 1 is in Q1, its Jan");
			}else if(index == 2){
				System.out.println("Month index 2 is in Q1, its Feb");
			}else{
				System.out.println("Month index 3 is in Q1, its March");
			}
		}
		
        if(index >= 4 && index <= 6){
			
			if(index == 4){
				System.out.println("Month index 4 is in Q2, its Apr");
			}else if(index == 5){
				System.out.println("Month index 5 is in Q2, its May");
			}else{
				System.out.println("Month index 6 is in Q2, its June");
			}
		}
        
        if(index >= 7 && index <= 9){
			
			if(index == 7){
				System.out.println("Month index 7 is in Q3, its July");
			}else if(index == 8){
				System.out.println("Month index 8 is in Q3, its Aug");
			}else{
				System.out.println("Month index 9 is in Q3, its Sept");
			}
		}
        
       if(index >= 10 && index <= 12){
			
			if(index == 10){
				System.out.println("Month index 10 is in Q4, its Oct");
			}else if(index == 11){
				System.out.println("Month index 11 is in Q4, its Nov");
			}else{
				System.out.println("Month index 12 is in Q4, its Dec");
			}
		}
       if(index>12 ) {
    	   System.out.println("invalid month index, it can't be greater than 13.");  
       }else if( index<0) {
    	   System.out.println("invalid month index, it can't be negative");  
       }
	}
	
	public static void main(String[] args) {
		Assignment10 assignment10=new Assignment10();
		assignment10.printMonthIndex(5);
		assignment10.printMonthIndex(2);
		assignment10.printMonthIndex(-3);
		assignment10.printMonthIndex(13);
	}
}
