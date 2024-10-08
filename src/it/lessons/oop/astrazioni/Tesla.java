package it.lessons.oop.astrazioni;

public class Tesla extends AutoElettrica implements OggettoAccendibile {

	
	@Override
	public String suonaClacson() {
		return "BIP BIP BIP";
	}
	
	public String accendi() {
		return "Accensione modalità tesla";
	}
	
	public String manutenzioneBatterie() {
		return "Cambiare ogni 10 anni";
	}
}
