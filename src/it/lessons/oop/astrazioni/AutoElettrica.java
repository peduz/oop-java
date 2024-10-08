package it.lessons.oop.astrazioni;

public abstract class AutoElettrica extends Auto {
	
	@Override
	public String accendi() {
		return "Accensione elettronica";
	}
	
	@Override
	public String spegni() {
		return "Spegnimento elettronico";
	}
	
	public abstract String manutenzioneBatterie();
	
}
