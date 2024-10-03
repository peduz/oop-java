package it.lessons.oop.inheritance;

public class Movie extends Contenuto {
	
	private long durata;
	
	public Movie(String titolo) {
		super(titolo);
	}

	public long getDurata() {
		return durata;
	}
	
	public void setDurata(long durata) {
		this.durata = durata;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " dura " + durata + " minuti";
		
	}
}
