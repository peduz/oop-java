package it.lessons.oop.inheritance;

public class Episodio extends Contenuto {

	private long durata;
	
	public Episodio(String titolo) {
		super(titolo);
	}
	
	public long getDurata() {
		return durata;
	}
	
	public void setDurata(long durata) {
		this.durata = durata;
	}
}
