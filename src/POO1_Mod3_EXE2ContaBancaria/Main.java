package POO1_Mod3_EXE2ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria newConta = new ContaBancaria("0125454",138.58,"Raline Maria");
        System.out.println(newConta.getNomeCorrentista());
        System.out.println(newConta.getNumeroConta());
        System.out.println(newConta.getSaldo());

        //Testar Método Saque
        System.out.println("Digite valor do Saque: ");
        double valorModificar = leitor.nextDouble();
        newConta.saqueConta(valorModificar);
        System.out.println("Saldo Atual: "+newConta.getSaldo());

        //Testar Método Deposito
        System.out.println("Digite valor do Deposito: ");
        valorModificar = leitor.nextDouble();
        newConta.depositoConta(valorModificar);
        System.out.println("Saldo Atual: "+newConta.getSaldo());

        //Testar Método Extrato
        newConta.extrato();


    }
}
