package Exercicio3Aquecimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Sistema {
    // método para receber os dados do usuário

    private static Scanner entradaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
//metodo para receber os dados de cadastro do prato:

    public static Prato cadastrarPrato() {
        String nome = entradaDados("Por favor, digite o nome do prato:").nextLine();
        //String  ingrediente = entradaDados("Por favor, digite os ingredientes: ").nextLine();
        List<Ingrediente> ingredientes = new ArrayList<>();
        boolean continua = true;
        while (continua) {
            String nomeIngrediente = entradaDados("Por favor, digite os ingredientes: ").nextLine();
            if (!Objects.equals(nomeIngrediente, "")) { //não entendi, mas aceitei a sugestão do intellij e deu certo.
                ingredientes.add(new Ingrediente(nomeIngrediente));
            } else {
                continua = false;
            }
        }

        return ServicoPrato.cadastrarPrato(nome, ingredientes);
    }

}
