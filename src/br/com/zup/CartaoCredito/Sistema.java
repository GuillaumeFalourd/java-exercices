package br.com.zup.CartaoCredito;

public class Sistema {
    public static void executar() throws Exception {

        CartaoDeCredito exemplo = new CartaoDeCredito(500, 100, "Lurrégia");

        //Aumentando limite
        exemplo.aumentarLimite(600);

        //Diminuindo limite
        exemplo.diminuirLimite(100);

        //Realizando compra
        exemplo.realizaComprar(200);
        System.out.println("-----");

        //Fatura do cartão
        exemplo.imprimeFatura();

    }
}

