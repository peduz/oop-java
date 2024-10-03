package it.lessons.oop.shop;

import java.util.Random;

/*
 * Creare la classe Prodotto che gestisce i prodotti dello shop.
 * Un prodotto è caratterizzato da: 
 * - codice (numero intero) 
 * - nome 
 * - descrizione 
 * - prezzo 
 * - iva 
 * 
 * Usate opportunamente attributi ed altri metodi per fare in modo che: 
 * - ci sia un metodo che valorizzi il codice prodotto con un numero random 
 * - il prodotto esponga un metodo per avere il prezzo base 
 * - il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
 * - il prodotto esponga un metodo per avere il nome esteso, 
 * 		ottenuto concatenando codice-nome 
 * 
 */
public class Prodotto {
	
	private int codice;
	
	private String nome;
	
	private String descrizione;
	
	private double prezzo;
	
	protected double iva;
	
	protected Prodotto() {
		setCodice();
		this.iva = 1.22; //Default
	}
	
	protected Prodotto(String nome, String descrizione) {
		this();
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	protected Prodotto(String nome, String descrizione, double prezzo) {
		this(nome, descrizione);
		if(prezzo >= 0) {
			this.prezzo = prezzo;
		} else {
			this.prezzo = 100;
		}
	}
	
	private void setCodice() {
		Random ran = new Random();
		setCodice(ran.nextInt(10000));
	}
	
	private void setCodice(int codice) {
		this.codice = codice;
	}
	
	double getPrezzoBase() {
		return this.prezzo;
	}
	
	public double getPrezzoConIva() {
		return this.prezzo * this.iva;
	}
	
	public String getNomeEsteso() {
		return this.codice + "-" + this.nome;
	}
	
	public String getDescrzione() {
		return this.descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public void setIva(double iva) {
		if(iva == 1.04 || iva == 1.1 || iva == 1.22) {
			this.iva = iva;
		}
	}
	
	public void setPrezzo(double prezzo) {
		if(prezzo >= 0 && prezzo >= this.prezzo * 1.10) {			
			this.prezzo = prezzo;
		}
	}
	
	
}
