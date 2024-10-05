package it.lessons.oop.inheritance.shapes;

public class Cerchio extends FormaGeometrica {

	private double raggio;

	public Cerchio(double raggio) {
		this.nomeFigura = "Cerchio";
		if(validateInput(raggio)) {			
			this.raggio = raggio;
		} else {
			System.out.println("Input non corretti, inserisco valori di default");
			this.raggio = 5;
		}
	}
	
	private boolean validateInput(double raggio) {
		if(raggio <= 0) {
			return false;
		}
		return true;
	}

	@Override
	protected void calcolaPerimetro() {
		this.perimetro = this.raggio * 2 * Math.PI;
	}
	
	@Override
	protected void calcolaArea() {
		this.area = this.raggio * this.raggio * Math.PI;
	}
	
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
}
