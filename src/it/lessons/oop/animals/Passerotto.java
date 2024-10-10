package it.lessons.oop.animals;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void mangia() {
		System.out.println("Mangia vermi e semi");
	}

	@Override
	public void faiVerso() {
		System.out.println("Cinguetta");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando");
	}
}
