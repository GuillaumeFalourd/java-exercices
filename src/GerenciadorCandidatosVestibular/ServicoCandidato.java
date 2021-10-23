package GerenciadorCandidatosVestibular;

import java.util.ArrayList;
import java.util.List;

public class ServicoCandidato {
    static List<Candidato> candidatos = new ArrayList<>();

    public static Candidato cadastrarCandidato (String nome, int matricula, double nota){
        Candidato novoCandidato = new Candidato(nome, matricula, nota);
        candidatos.add(novoCandidato);
        return novoCandidato;
    }
    public static void exibirCandidatosCadastrados(){
        System.out.println("Quantidade de candadidatos cadastrados: " + candidatos.size());
        for (Candidato candidatoReferencia: candidatos){
            System.out.println(candidatoReferencia);
        }
    }

}
