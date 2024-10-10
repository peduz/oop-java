package it.lessons.oop.animals;

public class Cane extends Animale implements INuotante {

	@Override
	public void mangia() {
		System.out.println("Dieta onnivora");
	}

	@Override
	public void faiVerso() {
		System.out.println("Abbaia");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando");
	}

	
}
