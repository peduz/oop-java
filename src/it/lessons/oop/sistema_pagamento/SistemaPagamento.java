package it.lessons.oop.sistema_pagamento;

import it.lessons.oop.sistema_pagamento.interfacce.Payment;
import it.lessons.oop.sistema_pagamento.model.BankTransfer;
import it.lessons.oop.sistema_pagamento.model.CreditCard;
import it.lessons.oop.sistema_pagamento.model.PayPal;
import it.lessons.oop.sistema_pagamento.model.PaymentMethod;

public class SistemaPagamento {

	/*
	 * Dovete gestire un sistema di pagamento. 
	 * Ciascun utente potrà pagare i propri ordini come preferisce, 
	 * c'è chi userà un bonifico, 
	 * c'è chi userà paypal e 
	 * c'è chi userà la carta di credito 
	 * L'interfaccia PaymentMethod dovrà provvedere ai metodi 
	 * - pay che accetta un double come parametro  
	 * - applyFee per applicare una percentuale. 
	 * 
	 * I metodi di pagamento sono:
	 * 
	 * - CreditCard gestisce il pagamento con carta 
	 * 		che applica una commissione del 3% 
	 * 
	 * - Paypal gestisce il pagamento con paypal 
	 * 		applicando una commissione del 2% 
	 * 
	 * - BankTransfer gestisce il pagamento tramite bonifico 
	 * 		senza commissioni
	 */
	
	public static void main(String[] args) {
		PaymentMethod paypal = new PayPal();
		
		PaymentMethod bank = new BankTransfer();
		
		PaymentMethod credit = new CreditCard();
		
		System.out.println(paypal.getSystemName());
		paypal.pay(100);
		
		System.out.println(bank.getSystemName());
		bank.pay(80);
		
		System.out.println(credit.getSystemName());
		credit.pay(30);
	}
}
