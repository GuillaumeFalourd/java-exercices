package GerenciadorCandidatosVestibular;

import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
