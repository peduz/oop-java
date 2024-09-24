package it.lessons.oop;

public class UsoAuto {

	public static void main(String[] args) {
		gestisciAuto();
	}
	
	static void gestisciAuto() {
		gestisciDacia();
		gestisciAutoAlessandro();
	}
	
	static Auto inizializzaDacia() {

		Auto miaDacia = new Auto();
		Dimensioni dimensioniMiaDacia = new Dimensioni();
		dimensioniMiaDacia.altezza = 163;
		dimensioniMiaDacia.larghezza = 178;
		dimensioniMiaDacia.lunghezza = 454;
		
		miaDacia.annoImmatricolazione = 2023;
		miaDacia.colore = "Grigio cometa";
		miaDacia.marca = "Dacia";
		miaDacia.modello = "Jogger";
		miaDacia.targa = "AA123AA";
		miaDacia.dimensioni = dimensioniMiaDacia;
		
		return miaDacia;
	}
	
	static void gestisciDacia() {
		
		Auto miaDacia = inizializzaDacia();
		
		System.out.println(miaDacia.dimensioni);
		System.out.println(miaDacia);
		
		System.out.println(String.format("La mia Dacia è lunga %d cm, "
				+ "è larga %d cm, ed è alta %d cm", 
				miaDacia.dimensioni.lunghezza, 
				miaDacia.dimensioni.larghezza,
				miaDacia.dimensioni.altezza));

		miaDacia.parti();
		//...
		System.out.println("Prima del cambio: " + miaDacia.colore);
		
		miaDacia.cambiaColore("Blu");
		
		System.out.println("Dopo il cambio: " + miaDacia.colore);
		
//		int volume = 
		miaDacia.getVolume(300, 250, 120);
		
//		System.out.println("Il volume è " + volume);
	}
	
	static void gestisciAutoAlessandro() {

		
		Auto autoAlessandro = new Auto();
		
//		autoAlessandro.marca = "Volkswagen";
//		autoAlessandro.modello = "Polo GTI";
//		autoAlessandro.annoImmatricolazione = 2019;
//		autoAlessandro.colore = "Nero";
//		autoAlessandro.targa = "AA124AA";
		
		System.out.println("Auto alessandro: marca " + autoAlessandro.marca + 
				" modello  "+ autoAlessandro.modello + " colore " + autoAlessandro.colore);
		
	}

}
