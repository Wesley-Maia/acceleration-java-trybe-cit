import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Eu sou a classe de teste da calculadora")
class TesteCalculadora {

	@Test
	@DisplayName("testando o m�todo somar...")
	public void testeSomar() {
		Calculadora cal = new Calculadora();
		assertEquals(34, cal.somar(32, 2));
	}

	@Test
	@DisplayName("testando o m�todo subtrair...")
	public void testeSubtrair() {
		Calculadora cal = new Calculadora();
		assertEquals(1, cal.subtrair(3, 2));
	}

	// m�todo para testar o m�todo dividir da classe Calculadora
	@Test
	@DisplayName("testando o m�todo dividir...")
	public void testeDividir() {
		Calculadora cal = new Calculadora();
		assertEquals(3, cal.dividir(6, 2));
	}

	// m�todo para testar o m�todo verificarDividendo da classe Calculadora
	@Test
	@DisplayName("testando o m�todo verificar dividendo...")
	public void testeVerificarDividendo() {
		Calculadora cal = new Calculadora();
		assertTrue(cal.verificarDividendo(5));
	}
}
