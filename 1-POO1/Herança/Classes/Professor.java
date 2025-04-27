package Classes;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private String nivelGraduação;
	private String diciplinaMinistra;
	private Integer quantAlunos;
	private Integer quantTurmas;
	
	List<Turma> lista = new ArrayList<>();

	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, Integer numRegistro, String orgaoLotacao, Double salario, String nivelGraduação, String diciplinaMinistra, Integer quantAlunos, Integer quantTurmas) {
		super(nome, cpf, numRegistro, orgaoLotacao, salario);
		this.nivelGraduação = nivelGraduação;
		this.diciplinaMinistra = diciplinaMinistra;
		this.quantAlunos = quantAlunos;
		this.quantTurmas = quantTurmas;
	}

	public String getNivelGraduação() {
		return nivelGraduação;
	}

	public void setNivelGraduação(String nivelGraduação) {
		this.nivelGraduação = nivelGraduação;
	}

	public String getDiciplinaMinistra() {
		return diciplinaMinistra;
	}

	public void setDiciplinaMinistra(String diciplinaMinistra) {
		this.diciplinaMinistra = diciplinaMinistra;
	}

	public Integer getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(Integer quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public Integer getQuantTurmas() {
		return quantTurmas;
	}

	public void setQuantTurmas(Integer quantTurmas) {
		this.quantTurmas = quantTurmas;
	}
	
	
	public void aumentoSalario() {
		super.aumentoSalario();
	}
	
   public void  adicionaTurma(Turma turma ) { 
	   lista.add(turma);
	   this.quantTurmas++;
	   this.quantAlunos += turma.getAlunos();
	   
	   
   }
    
}
