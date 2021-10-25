package POO1_Mod3_EXE2ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria newConta = new ContaBancaria("0125454",138.58,"Raline Maria");
        System.out.println(newConta.getNomeCorrentista());
        System.out.println(newConta.getNumeroConta());
        System.out.println(newConta.getSaldo());
    }
}
