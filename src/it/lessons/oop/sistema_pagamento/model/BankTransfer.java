package it.lessons.oop.sistema_pagamento.model;

public class BankTransfer extends PaymentMethod {

	@Override
	public void pay(double cost) {
		System.out.println("Il costo è " + applyFee(cost));
	}

	@Override
	public double applyFee(double cost) {
		return cost;
	}

	@Override
	public String getSystemName() {
		return "Bank transfer";
	}

	@Override
	protected boolean hasPhisicalInstrument() {
		return false;
	}

	@Override
	protected String getPercentualFee() {
		return null;
	}
}
