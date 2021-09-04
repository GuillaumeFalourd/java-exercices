# Media

## Enunciado

Programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários em JOptionPane e devolvendo a média.

* * *

## Possivel Resolução

```java
import javax.swing.JOptionPane;
public class Media {
    public static void main(String[] args) {
 
        int quantidadeFuncionarios = 0;
        float salarioFuncionario = 0;
        float totalSalarios = 0;
        float mediaSalarial = 0;
        //variável contadora para laço
        int contadora = 0;
       
        Scanner entrada = new Scanner(System.in);
   
        System.out.println("Digite a quantidade de funcionários:");
        quantidadeFuncionarios = entrada.nextInt();
         
        while (contadora < quantidadeFuncionarios){
            contadora++;
            System.out.println("Digite o salário do funcionário:");
            salarioFuncionario = entrada.nextFloat();
            totalSalarios = totalSalarios + salarioFuncionario;
        }
         
        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("Média Salarial = " + mediaSalarial);
 
        System.exit(0);
    } 
}
```
