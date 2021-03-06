package POO1_Mod3_EXE2ContaBancaria;

public class ContaBancaria {
    //Atributos
    private String numeroConta;
    private double saldo;
    private String nomeCorrentista;

    //Método Constructor
    public ContaBancaria (){

    }
    public ContaBancaria(String numeroConta, double saldo, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
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

    // Método Saque
    public double saqueConta(double valorSaque){
        saldo = saldo - valorSaque;
        return  saldo;
    }

    //Método Depósito
    public double depositoConta(double valorDeposito){
        saldo = saldo + valorDeposito;
        return saldo;
    }

    //Método Extrato
    public void extrato(){
        System.out.println("======================================");
        System.out.println("\t Extrato Conta "+numeroConta);
        System.out.println("======================================");
        System.out.println("Correntista: \t"+nomeCorrentista);
        System.out.println("Número de Conta: \t"+numeroConta );
        System.out.println("Saldo Atua: \t"+saldo);
        System.out.println("======================================");
    }


}
