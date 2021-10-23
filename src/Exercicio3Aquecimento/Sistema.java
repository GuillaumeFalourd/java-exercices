package Exercicio3Aquecimento;

import java.util.Scanner;

public class Sistema {
    // método para receber os dados do usuário

    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
