package GerenciadorTabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        boolean continuar = true;
        int calculo = 0;

        while (continuar) {
            System.out.println("Escolha um número de 1 a 10 para ver a tabuada: ");
            int numero = entradaDados.nextInt();
            entradaDados.nextLine();
            if (numero < 1 | numero > 10){
                System.out.println("Digite um número entre 1 e 10");
            }
            else{
                for (int i = 1; i < 11; i++) {
                    calculo = i * numero;
                    System.out.println(numero + " * " + i + " = " + calculo);
                }
                System.out.println("Deseja ver uma nova tabuada?");
                System.out.println("[1] - Sim\n[2] - Não");
                int opcao = entradaDados.nextInt();

                if (opcao == 1){
                }
                else if (opcao == 2){
                    continuar = false;
                    System.out.println("Até mais!");
                }
                else{
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
}
