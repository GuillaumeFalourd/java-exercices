package Classes;

public class Funcionario {

    private String nome;
    private String cpf;
    private Integer numRegistro;
    private String orgaoLotacao;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Integer numRegistro, String orgaoLotacao, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(Integer numeroRegistro) {
        this.numRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void  aumentoSalario() {
       this.salario *= 1.10;
    }

}