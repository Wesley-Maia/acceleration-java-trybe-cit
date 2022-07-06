package trybe;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Double saldoAtual = 2000.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = entrada.nextDouble();

        try{
            sacar(saldoAtual, valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }

    public static void sacar (double saldoAtual, double valorSaque) throws SaldoInsuficienteException {
        if(valorSaque > saldoAtual){
            throw new SaldoInsuficienteException();
        } else {
            System.out.println("Saque realizado. Novo salo: " + (saldoAtual - valorSaque));
        }
    }
}
