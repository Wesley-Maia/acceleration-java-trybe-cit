package trybe;

public class EmailIntegracaoImpl implements EmailIntegracao {
    @Override
    public void enviar(String de, String para, String copiaOcultaPara, String assunto, String mensagem) {
        System.out.println("De: " + de + "\n" +
                "Para: " + para + "\n" +
                "CC: " + copiaOcultaPara + "\n" +
                "Assunto: " + assunto + "\n" +
                "Mensagem: " + mensagem);
    }
}
