package it.lessons.oop.inheritance.shapes;

import java.util.Scanner;

public class MainPolimorfismo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Scegliere la forma per calcolare area e perimetro\n"
				+ "- 1 per cerchio\n"
				+ "- 2 per triangolo\n"
				+ "- 3 per quadrato\n"
				+ "- 4 per rettangolo\n"
				+ "- 5 per rombo");
		
		int scelta = scan.nextInt();
		FormaGeometrica forma = null;
		switch(scelta) {
			case 1: {
				System.out.println("Hai scelto cerchio, inserisci il raggio");
				double raggio = scan.nextDouble();
				forma = new Cerchio(raggio);
				break;
			}
			case 2: {
				System.out.println("Hai scelto il triangolo, inserisci i 3 lati");
				double lato1 = scan.nextDouble();
				double lato2 = scan.nextDouble();
				double lato3 = scan.nextDouble();
				forma = new Triangolo(lato1, lato2, lato3);
				break;
			}
			case 3: {
				System.out.println("Hai scelto il quadrato, inserisci il lato");
				double lato = scan.nextDouble();
				forma = new Quadrato(lato);
				break;
			}
			case 4: {
				System.out.println("Hai scelto il rettangolo, inserisci base e altezza");
				double base = scan.nextDouble();
				double altezza = scan.nextDouble();
				forma = new Rettangolo(base, altezza);
				break;
			}
			case 5: {
				System.out.println("Hai scelto il rombo, inserisci base e altezza");
				double base = scan.nextDouble();
				double altezza = scan.nextDouble();
				forma = new Rombo(base, altezza);
				break;
			}
			default: {
				System.out.println("Non hai scelto correttamente");
//				forma = new FormaGeometrica();
				forma = new FormaGeometrica() {
					
					@Override
					protected void calcolaPerimetro() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void calcolaArea() {
						// TODO Auto-generated method stub
						
					}
				};
			}
		}
		
		System.out.printf("Hai scelto la forma %s e la sua area è "
				+ "%f e il suo perimetro è %f", forma.getNomeFigura(),
				forma.getArea(), forma.getPerimetro());
		
	}
}
