package BasicoEstruturaSequencialEXE008;

import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double impostoDeRenda;
        double inss;
        double sindicato;
        double salarioLiquido;

        //Dados do salario BRuto
        System.out.println("Por favor digite seu salario por horas: ");
        double salarioPorHora = leitor.nextDouble();
        System.out.println("Por favor digite as horas trbalhadas: ");
        double horasTrabalhadas = leitor.nextDouble();

        //calculo de Salario Bruto
        double salarioBruto = salarioPorHora * horasTrabalhadas;

        //calcular descontos
        impostoDeRenda = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        double descontos = impostoDeRenda + inss + sindicato;

        //calcular salario liquido
        salarioLiquido = salarioBruto - descontos;

        //Folha de Pagamento
        System.out.println("===============================================");
        System.out.println("                    Pagamento                  ");
        System.out.println("===============================================");
        System.out.println("Salario por hora: \t\t" + salarioPorHora);
        System.out.println("Horas trabalhadas: \t\t" + horasTrabalhadas);
        System.out.println("SALARIO BRUTO: \t\t" + salarioBruto);
        System.out.println("===============================================");
        System.out.println("DESCONTOS:");
        System.out.println("Imposto de Renda (11%): \t" + impostoDeRenda);
        System.out.println("INSS (8%): \t\t\t" + inss);
        System.out.println("Sindicato (5%): \t\t" + sindicato);
        System.out.println("TOTAL DESCONTOS: \t\t" + descontos);
        System.out.println("===============================================");
        System.out.println("SALARIO LIQUIDO: \t\t" + salarioLiquido);
        System.out.println("===============================================");


    }


}
