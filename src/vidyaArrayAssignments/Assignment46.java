package vidyaArrayAssignments;

/*
 * Print middle character of all the names from given String array.
String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};

output : 
Rohan -> h 
Premlata -> m
Anuja -> u
Fazrana -> r

 */
public class Assignment46 {

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		System.out.println("Length of array names is "+names.length);
		for (int index = 0; index < names.length; index++) {
		System.out.println(names[index] +" "+ names[index].length());
		if(names[index].length()%2==0) {
			System.out.println(names[index]+"-->"+ names[index].charAt((names[index].length()/2)-1));
		}
		else 
		{
			System.out.println(names[index]+"-->"+ names[index].charAt((names[index].length()/2)));
		}
		}
		
	}
	}
