package com.betrybe;

public class ContaBancaria {
	private double saldo = 0;

	public double depositar(double valor) {
		this.saldo = this.saldo + valor;
		return this.saldo;
	}
}
