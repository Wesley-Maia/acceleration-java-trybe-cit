package com.betrybe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.betrybe.ContaBancaria;

class ContaBancariaTest {

	@Test
	void testDepositar() {
		ContaBancaria conta = new ContaBancaria();
		assertEquals(500.0, conta.depositar(500.0));
	}

}
