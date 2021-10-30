# Estrutura de Repetição

- Faça um programa que mostra na tela os números de 1 a 100.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java
   public class EstruturaDeRepeticaoExercicio1 {
    
     public static void main(String[] args) {
        
        int contador = 1;
        while (contador <= 100){
            System.out.println(contador);
            contador++;
        }
     }
  }
```
                               
</details>

* * *

- Faça um programa que mostra na tela os números de 100 a 1.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java
 public class EstruturaDeRepeticaoExercicio2 {

    public static void main(String[] args) {

        int contador = 100;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
    }
 }
```
   
</details>

* * *

- Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

```java
TODO
```

* * *

- Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.


 **Resolução:**

<details>
<summary>Spoiler warning</summary>

```java
public class EstruturaDeRepeticaoExercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double media = 0;
        int contador = 1;
        double notaDoAluno ;
        int qtdDeNotas;

        System.out.println("Quantas notas deseja adicionar?");
        qtdDeNotas = leitor.nextInt();

        while (contador <= qtdDeNotas) {
            System.out.println("Digite sua nota " + contador + ": ");
            notaDoAluno = leitor.nextDouble();
            media += notaDoAluno / 4;
            contador++;
        }
        System.out.println(media);
    }
}
```

</details>

* * *
