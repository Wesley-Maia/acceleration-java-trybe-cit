package trybe;

public class Exceptions {
    public static void main(String[] args) {
        String palavra = null;

        try{
            //Código que pode gerar algum tipo de erro
            int comprimentoPalavra = palavra.length();

            System.out.println("O tamanho da palavra é de: " + comprimentoPalavra + " letras");

        } catch (Exception e){
            //Caso algum erro aconteça, ele será tratado aqui
            System.out.println("Sua palavra está nula!");
        }
    }
}
