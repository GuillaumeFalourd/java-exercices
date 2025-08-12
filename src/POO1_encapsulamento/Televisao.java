package POO1_encapsulamento;

/**
 * Classe que representa uma televisão com controle de volume e canal.
 */
public class Televisao {
    private int volume;
    private int canal;

    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;

    public Televisao() {
        this.volume = 50;
        this.canal = 1;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean estaNoVolumeMaximo() {
        return volume >= VOLUME_MAXIMO;
    }

    public boolean estaNoVolumeMinimo() {
        return volume <= VOLUME_MINIMO;
    }

    @Override
    public String toString() {
        return String.format("Canal atual: %d | Volume atual: %d", canal, volume);
    }
}
