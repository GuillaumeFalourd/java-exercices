# Temperatura

## Enunciado

Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
- F = C * 1.8 + 32
- K = C + 273.15
- Re = C * 0.8
- Ra = C * 1.8 + 32 + 459.67

## Orientações

Antes de ver a resolução do exercício, tente fazer sozinho e depois compare com a versão abaixo, pois não se aprende a programar copiando códigos! 
Vamos começar declarando todas as variáveis que vamos utilizar como double, que são: C, K, F, Re e Ra. 
Para fazer os cálculos, vamos considerar a temperatura em Celsius como 2.43 (mas pode ser qualquer valor que você desejar). 
Em seguida, vamos calcular as fórmulas das respectivas temperaturas, conforme dito no enunciado. 
Por fim, baste exibir os dados, vamos utilizar o System.out.println para exibir uma mensagem personalizada e a respectiva temperatura calculada.

* * *

## Resposta

```java
package exercicios;

public class Temperatura {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);
    }
}

```
