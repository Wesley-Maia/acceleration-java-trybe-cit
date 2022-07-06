package trybe;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int resultado = 25 / 5;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro tratado");
            System.out.println(e);
        } finally {
            System.out.println("Bloco finally");
        }
    }
}
