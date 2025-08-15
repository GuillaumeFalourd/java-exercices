package POO1_encapsulamento;

import java.time.LocalDate;

/**
 * Classe principal para testar as funcionalidades das classes Pessoa,
 * Televisão e ControleRemoto.
 */
public class Main {
    public static void main(String[] args) {

        // Parte 1 - Criar e exibir informações de uma pessoa
        System.out.println("---Parte 1---");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa");
        pessoa.setDataDeNascimento(LocalDate.of(2000, 1, 1));
        pessoa.setAltura(1.72f); // Altura em metros

        System.out.println(pessoa.toString());

        // Parte 2 - Criar televisões e controles remotos
        System.out.println("---Parte 2---");
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        ControleRemoto controle1 = new ControleRemoto(tv1);
        ControleRemoto controle2 = new ControleRemoto(tv2);
        ControleRemoto controle3 = new ControleRemoto(tv2);

        // Exibir informações iniciais
        controle1.exibirInfo();
        controle2.exibirInfo();
        controle3.exibirInfo();

        // Alterar volumes e canais
        for (int i = 0; i < 3; i++) {
            controle1.aumentarVolume();
        }

        controle2.diminuirVolume();
        controle3.mudarCanal(8);

        // Exibir informações atualizadas
        controle1.exibirInfo();
        controle2.exibirInfo();
        controle3.exibirInfo();
    }
}
