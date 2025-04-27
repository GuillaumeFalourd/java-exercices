package Classes;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {

    private String profSupervisionados;

    List<Professor> prof = new ArrayList<>();

    public  Coordenador(String nome, String cpf, Integer numRegistro, String orgaoLotacao, Double salario, String professoresSupervisionados) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.profSupervisionados = professoresSupervisionados;
    }

    public String getProfSupervisionados() {
        return profSupervisionados;
    }

    public void setProfSupervisionados(String professoresSupervisionados) {
        this.profSupervisionados = professoresSupervisionados;
    }

    @Override
    public void  aumentoSalario() {
        this.salario *= 1.05;
    }

    public void adicionaProfessor(Professor professores) {
        if (prof.size() < 10) {
            prof.add(professores);
        } else {
            System.out.println("Limite de professor atingido.");
        }

    }

}
