package GerenciadorCandidatosVestibular;

public class Candidato {
    private int numeroMatricula;
    private String nomeCandidato;
    private double notaCandidato;

    public Candidato() {
    }

    public Candidato( String nomeCandidato, int numeroMatricula, double notaCandidato) {
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
        retornaDados.append("\n--------------------------");
        retornaDados.append("\nNome:  "+ nomeCandidato);
        retornaDados.append("\nMatrícula: "+ numeroMatricula);
        retornaDados.append("\nNota: "+ notaCandidato);
        retornaDados.append("\n--------------------------");
        return retornaDados.toString();
    }
}
