package it.lessons.oop.inheritance;

public class Contenuto {

	protected String titolo;
	
	public Contenuto(String titolo) {
		super();
		this.titolo = titolo;
	}
	
	public void riproduci() {
		System.out.println("Stai guardando " + titolo);
	}
	
	public final void leggi() {		
		System.out.println("Stai guardando " + titolo);
	}
	
	@Override
	public String toString() {
		return "Titolo " + titolo;
	}
	
}
