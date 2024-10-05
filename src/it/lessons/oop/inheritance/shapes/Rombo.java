package it.lessons.oop.inheritance.shapes;

public class Rombo extends FormaGeometrica {

	private double base;
	
	private double altezza;
	
	public Rombo(double base, double altezza) {
		this.nomeFigura = "Rombo";
		if(validateInput(base, altezza)) {
			this.base = base;
			this.altezza = altezza;
		} else {
			System.out.println("Input errati, inserisco valori di default");
			this.base = 6;
			this.altezza = 4;
		}
	}
	
	private boolean validateInput(double base, double altezza) {
		if(base <= 0 || altezza <= 0) {
			return false;
		}
		return true;
	}

	@Override
	protected void calcolaPerimetro() {
		this.perimetro = this.base * 4;
	}
	
	
	@Override
	protected void calcolaArea() {
		this.area = this.base * this.altezza;
	}
	
	public double getBase() {
		return base;
	}

	public double getAltezza() {
		return altezza;
	}
	
}
