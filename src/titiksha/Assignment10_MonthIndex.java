package titiksha;

public class Assignment10_MonthIndex {
String month=" ";
void quater (int index) {
	if (index >=1 && index <=3) {
		if (index == 1) {
			month="Janauary";}
		else if (index == 2) {
			month="Febrary";}
		else if (index == 3) {
			month="March";}
		System.out.println("Month index " + index + " is in Q1" + ",its " + month );
		}
	
	else if (index >=4 && index <=6) {
		if (index == 4) {
			month="April";}
		else if (index == 5) {
			month="May";}
		else if (index == 6) {
			month="June";}
	System.out.println("Month index " + index + " is in Q2" + ",its " + month );
 	} 
	
	else if (index >=7 && index <=9) {
		if (index == 7) {
			month="July";}
		else if (index == 8) {
			month="August";}
		else if (index == 9) {
			month="September";}
	System.out.println("Month index " + index + " is in Q3" + ",its " + month );
	}
	
	else if (index >=10 && index <=12) {
		if (index == 10) {
			month="October";}
		else if (index == 11) {
			month="November";}
		else if (index == 12) {
			month="December";}
	System.out.println("Month index " + index + " is in Q4" + ",its " + month );}
	
	else if(index<=0) {
		System.out.println("Number cannot be negative");
	}
	
	else {
		System.out.println("Invalid month index, it can't be greater than 12");}
	
	}
 	public static void main(String[] args){
	 Assignment10_MonthIndex monthindex = new Assignment10_MonthIndex();
	 monthindex.quater(1);
	 monthindex.quater(5);
	 monthindex.quater(7);
	 monthindex.quater(12);
	 monthindex.quater(-3);
	 monthindex.quater(13);
	 }
	 
}
