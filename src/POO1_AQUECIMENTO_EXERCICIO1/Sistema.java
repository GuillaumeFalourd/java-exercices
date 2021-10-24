package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void instanciarProduto(){
        String nome = capturarDados("Digite o nome do produto: ").nextLine();
        double preco = capturarDados("Digite o preço do produto: ").nextDouble();
        ServiceProduto.instanciarProduto(nome,preco);
    }

    public static void adicionarProdutos(){
        int numeroProdutos = capturarDados("Digite quantos produtos deseja adicionar").nextInt();
        ServiceProduto.adicionarProdutos(numeroProdutos);
    }

    public static void excluirProduto(){
        String produtoExcluido = capturarDados("Digite o nome do produto que deseja excluir").nextLine();
        ServiceProduto.excluirProduto(produtoExcluido);
    }

    public static void menu(){
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Exibir produtos cadastrados");
        System.out.println("3 - Excluir produtos");
        System.out.println("4 - Sair");
    }

    public static void executar(){
        boolean loop = true;
        while (loop) {
            menu();
            int escolha = capturarDados("Digite sua escolha").nextInt();
            if (escolha == 1) {
                adicionarProdutos();
            } else if (escolha == 2) {
                ServiceProduto.exibirProdutosCadastrados();
            }
            else if (escolha == 3){
                excluirProduto();
            }
            else if (escolha == 4){
                loop = false;
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }


}
