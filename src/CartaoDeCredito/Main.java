package CartaoDeCredito;

public class Main {
    public static void main(String[] args) {

        CartaoDeCredito cartao = new CartaoDeCredito("João Pedro",500,300);

        cartao.aumentarLimite(500);
        System.out.println(cartao);

        cartao.diminuirLimite(100);
        System.out.println(cartao);

        cartao.realizarCompra(200);
        System.out.println(cartao);
    }
}
