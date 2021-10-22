package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduto {
    private static List <Produto> listaDeProdutos = new ArrayList<>();

    public static void instanciarProduto(String nome, double preco){
        Produto produto = new Produto(nome, preco);
        listaDeProdutos.add(produto);
    }




}
