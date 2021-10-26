package GerenciadorTabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        boolean continuar = true;
        int calculo = 0;

        while (continuar) {
            System.out.println("Qual o número que deseja ver a tabuada:");
            int numero = entradaDados.nextInt();
            entradaDados.nextLine();

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
