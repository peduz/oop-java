package it.lessons.oop.inheritance.shapes;

public class FormaGeometrica {
	
	protected double perimetro;
	
	protected double area;
	
	protected String nomeFigura;

	public double getPerimetro() {
		calcolaPerimetro();
		return perimetro;
	}

	public double getArea() {
		calcolaArea();
		return area;
	}

	public String getNomeFigura() {
		return this.nomeFigura;
	}
	
	protected void calcolaPerimetro() { }
	protected void calcolaArea() { }
	
}
