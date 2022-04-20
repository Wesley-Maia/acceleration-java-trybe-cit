package trybe;

public class Email {

    private final EmailIntegracao emailIntegracao;

    public Email(EmailIntegracao emailIntegracao) {
        this.emailIntegracao = emailIntegracao;
    }

    public void enviar(String email) {
        String[] campos = email.split(";");

        String de = campos[0];
        String para = campos[1];
        String copia = campos[2];
        String assunto = campos[3];
        String mensagem = campos[4];

        if ("EIOUA".indexOf(campos[2].toUpperCase()) >= 0) {
            copia = "diretor@company.com";
        }

        assunto = assunto.replace("{de}", de);
        assunto = assunto.replace("{para}", para);

        emailIntegracao.enviar(de, para, copia, assunto, mensagem);
    }

    public static void main(String args[]) {
        Email email = new Email(new EmailIntegracaoImpl());
        email.enviar("wesley@trybe.com;onetax@company.com;a;De {de} para {para};Bom dia amigo");
    }
}
