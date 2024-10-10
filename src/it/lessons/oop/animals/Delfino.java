package it.lessons.oop.animals;

public class Delfino extends Animale implements INuotante {

	@Override
	public void mangia() {
		System.out.println("Mangia pesci");
	}

	@Override
	public void faiVerso() {
		System.out.println("Click");
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando");
	}

}
