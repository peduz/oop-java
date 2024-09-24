package it.lessons.oop;

public class Auto {

	String marca;

	String modello;

	String colore;

	int annoImmatricolazione;

	String targa;

	Dimensioni dimensioni;

	void parti() {
		System.out.println("VROOOM!");
	}

	void cambiaColore(String nuovoColore) {
		colore = nuovoColore;
	}

	String saluta() {
		String saluto = "Ciao sono un'auto";
		saluto += " di colore " + colore;
		return saluto;
	}

	int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	
	void getVolume(int larghezza, int altezza, int lunghezza) {
		int volume = larghezza * altezza * lunghezza;
//		return volume;
		System.out.println(volume);
	}
}
