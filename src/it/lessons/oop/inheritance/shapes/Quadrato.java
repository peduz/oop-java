package it.lessons.oop.inheritance.shapes;

public class Quadrato extends FormaGeometrica {

	private double lato;
	
	public Quadrato(double lato) {
		this.nomeFigura = "Quadrato";
		if(validateInput(lato)) {			
			this.lato = lato;
		} else {
			System.out.println("Input non corretti, inserisco valori di default");
			this.lato = 4;
		}
	}

	private boolean validateInput(double lato) {
		if(lato <= 0) {
			return false;
		}
		return true;
	}
	
	@Override
	protected void calcolaPerimetro() {
		this.perimetro = this.lato * 4;
	}
	
	@Override
	protected void calcolaArea() {
		this.area = this.lato * this.lato;
	}
	
	
	public double getLato() {
		return lato;
	}
}
