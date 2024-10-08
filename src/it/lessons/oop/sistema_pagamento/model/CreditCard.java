package it.lessons.oop.sistema_pagamento.model;

public class CreditCard extends PaymentMethod {
	
	private final double FEE = 1.03;

	
	
	@Override
	public double applyFee(double cost) {
		return cost * FEE;
	}

	@Override
	public String getSystemName() {
		return "Credit card";
	}

	@Override
	protected boolean hasPhisicalInstrument() {
		return true;
	}

	@Override
	protected String getPercentualFee() {
		return "3%";
	}

}
