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
}
