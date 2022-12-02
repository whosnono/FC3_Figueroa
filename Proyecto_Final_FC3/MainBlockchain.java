package Proyecto_Final_FC3;

import java.util.Scanner;

/*Equipo:
Figueroa Hernández Sofia Belem
Matus Valencia Elda Berenice
*/

public class MainBlockchain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos bloques quieres?");
		int resp = sc.nextInt();
		System.out.println(" ");
		Blockchain bc = new Blockchain();
		char[] arr = new char[resp];
		for (int i = 1; i < arr.length; i++) {
			System.out.println("Data Bloque " + (i));
			String data = sc.next();
			Bloque a = new Bloque(new java.util.Date(), data);
			bc.añadirBloque(a);
			System.out.println(" ");
		}

		/*Bloque a = new Bloque(new java.util.Date(), "casa");
		Bloque b = new Bloque(new java.util.Date(), "esta");
		Bloque c = new Bloque(new java.util.Date(), "muy");
		Bloque d = new Bloque(new java.util.Date(), "bonita");
		
		bc.añadirBloque(a);
		bc.añadirBloque(b);
		bc.añadirBloque(c);
		bc.añadirBloque(d);*/
		
		bc.displayChain();
		
		bc.isValid();

        bc.getLatestBlock();

	}
	
}
