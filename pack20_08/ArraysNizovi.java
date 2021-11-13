package pack20_08;

public class ArraysNizovi {

	public static void main(String[] args) {

	/*	String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		int[] myNum = { 10, 20, 30, 40 };

		int[] myArray = new int[20];
		myArray[1] = 10; */
		
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println("cars[" + i + "]: " + cars[i]);
//oko +i+ uglaste zagrade su mogle biti bilo kakve - deo teksta!
			
		}
/*
	int index = 0;
	for (String s : cars) {
	System.out.println("cars <" + index + ">: " + s);
 	index++;
 */
		for (String s : cars) {
			System.out.println(s);

		}

	}
}
