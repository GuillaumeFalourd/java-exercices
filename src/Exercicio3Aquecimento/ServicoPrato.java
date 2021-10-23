package Exercicio3Aquecimento;

import java.util.ArrayList;
import java.util.List;

public class ServicoPrato {
    public class ServicoPrato {
        private static List<Prato> pratos = new ArrayList<>();

        public ServicoPrato(List<Prato> pratos) {
            this.pratos = pratos;
        }

        public List<Prato> getPratos() {
            return pratos;
        }

        public void setPratos(List<Prato> pratos) {
            this.pratos = pratos;
        }

        //método parar cadastrar prato

        public static Prato cadastrarPrato(String nome, List ingredientes) {

            Prato prato = new Prato(nome, ingredientes);
            pratos.add(prato);
            return prato;
        }

        //método para excluir prato:

        public static String excluirPrato(String nome) {
            Prato pratoExcluido = null;
            for (Prato referenciaPrato : pratos) {
                if (referenciaPrato.getNome().equals(nome)) {
                    pratoExcluido = referenciaPrato;
                }
            }
            pratos.remove(pratoExcluido);
            return "Prato" + nome + "excluído com sucesso";
        }

        public static void exibirPratos() {
            for (Prato pratoReferencia : pratos) {
                System.out.println("\n " + pratoReferencia);
            }
        }


        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append(getPratos());
            return retorno.toString();
        }
    }
}
