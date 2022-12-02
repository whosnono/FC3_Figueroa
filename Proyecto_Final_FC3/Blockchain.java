package Proyecto_Final_FC3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Equipo:
Figueroa Hernández Sofia Belem
Matus Valencia Elda Berenice
*/

public class Blockchain {

	private List<Bloque> blockchain;
	
	public Blockchain() {
		blockchain = new ArrayList<Bloque>();
		blockchain.add(crearPrimerBloque());
	}
	
	private Bloque crearPrimerBloque() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Data Bloque 0: ");
		String data = sc.nextLine();
		System.out.println(" ");
		Bloque primerBloque = new Bloque( new java.util.Date(), data);
		primerBloque.setHashprevio(null);
		primerBloque.calcularHash();
		return primerBloque;
	}
	
	public void añadirBloque(Bloque blk) {
		Bloque newBlock = blk;
		newBlock.setHashprevio(blockchain.get(blockchain.size()-1).getHash());
		newBlock.calcularHash();
		this.blockchain.add(newBlock);
	}
	
	public void displayChain() {
		
		for(int i=0; i<blockchain.size(); i++) {
			System.out.println("Bloque: " + i);
			System.out.println("Timestamp: " + blockchain.get(i).getTimestamp());
            System.out.println("Data: " + blockchain.get(i).getData());
			System.out.println("Hashprevio: " + blockchain.get(i).getHashprevio());
			System.out.println("Hash: " + blockchain.get(i).getHash());
			System.out.println();
		}
		
	}
	
	public Bloque getLatestBlock() {
		System.out.println(" ");
		System.out.println("Este es el Hash general " + this.blockchain.get(blockchain.size()-1).getHash());
		return this.blockchain.get(blockchain.size()-1);
	}
	
	public void isValid() {
		
		for(int i = blockchain.size()-1; i>0; i--) {
			if(   !(blockchain.get(i).getHash().equals(blockchain.get(i).calcularHash()))   ) {
				System.out.println("Blockchain is not valid");
				return;
			}
			if(  !(blockchain.get(i).getHashprevio().equals(blockchain.get(i-1).calcularHash()))  ) {
				System.out.println("Blockchain is not valid");
				return;
			}
		}
		System.out.println("Blockchain is valid.");	
	}
}
