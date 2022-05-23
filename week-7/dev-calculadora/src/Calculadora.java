
public class Calculadora {

	// soma dois inteiros
	public int somar(int x, int y) {
		return x + y;
	}

	// subtrai dois inteiros
	public int subtrair(int x, int y) {
		return x - y;
	}

	// divide dois inteiros
	public int dividir(int x, int y) {
		if (verificarDividendo(y)) {
			return x / y;
		} else {
			return 0;
		}
	}

	// verifica se o dividendo é diferente de zero
	public boolean verificarDividendo(int y) {
		if (y == 0) {
			return false;
		} else {
			return true;
		}
	}
}
