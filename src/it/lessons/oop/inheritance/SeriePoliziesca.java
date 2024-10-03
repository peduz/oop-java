package it.lessons.oop.inheritance;

public class SeriePoliziesca extends Serie {

	public SeriePoliziesca(String titolo, int numeroEpisodi) {
		super(titolo, numeroEpisodi);
	}
	
	public SeriePoliziesca(Serie serie) {
		super(serie.titolo, serie.getNumeroEpisodi());
	}
	
}
