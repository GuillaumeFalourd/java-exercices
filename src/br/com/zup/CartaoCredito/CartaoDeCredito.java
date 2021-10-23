package br.com.zup.CartaoCredito;

public class CartaoDeCredito {
    double limite;
    double saldo;
    String nome;

    public CartaoDeCredito(double limite, double saldo, String nome) {
        this.limite = limite;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void aumentarLimite(double valor) {
        limite = limite + valor;
    }

    public void diminuirLimite(double valor) {
        limite = limite - valor;
    }

    public void realizaComprar(double valor) {
        if (limite - saldo >= valor) {
            limite = limite - valor - saldo;
            saldo = saldo + valor;
            System.out.println("Compra efeituada com SUCESSO !");
        } else {
            System.out.println("Você não tem limite");
        }
    }
}
