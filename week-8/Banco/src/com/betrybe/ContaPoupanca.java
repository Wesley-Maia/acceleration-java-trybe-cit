package com.betrybe;

public class ContaPoupanca {
	
	private int saldo = 0;
	
	public int depositar(int valor) {
		return this.saldo = this.saldo + valor;
	}
	
	public int sacar(int valor) {
		return this.saldo = this.saldo - valor;
	}
	
	public int verSaldo() {
		return this.saldo;
	}
}
