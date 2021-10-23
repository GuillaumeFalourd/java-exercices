package Exercicio3Aquecimento;

public class Ingrediente {
    public class Ingrediente {
        private String nome;

        public Ingrediente(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append(nome);
            return retorno.toString();
        }
    }
}
