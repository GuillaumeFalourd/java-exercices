package GerenciadorCandidatosVestibular;

public class Main {
    public static void main(String[] args){
        boolean continuarExecutar = true;
        while (continuarExecutar){
            try {
                continuarExecutar = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }
    }
}
