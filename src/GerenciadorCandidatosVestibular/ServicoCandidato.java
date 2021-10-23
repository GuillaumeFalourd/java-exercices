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
        System.out.println("Quantidade de candidatos cadastrados: " + candidatos.size());
        for (Candidato candidatoReferencia: candidatos){
            System.out.println(candidatoReferencia);
        }
    }
    public static void verificarMatriculaRepetida (int matricula) throws Exception{
        for (Candidato candidatoReferencia : candidatos){
            if (candidatoReferencia.getNumeroMatricula() == matricula){
                throw new Exception("Matrícula já cadastrada!");
            }
        }
    }
    public static Candidato verificarMatriculaExistente (int matricula) throws Exception{
        for (Candidato candidatoReferencia : candidatos){
            if (candidatoReferencia.getNumeroMatricula() == matricula){
                return candidatoReferencia;
            }
        }
        throw new Exception("Candidato não encontrado");
    }
    public static void excluirCandidato(Candidato candidato){
        candidatos.remove(candidato);
    }

}
