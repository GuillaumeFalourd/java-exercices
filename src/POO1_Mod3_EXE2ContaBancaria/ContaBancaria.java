package POO1_Mod3_EXE2ContaBancaria;

public class ContaBancaria {
    //Atributos
    private String numeroConta;
    private double saldo;
    private String nomeCorrentista;

    //Método Constructor
    public ContaBancaria (String numeroConta, double saldo, String nomeCorrentista){

    }
    //Getter - Setter

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
}
