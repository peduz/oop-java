package it.lessons.oop.shop;

public class Main2 {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("Monitor", "Lg...", 178.45);
		Prodotto p12 = new Prodotto("Monitor", "Lg...", 178.45);
		Prodotto p3 = new Prodotto("Scanner", "Scanner Canon...", 78.45);
		Prodotto p5 = new Prodotto("Stampante", "Stampante epson...", 48.45);

		System.out.println(p1.getDescrzione());
		
		p1.setDescrizione("Monitor lg 32\" ");
		
		System.out.println(p1.getDescrzione());
	}
}
