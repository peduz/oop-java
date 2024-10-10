package it.lessons.oop.animals;

public class Main {

	/*
	 * *Esercizio 1 : classi astratte*
Dobbiamo realizzare un programma che rappresenti il regno animale.
Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino
Vogliamo che gli animali abbiano i seguenti metodi
- void dormi() (mostra a video “Zzz”)
- void verso() (mostra a video il verso fatto dall'animale specifico)
- void mangia() (mostra a video quello che mangia : erba, carne, ...?)
Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e implementati dalle classi che la estendono?
Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.

*Esercizio 2 : interfacce*
Alcuni degli animali che abbiamo creato volano, altri nuotano.
Gli animali che volano hanno il seguente metodo :
- void vola() (mostra a video “Sto volando!!!”)
Gli animali che nuotano hanno il seguente metodo :
- void nuota() (mostra a video “Sto nuotando!!!”)
Scrivere un programma avente 2 metodi :
- void faiVolare(IVolante animale)
- void faiNuotare(INuotante animale)
Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.
	 */
	
	
	public static void main(String[] args) {
		/*
		 * Potrò utilizzare solo i metodi di Animale perchè
		 * la variabile è di tipo Animale, anche se l'implementazione
		 * dei vari metodi sarà quella di Aquila 
		 */
		Animale a = new Aquila();
		
		a.mangia();
		a.dormi();
		a.faiVerso();
		
		/*
		 * potrò utilizzare solo i metodi dell'interfaccia
		 * IVolante perché la variabile è del tipo IVolante,
		 * anche se l'implementazione sarà quella di Aquila
		 */
		IVolante a2 = new Aquila();
		faiVolare(a2);
		
		/*
		 * Posso usare tutti i metodi presenti nella classe
		 */
		Aquila aquila = new Aquila();
		aquila.mangia();
		aquila.faiVerso();
		aquila.dormi();
		faiVolare(aquila);
		
	}
	
	static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
}
