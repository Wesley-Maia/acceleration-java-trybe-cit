package agendac;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private File arquivoBancoDados;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
        this.arquivoBancoDados = new File("C:\\Users\\maiaw\\banco.txt");
    }

    public void adicionarContato(Contato contato) {
        /*
        this.contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
         */
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
        /*
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        }
         */
        try {
            FileReader leitorArquivo = null;
            BufferedReader bufferedLeitor = null;

            if (arquivoBancoDados.exists()) {
                leitorArquivo = new FileReader(arquivoBancoDados);
                bufferedLeitor = new BufferedReader(leitorArquivo);

                String conteudoLinha = bufferedLeitor.readLine();

                while (conteudoLinha != null) {
                    System.out.println(conteudoLinha);
                    conteudoLinha = bufferedLeitor.readLine();
                }

                leitorArquivo.close();
                bufferedLeitor.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
