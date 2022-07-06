package agendac;

import java.util.Scanner;

public class Menu {
    public  static  void main(String[] args){
        Menu menu = new Menu();
        menu.exibir();
    }

    private Agenda agenda;

    public Menu() {
        this.agenda = new Agenda();
    }

    public void exibir() {
        Scanner scan = new Scanner(System.in);

        int opcaoSelecionada = -1;

        while (opcaoSelecionada != 0) {
            System.out.println("Digite a opção desejada");
            System.out.println("0- Sair | 1- Adicionar Contato | 2- Listar Contatos");

            opcaoSelecionada = scan.nextInt();

            switch (opcaoSelecionada) {
                case 0:
                    System.out.println("A agenda foi fechada");
                    System.exit(0);
                    break;
                case 1:
                    this.opcaoAdicionarContato();
                    break;
                case 2:
                    this.opcaoExibirContato();
                    break;
                default:
                    System.out.println("A opção é inexistente");
            }
        }

        System.out.println("Obrigado!");
        scan.close();
    }

    private void opcaoAdicionarContato(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do contato:");
        String nome = scan.nextLine();

        System.out.println("Digite o telefone de contato");
        String telefone = scan.nextLine();

        this.agenda.adicionarContato(new Contato(nome, telefone));
    }

    private void opcaoExibirContato() {
        System.out.println("--- Lista de Contatos ---");
        this.agenda.exibirContato();
        System.out.println("--- Fim ---");
    }
}
