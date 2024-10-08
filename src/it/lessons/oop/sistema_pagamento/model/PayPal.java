package it.lessons.oop.sistema_pagamento.model;

public class PayPal extends PaymentMethod {
	private final double FEE = 1.02;
	

	@Override
	public double applyFee(double cost) {
		return cost * FEE;
	}

	@Override
	public String getSystemName() {
		return "PayPal";
	}

	@Override
	protected boolean hasPhisicalInstrument() {
		return false;
	}

	@Override
	protected String getPercentualFee() {
		return "2%";
	}
}
