package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.List;

public class Estabelecimento {
    private String nome;
    private List<Produto> listaDeProdutos;

    public Estabelecimento(String nome, List<Produto> listaDeProdutos) {
        this.nome = nome;
        this.listaDeProdutos = listaDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
