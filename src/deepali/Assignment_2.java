package deepali;

/*Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.
*/
public class Assignment_2 {
	int num1 = 10;
	int num2 = 2;
	int ans;
	int addNum;
	int subNum;
	int divNum;
	int mulNum;
	int totalAns;
	
	void additionNumber() {
		addNum = num1 + num2;	
	}
	
	void subtractionNumber() {
		subNum = num1 - num2;
	}
	
	void divisionNumber() {
		divNum = num1 / num2;	
	}
	
	void multipicationNumber() {
		mulNum = num1 * num2;
	}
	
	void printTotal() {
		totalAns = addNum + subNum + mulNum + divNum;
		System.out.println("Total answer : " + totalAns );
	}
	
	public static void main(String[] args) {
		Assignment_2 assignment = new Assignment_2();
		assignment.additionNumber();
		assignment.subtractionNumber();
		assignment.divisionNumber();
		assignment.multipicationNumber();
		assignment.printTotal();
	}
}
