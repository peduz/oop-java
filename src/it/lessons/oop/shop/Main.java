package it.lessons.oop.shop;

import java.util.Scanner;

public class Main {
	
	/*
	 * Nello stesso package aggiungete una classe 
	 * Main con metodo main nella quale testate tutte le funzionalità 
	 * della classe Prodotto.
	 */
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("Monitor", "Monitor LG 32\" a schermo piatto");
//		p1.nome = "Monitor";
//		p1.descrizione = "Monitor LG 32\" a schermo piatto";
//		p1.prezzo = 173.31;
//		p1.setCodice();
//		System.out.println("Il codice del prodotto è " + p1.codice);
//		System.out.println("Il nome esteso del prodotto è " + p1.getNomeEsteso());
//		System.out.println("Il prezzo comprensivo d'iva è " + p1.getPrezzoConIva());
		
		Prodotto p3 = new Prodotto("Stampante", "Stampante Canon");
//		p3.nome = "Stampante";
//		p3.descrizione = "Stampante Canon";
//		p3.prezzo = 49.9;
//		p3.setCodice();
		
//		System.out.println("Per ottenere informazioni sui prodotti "
//				+ "digirare il codice " + p1.codice + " o " + p3.codice);
		
		Scanner scan = new Scanner(System.in);
		
//		int scelta = scan.nextInt();
		boolean fine = false;
		int termine = 0;
//		while(termine != 1) {
//			if(scelta == p1.codice) {
//				System.out.println("Il codice del prodotto è " + p1.codice);
//				System.out.println("Il nome esteso del prodotto è " + p1.getNomeEsteso());
//				System.out.println("Il prezzo comprensivo d'iva è " + p1.getPrezzoConIva());
////				fine = true;
//				termine = 1;
//			} else if(scelta == p3.codice) {
//				System.out.println("Il codice del prodotto è " + p3.codice);
//				System.out.println("Il nome esteso del prodotto è " + p3.getNomeEsteso());
//				System.out.println("Il prezzo comprensivo d'iva è " + p3.getPrezzoConIva());
////				fine = true;
//				termine = 1;
//			} else {
//				System.out.println("Codice non valido, reinserire");
//				System.out.println("Per ottenere informazioni sui prodotti "
//						+ "digirare il codice " + p1.codice + " o " + p3.codice);
//				scelta = scan.nextInt();
//			}
//		}
		
		Prodotto prodotto = new Prodotto("Tastiera", "Tastiera meccanica");
//		prodotto.prezzo = 43;
		
		System.out.println("Il prezzo con iva è: " + prodotto.getPrezzoConIva());
		
		
		Prodotto prod;
		
//		System.out.println(prod.codice);
		prod = null;
		
//		System.out.println(prod.codice);
	}
}
