package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduto {
    public static List <Produto> listaDeProdutos = new ArrayList<>();

    public static void instanciarProduto(String nome, double preco){
        Produto produto = new Produto(nome, preco);
        listaDeProdutos.add(produto);
    }

    public static void adicionarProdutos(int quantidade){
        while (quantidade != 0){
            Sistema.instanciarProduto();
            quantidade --;
        }
    }

    public static void exibirProdutosCadastrados(){
        listaDeProdutos.forEach(System.out::println);
    }


}
