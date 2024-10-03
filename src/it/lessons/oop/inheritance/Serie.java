package it.lessons.oop.inheritance;

public class Serie extends Contenuto {

	private int numeroEpisodi;
	
	private Episodio[] episodi;
	
	public Serie(String titolo, int numeroEpisodi) {
		super(titolo);
		this.numeroEpisodi = numeroEpisodi;
	}
	
	@Override
	public void riproduci() {
		super.riproduci();
		System.out.println("Serie di " + 
		numeroEpisodi + " episodi");
	}
	
	@Override
	public String toString() {
		return "Serie " + titolo + 
				 " di " + numeroEpisodi + " episodi";
	}
	
	protected int getNumeroEpisodi() {
		return this.numeroEpisodi;
	}
}
