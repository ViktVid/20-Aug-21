//	!(i%2 == 0) - neparno
//	i%2 == 0 - parno


package pack20_08;

import java.util.Scanner;

public class Vezba {

	public static void main(String[] args) {
	
/*		boolean condition = false;
		
		String gender = "M";
		int age = 25;
		
		while (gender.equalsIgnoreCase("M") && !(age > 45)) { 
		}
*/
		
		
/* Zadatak:
 * Napravi meni za kafic, cene nek buduu definisane, uneti kolicinu, stampa racun
	
	
	Napraviti meni	
	1. Pivo
	2. Vinjak
	3. Koktel
	
	Nakon odabira pica, sledi pitanje za kolicinu
	
	Kad korisnik upise kolicinu, ispisite ukupnu cenu
	
	(cene artikala stavite kao promenljive u programu i dodelite im neke vrednosti)		
 */
	/*	Scanner meni = new Scanner(System.in);
		
		System.out.println("Odaberite pice 1, 2 ili 3: \n1. Pivo \n2. Vinjak \n3. Koktel");
		
		int pice = meni.nextInt();
		
		int pivo = 200;
		int vinjak = 300;
		int koktel = 400;
		
		System.out.println("Unesite zeljenu kolicinu: ");
		int kol = meni.nextInt();
		
		if (pice.equals:"1") {
			
		} */
		
		String razmak = " ";
		String z = "*";
		for (int i=5 ; i>1 ; i--) {
		    for (int j = 0 ; j < i ; j++) {
		        System.out.print(razmak);
		    }
		    System.out.println(z);
		    z = z + "**";
		}

	/*	for (int i = 0 ; i < 2 ; i++) {
		    for (int j = 0 ; j < 5 ; j++) {
		        System.out.print(razmak);
		    }
		    System.out.println("|");
		}
		System.out.println("Srecno na testu");*/
	}
}
