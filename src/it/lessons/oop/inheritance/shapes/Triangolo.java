package it.lessons.oop.inheritance.shapes;

public class Triangolo extends FormaGeometrica {

	private double lato1;
	private double lato2;
	private double lato3;
	
	public Triangolo(double lato1, double lato2, double lato3) {
		this.nomeFigura = "Triangolo";
		if(validateInput(lato1, lato2, lato3)) {
			this.lato1 = lato1;
			this.lato2 = lato2;
			this.lato3 = lato3;
		} else {
			System.out.println("Input errati, imposto valori di default");
			this.lato1 = 3;
			this.lato2 = 4;
			this.lato3 = 5;
		}
	}	
	
	private boolean validateInput(double lato1, 
						double lato2, double lato3) {
		if(lato1 <= 0 || lato2 <= 0 || lato3 <= 0) {
			return false;
		}
		if(lato1 < (lato2-lato3) || lato1 > (lato2+lato3)) {
			return false;
		}
		if(lato2 < (lato1-lato3) || lato2 > (lato1+lato3)) {
			return false;
		}
		if(lato3 < (lato1-lato2) || lato3 > (lato1+lato2)) {
			return false;
		}
		return true;
	}
	
	@Override
	protected void calcolaPerimetro() {
		this.perimetro = this.lato1 + 
				this.lato2 + this.lato3;
	}
	
	@Override
	protected void calcolaArea() {
		this.getPerimetro();
		
		this.area = Math.sqrt(
				(this.perimetro/2) *
				((this.perimetro/2) - lato1) *
				((this.perimetro/2) - lato2) *
				((this.perimetro/2) - lato3));
	}
	
	public double getLato1() {
		return lato1;
	}
	public double getLato2() {
		return lato2;
	}
	public double getLato3() {
		return lato3;
	}
}
