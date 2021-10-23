package GerenciadorCandidatosVestibular;

import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Candidato cadastrarCandidato(){
        String nome = receberDados("Digite o nome do Candidato: ").nextLine();
        int numeroMatricula = receberDados("Digite o número da matrícula: ").nextInt();
        double nota = receberDados("Qual a nota do candidato: ").nextDouble();

        Candidato novoCandidato = ServicoCandidato.cadastrarCandidato(nome, numeroMatricula,nota);
        return novoCandidato;
    }
}
