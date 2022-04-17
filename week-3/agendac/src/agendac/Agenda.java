package agendac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private File arquivoBancoDados;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
        this.arquivoBancoDados = new File("C:\\Users\\maiaw\\OneDrive\\Desktop\\Java Aceleração\\acceleration-java-trybe-cit\\week-3\\banco.txt");
    }

    public void adicionarContato(Contato contato) {
//        this.contatos.add(contato);
//        System.out.println("Contato adicionado com sucesso!");
        try {
            FileWriter escritorArquivo = null;
            BufferedWriter bufferedEscritor = null;

            if (!this.arquivoBancoDados.exists()) {
                arquivoBancoDados.createNewFile();
            }

            escritorArquivo = new FileWriter(arquivoBancoDados, true);
            bufferedEscritor = new BufferedWriter(escritorArquivo);

            bufferedEscritor.write(contato.toString());
            bufferedEscritor.newLine();
            bufferedEscritor.flush();

            escritorArquivo.close();
            bufferedEscritor.close();

            this.contatos.add(contato);
            System.out.println("Contato adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exibirContato() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        }
    }
}
