package Classes;

public class Admin extends Funcionario{
    
    private String funcaoAdmin;
	private String senioridade;
	
	
	public Admin() {
		super();
	}
	
	public Admin(String nome, String cpf, Integer numRegistro, String orgaoLotacao, Double salario,	String funcAdministrativa, String senioridade) {
		super(nome, cpf, numRegistro, orgaoLotacao, salario);
		this.funcaoAdmin = funcAdministrativa;
		this.senioridade = senioridade;
	}


	public String getFuncAdministrativa() {
		return funcaoAdmin;
	}


	public void setFuncAdministrativa(String funcAdministrativa) {
		this.funcaoAdmin = funcAdministrativa;
	}


	public String getSenioridade() {
		return senioridade;
	}


	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	
	public void  aumentoSalario() {
		super.aumentoSalario();
	}
	
	
}


