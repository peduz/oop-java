package it.lessons.oop.astrazioni;

public abstract class Auto implements OggettoAccendibile, OggettoStoppabile, OggettoCheFaRumore {
	
	@Override
	public String suonaClacson() {
		return "BEEP";
	}
	
}
