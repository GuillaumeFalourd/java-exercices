package ExercicioDoisAquecimento;

import Exercicio2Aquecimento.Candidato;

import java.util.ArrayList;
import java.util.List;

public class ServicoCandidato {
    private static List<Exercicio2Aquecimento.Candidato> candidatos = new ArrayList<>();

    public ServicoCandidato(List<Exercicio2Aquecimento.Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Exercicio2Aquecimento.Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    //método para adicionar um candidato

    public static Candidato adicionarCandidato(String nome, String numeroMatricula, double nota) {
        Candidato candidato = new Candidato(nome, numeroMatricula, nota);
        candidatos.add(candidato);
        return candidato;
    }

}
