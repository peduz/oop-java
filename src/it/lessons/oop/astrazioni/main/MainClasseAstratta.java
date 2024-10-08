package it.lessons.oop.astrazioni.main;

import java.util.Scanner;

import it.lessons.oop.astrazioni.Auto;
import it.lessons.oop.astrazioni.BMWElettrica;
import it.lessons.oop.astrazioni.Tesla;

public class MainClasseAstratta {

	public static void main(String[] args) {
		Auto auto = null;
		Scanner scan = new Scanner(System.in);
		
		boolean sceltaCorretta = false;
		while (!sceltaCorretta) {
			
			System.out.println("Che auto vuoi?\n" + "1) Tesla\n" + "2) BMWElettrica ");
			int scelta = scan.nextInt();
			
			switch (scelta) {
			case 1: {
				auto = new Tesla();
				sceltaCorretta = true;
				break;
			}
			case 2: {
				auto = new BMWElettrica();
				sceltaCorretta = true;
				break;
			}
			default: {
				System.out.println("L'auto non è stata scelta");
			}

			}
		}

		if (auto != null) {
			System.out.println(auto.suonaClacson());
			System.out.println(auto.accendi());
			System.out.println(auto.spegni());
		}

	}
}
