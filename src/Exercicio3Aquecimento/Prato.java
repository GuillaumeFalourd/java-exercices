package Exercicio3Aquecimento;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    public class Prato {
        private String nome;
        private List<Ingrediente> ingredientes = new ArrayList<>();

        public Prato() {
        }

        public Prato(String nome, List<Ingrediente> ingredientes) {
            this.nome = nome;
            this.ingredientes = ingredientes;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Ingrediente> getIngredientes() {
            return ingredientes;
        }

        public void setIngredientes(List<Ingrediente> ingredientes) {
            this.ingredientes = ingredientes;
        }

        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("\n Nome do prato: " + nome);
            retorno.append("\n Ingredientes: " + ingredientes);
            return retorno.toString();
        }
    }

}
