package it.lessons.oop.inheritance;

public class SerieComedy extends Serie {
	
	private boolean risateFinte;
	
	public SerieComedy(Serie serie, boolean risateFinte) {
		super(serie.titolo, serie.getNumeroEpisodi());
		this.risateFinte = risateFinte;
	}
	
	@Override
	public void riproduci() {
		super.riproduci();
		if(risateFinte) {			
			System.out.println("con risate finte");
		} else {
			System.out.println("senza risate finte");
		}
	}
	
}
