package trybe;

public interface EmailIntegracao {
    void enviar(String de, String para, String copiaOcultaPara, String assunto, String mensagem);
}
