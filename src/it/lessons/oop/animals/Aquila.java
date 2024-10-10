package it.lessons.oop.animals;

public class Aquila extends Animale implements IVolante {

	@Override
	public void mangia() {
		System.out.println("Mangia animali di taglia differente");
	}

	@Override
	public void faiVerso() {
		System.out.println("Grida");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando");
	}

}
