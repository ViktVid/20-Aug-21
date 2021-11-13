package pack20_08;

public class ArrayWithSplits {

	public static void main(String[] args) {

// OPIS:
//		int[] numbers = {2, 5 , 8 , -4, 10};
//		
//		for(int num: numbers) { 
//			//Za svaki int iz niza numbers definisemo neki num 
//			System.out.println(num);
//		}
		
/*	Primer 1:
 		String myString = "My one and only string.";

		String[] myArray = myString.split("and");

		for (String s : myArray) {
			System.out.println(s);
			
		} 
*/
		
		
/*	Primer 2:
 		String myString = "My one and only string.";

		String[] myArray = myString.split("and");

		for (String s : myArray) {
			System.out.println(s); 
*/
			
		
		
/*	Primer 3:
 		String myString = "BMW, Opel, Kia, Fiat";

		String myArray = myString.replaceAll(", ", ";");
		
		System.out.println(myArray);
*/
	
		
/* Primer 4:
	 	String myString = "2.32 RSD, 1.5 RSD, 4.0 RSD, 10.10 RSD";
	 
		
		// Izbaciti RSD

		myString = myString.replaceAll("RSD", "");
		System.out.println(myString);
		
		// Vadimo cene
		String[] ceneString = myString.split(" , ");
		
		//ovaj int je poslednji dodeljen
		double[] ceneInt = new double[ceneString.length];
		
		for(String num: ceneString) {
		System.out.println(num);
		}
		
		for(int i = 0; i < ceneInt.length; i++) {
			String s = ceneString[ i ];
			ceneInt[ i ] = Double.parseDouble(s);
		}
*/

	}

}
