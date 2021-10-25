package CartaoDeCredito;

public class CartaoDeCredito {
    String nomeCliente;
    double limite;
    double saldoFatura;

    public CartaoDeCredito() {

    }

    public CartaoDeCredito(String nomeCliente, double limite, double saldoFatura) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldoFatura = saldoFatura;
    }

    public void aumentarLimite (double maisLimite){
        limite = limite + maisLimite;

    }

    public void diminuirLimite (double menosLimite){
        limite = limite - menosLimite;
    }

    public void realizarCompra( double novaCompra){
        if (novaCompra <= limite) {
            limite = limite - novaCompra;
            saldoFatura = saldoFatura + novaCompra;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    @Override
    public String toString() {
        StringBuilder extratoFatura = new StringBuilder();
        extratoFatura.append("\t");
        extratoFatura.append("Limite atual após compra  R$: " + limite);
        extratoFatura.append("Valor da sua fatura R$: " + saldoFatura);
        return extratoFatura.toString();
    }
}
