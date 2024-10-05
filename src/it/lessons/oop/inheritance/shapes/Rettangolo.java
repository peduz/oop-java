package it.lessons.oop.inheritance.shapes;

public class Rettangolo extends Quadrato {

	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		super(base);
		this.nomeFigura = "Rettangolo";
		if(validateInput(altezza)) {
			this.altezza = altezza;
		} else {
			System.out.println("Input errati, inserisco valori di default");
			this.altezza = 6;
		}
	}

	private boolean validateInput(double altezza) {
		if(altezza <= 0) {
			return false;
		}
		return true;
	}
	
	
	@Override
	protected void calcolaPerimetro() {
		this.perimetro = (this.getLato() + this.altezza) *2;
	}
	
	@Override
	protected void calcolaArea() {
		this.area = this.getLato() * this.altezza;
	}
	
	public double getAltezza() {
		return altezza;
	}
}
