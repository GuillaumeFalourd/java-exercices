package Exercicio3Aquecimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Sistema {
    // método para receber os dados do usuário

    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
//metodo para receber os dados de cadastro do prato:

    public static Prato cadastrarPrato() {
        String nome = entradaDados("Por favor, digite o nome do prato:").nextLine();
        //String  ingrediente = entradaDados("Por favor, digite os ingredientes: ").nextLine();
        List<Ingrediente> ingredientes = new ArrayList<>();
        boolean continua = true;
        while (continua) {
            String nomeIngrediente = entradaDados("Por favor, digite os ingredientes: ").nextLine();
            if (!Objects.equals(nomeIngrediente, "")) { //não entendi, mas aceitei a sugestão do intellij e deu certo.
                ingredientes.add(new Ingrediente(nomeIngrediente));
            } else {
                continua = false;
            }
        }

        return ServicoPrato.cadastrarPrato(nome, ingredientes);
    }
//metodo para receber o nome do prato a ser excluído

    public static void excluirPrato() {
        String nomePratoExcluido = entradaDados("Por favor, digite o nome do prato a ser excluído:").nextLine();
        ServicoPrato.excluirPrato(nomePratoExcluido);
    }

//método para exibir as opções do menu

    public static void menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("Bem vinde ao sistema de gerenciamento da Bom Prato!");
        System.out.println("---------------------------------------------------");
        System.out.println("Para cadastrar um prato, digite: 1");
        System.out.println("Para listar os pratos cadastrados, digite: 2");
        System.out.println("Para excluir um prato, digite: 3");
        System.out.println("Para sair do sistema, digite: 4");

    }

    //método para executar o programa completo:

    public static boolean executar() {
        boolean operarMenu = true;

        while (operarMenu) {
            menu();
            System.out.println("---------------------------------------------------");
            int escolhaUsuario = entradaDados("Escolha a opção desejada: ").nextInt();
            if (escolhaUsuario == 1) {
                Prato prato = new Prato();
                prato = cadastrarPrato();
                System.out.println("\n");
                System.out.println("Prato cadastrado com sucesso!");
                System.out.println("---------------------------------------");
                System.out.println("\n");
            } else if (escolhaUsuario == 2) {
                System.out.println("---------------------------------------");
                System.out.println("Pratos Cadastrados: ");
                ServicoPrato.exibirPratos();
                System.out.println("---------------------------------------");
            } else if (escolhaUsuario == 3) {
                String pratoExcluido = entradaDados("Por favor, digite o nome do prato a ser excluído: ").nextLine();
                ServicoPrato.excluirPrato(pratoExcluido);
                System.out.println("Prato excluído com sucesso!");
                System.out.println("---------------------------------------");
            } else if (escolhaUsuario == 4) {
                System.out.println("Obrigade e até a próxima!! =)");
                operarMenu = false;
            } else {
                System.out.println("Por favor, digite uma opção válida XD");
            }

        }
        return operarMenu;

    }

}
