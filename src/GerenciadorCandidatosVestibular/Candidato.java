package GerenciadorCandidatosVestibular;

public class Candidato {
    private int numeroMatricula;
    private double notaCandidato;
    private String nomeCandidato;

    public Candidato() {
    }

    public Candidato(int numeroMatricula, double notaCandidato, String nomeCandidato) {
        this.numeroMatricula = numeroMatricula;
        this.notaCandidato = notaCandidato;
        this.nomeCandidato = nomeCandidato;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getNotaCandidato() {
        return notaCandidato;
    }

    public void setNotaCandidato(double notaCandidato) {
        this.notaCandidato = notaCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("--------------------------");
        retornaDados.append("Nome:  "+ nomeCandidato);
        retornaDados.append("Matrícula: "+ numeroMatricula);
        retornaDados.append("Nota: "+ notaCandidato);
        retornaDados.append("--------------------------");
        return retornaDados.toString();
    }
}
