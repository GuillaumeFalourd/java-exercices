package ExercicioDoisAquecimento;

import Exercicio2Aquecimento.Candidato;
import Exercicio2Aquecimento.ServicoCandidato;

import java.util.Scanner;

public class Sistema {

    //método para a entrada de dados

    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);

    }
    //método para receber a entrada de dados no cadastro de candidatos:
    public static Candidato adicionarCandidato() {
        String nome = entradaDados("Por favor digite o nome do candidato: ").nextLine();
        String numeroMatricula = entradaDados("Por favor, digite o número de matrícula do candidato: ").nextLine();
        double nota = entradaDados("Por favor, digite a nota do candidato: ").nextDouble();
        return ServicoCandidato.adicionarCandidato(nome, numeroMatricula, nota);
    }


    //método para receber a entrada de dados do método excluirCandidato
    public static void excluirCandidato() {
        String numeroMatricula = entradaDados("Por favor, digite o número de matrícula do candidato que deseja excluir: ").nextLine();
        ServicoCandidato.excluirCandidato(numeroMatricula);
    }


    //método para exibir as opções do menu
    public static void menu() {
        System.out.println("\n ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Olá, seja bem vinde ao sistema de gerenciamento de candidatos < Pagou, pa$$ou >");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\n ");
        System.out.println("Para adicionar um candidato, por favor digite [1]");
        System.out.println("Para exibir os candidatos cadastrados, por favor digite [2]");
        System.out.println("Para excluir um candidato, por favor digite [3]");
        System.out.println("Para sair do sistema, por favor digite [4]");
    }


}
