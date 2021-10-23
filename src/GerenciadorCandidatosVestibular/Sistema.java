package GerenciadorCandidatosVestibular;

import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menuOpcoes(){
        System.out.println("\n------------O que deseja fazer?------------");
        System.out.println("[1] - Cadastrar novo candidato;");
        System.out.println("[2] - Exibir candidatos cadastrados;");
        System.out.println("[3] - Sair");
        System.out.println("-------------------------------------------");
        System.out.println("Digite a opção desejada:");
    }
    public static Candidato cadastrarCandidato(){
        String nome = receberDados("Digite o nome do Candidato: ").nextLine();
        int numeroMatricula = receberDados("Digite o número da matrícula: ").nextInt();
        double nota = receberDados("Qual a nota do candidato: ").nextDouble();

        Candidato novoCandidato = ServicoCandidato.cadastrarCandidato(nome, numeroMatricula,nota);
        return novoCandidato;
    }
    public static void executar (){
        boolean continuarExecutar = true;

        System.out.println("Bem vindo ao Sistema de gerenciamento de Candidatos");
        while (continuarExecutar){
            menuOpcoes();
            int opcao = receberDados("").nextInt();

            if (opcao == 1){
                Candidato novoCandidato = cadastrarCandidato();
                System.out.println(novoCandidato);
            }
            if (opcao ==2 ){
                ServicoCandidato.exibirCandidatosCadastrados();
            }
            if (opcao == 3){
                continuarExecutar = false;
                System.out.println("Até mais!");
            }
        }
    }
}
