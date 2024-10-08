package it.lessons.oop.astrazioni.main;

import it.lessons.oop.astrazioni.OggettoAccendibile;
import it.lessons.oop.astrazioni.Tesla;

public class MainInterfacce {

	public static void main(String[] args) {
		
		OggettoAccendibile autoAccendibile = new Tesla();
		
		System.out.println(autoAccendibile.accendi());
		
	}
}
