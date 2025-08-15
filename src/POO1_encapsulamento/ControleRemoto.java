package POO1_encapsulamento;

/**
 * Classe que representa um controle remoto para uma televisão.
 */
public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    /**
     * Aumenta o volume da televisão em 1 unidade.
     */
    public void aumentarVolume() {
        if (!televisao.estaNoVolumeMaximo()) {
            televisao.setVolume(televisao.getVolume() + 1);
        }
    }

    /**
     * Diminui o volume da televisão em 1 unidade.
     */
    public void diminuirVolume() {
        if (!televisao.estaNoVolumeMinimo()) {
            televisao.setVolume(televisao.getVolume() - 1);
        }
    }

    /**
     * Exibe as informações atuais da televisão.
     */
    public void exibirInfo() {
        System.out.println(televisao.toString());
    }

    /**
     * Muda o canal da televisão para o canal especificado.
     * 
     * @param canal número do canal (deve ser maior a 0)
     */
    public void mudarCanal(int canal) {
        if (canal > 0) {
            televisao.setCanal(canal);
        }
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
}
