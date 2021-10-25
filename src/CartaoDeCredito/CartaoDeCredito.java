package CartaoDeCredito;

//classe cartao e seus atributos
public class CartaoDeCredito {
    String nomeCliente;
    double limite;
    double saldoFatura;

    // método construtor sem parâmetro
    public CartaoDeCredito() {

    }

    // método construtor com parâmetro
    public CartaoDeCredito(String nomeCliente, double limite, double saldoFatura) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldoFatura = saldoFatura;
    }

    //método aumentar limite
    public void aumentarLimite(double maisLimite) {
        limite = limite + maisLimite;

    }

    //método diminuir limite
    public void diminuirLimite(double menosLimite) {
        limite = limite - menosLimite;
    }

    //Ao realizar uma compra, diminui o limite e a altera o saldo da fatura
    public void realizarCompra(double novaCompra) {
        if (novaCompra <= limite) {
            limite = limite - novaCompra;
            saldoFatura = saldoFatura + novaCompra;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    //Exibe a fatura
    @Override
    public String toString() {
        StringBuilder extratoFatura = new StringBuilder();
        extratoFatura.append("\t");
        extratoFatura.append("\nLimite atual R$: " + limite);
        extratoFatura.append("\nValor da sua fatura R$: " + saldoFatura);
        return extratoFatura.toString();
    }
}
