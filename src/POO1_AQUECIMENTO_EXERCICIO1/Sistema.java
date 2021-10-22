package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void instanciarProduto(){
        String nome = capturarDados("Digite o nome do produto: ").nextLine();
        Double preco = capturarDados("Digite o preço do produto: ").nextDouble();

    }
}
