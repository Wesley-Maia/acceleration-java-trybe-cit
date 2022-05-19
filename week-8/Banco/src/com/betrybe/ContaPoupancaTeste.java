package com.betrybe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaPoupancaTeste {

	@Test
	void testeDepositar() {
		ContaPoupanca poupanca = new ContaPoupanca();
		assertEquals(300, poupanca.depositar(300));
	}
	
	@Test
	void testeSacar() {
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(5000);
		assertEquals(2000, poupanca.sacar(3000));
	}
	
	@Test
	void testeVerSaldo() {
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(2000);
		poupanca.sacar(500);
		assertEquals(1500, poupanca.verSaldo());
	}
}
