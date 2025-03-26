# Estrutura Sequencial

- João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limitePeso = 50.0;
        double multaPorKg = 4.0;
        double excessoPeso = 0.0;
        double multa = 0.0;

        System.out.println("Digite o peso do peixe em quilogramas: ");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();

        if (peso > limitePeso) {
            excessoPeso = peso - limitePeso;
            multa = excessoPeso * multaPorKg;

            System.out.println("Você excedeu o limite de peso em: " + excessoPeso + " kg.");
            System.out.println("Você deve pagar: R$ " + multa + " em multas à lei de pesca de São Paulo.");
        } else if (peso > 0) {
            System.out.println("Você está dentro dos limites de peso. Nenhuma multa se aplica. Boa pescaria! 🎣");
        } else {
            System.out.println("Peso inválido! Não existem peixes negativos, existem? 🤔");
        }
        scanner.close();
    }
}
```

</details>

---

- Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R $80,00 ou em galões de 3,6 litros, que custam R $25,00.
  Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
  comprar apenas latas de 18 litros;
  comprar apenas galões de 3,6 litros;

  - BONUS: De forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double tintaLitrosPreco = 80.0;
        double tintaGaloesPreco = 25.0;
        double tintaLitros = 18.0;
        double tintaGaloes = 3.6;
        Scanner scanner = new Scanner(System.in);
        double areaPintar = 0.0;


        try {
            System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
            areaPintar = scanner.nextDouble();

            if (areaPintar <= 0) {
                System.out.println("Por favor, digite um valor maior que zero.");
                return;
            }

            // 10% de folga
            double areaComFolga = areaPintar * 1.1;
            double litrosNecessarios = areaComFolga / 6;

            // Apenas latas
            int latasApenas = (int) Math.ceil(litrosNecessarios / tintaLitros);
            double custoLatas = latasApenas * tintaLitrosPreco;

            // Apenas galões
            int galoesApenas = (int) Math.ceil(litrosNecessarios / tintaGaloes);
            double custoGaloes = galoesApenas * tintaGaloesPreco;

            // Mistura para menor desperdício
            int latasMistura = (int) (litrosNecessarios / tintaLitros);
            double restante = litrosNecessarios - (latasMistura * tintaLitros);
            int galoesMistura = (int) Math.ceil(restante / tintaGaloes);
            double custoMistura = (latasMistura * tintaLitrosPreco) + (galoesMistura * tintaGaloesPreco);

            System.out.println("\n--- Resultado ---");
            System.out.printf("Área total com folga de 10%%: %.2f m*2\n", areaComFolga);
            System.out.printf("Litros necessários: %.2f L\n\n", litrosNecessarios);

            System.out.println("1. Comprar apenas latas de 18L:");
            System.out.printf("   %d lata(s) - R$ %.2f\n", latasApenas, custoLatas);

            System.out.println("2. Comprar apenas galões de 3.6L:");
            System.out.printf("   %d galão(ões) - R$ %.2f\n", galoesApenas, custoGaloes);

            System.out.println("3. Mistura (menor desperdício):");
            System.out.printf("   %d lata(s) e %d galão(ões) - R$ %.2f\n", latasMistura, galoesMistura, custoMistura);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        }

        scanner.close();

        
    }
}
```

</details>


