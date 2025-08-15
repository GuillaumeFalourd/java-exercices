package POO1_encapsulamento;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe que representa uma pessoa com nome, data de nascimento e altura.
 */
public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private float altura; // Altura em metros

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public float getAltura() {
        return altura;
    }

    /**
     * Calcula a idade da pessoa com base na data de nascimento.
     * 
     * @return idade em anos
     */
    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Altura: %.2f m",
                nome, getIdade(), altura);
    }
}
