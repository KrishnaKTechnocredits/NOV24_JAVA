package sachinarray;

//Assignment - 47 : 15th Dec'2024 [12 mins]
//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

//output : 
//Premlata
//Fazrana

class Assignment47 {

void printName (){

  String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

  for( int index=0; index < names.length; index++){

   String name = names[index];
	 
	 int len = name.length();
	 
	 if (len > 6){
	 
	 System.out.println( name);
	 }


}




}
public static void main (String[] args){
	 Assignment47 ass = new Assignment47();
	 ass.printName();
	 
}
}