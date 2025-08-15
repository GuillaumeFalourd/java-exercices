# Encapsulamento

- Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java

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

```

</details>

---

- Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
  - Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
  - Aumentar e diminuir o número do canal em uma unidade;
  - Trocar para um canal indicado;
  - Consultar o valor do volume de som e o canal selecionado;

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```java

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

```

```java
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


```

</details>

---

**Resolução final:**

<details>
  <summary>Spoiler warning</summary>

```java
import java.time.LocalDate;

/**
 * Classe principal para testar as funcionalidades das classes Pessoa,
 * Televisão e ControleRemoto.
 */
public class Main {
    public static void main(String[] args) {

         // Parte 1 - Criar e exibir informações de uma pessoa
        System.out.println("---Parte 1---");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa");
        pessoa.setDataDeNascimento(LocalDate.of(2000, 1, 1));
        pessoa.setAltura(1.72f); // Altura em metros

        System.out.println(pessoa.toString());

        // Parte 2 - Criar televisões e controles remotos
        System.out.println("---Parte 2---");
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        ControleRemoto controle1 = new ControleRemoto(tv1);
        ControleRemoto controle2 = new ControleRemoto(tv2);
        ControleRemoto controle3 = new ControleRemoto(tv2);

        // Exibir informações iniciais
        controle1.exibirInfo();
        controle2.exibirInfo();
        controle3.exibirInfo();

        // Alterar volumes e canais
        for (int i = 0; i < 3; i++) {
            controle1.aumentarVolume();
        }

        controle2.diminuirVolume();
        controle3.mudarCanal(8);

        // Exibir informações atualizadas
        controle1.exibirInfo();
        controle2.exibirInfo();
        controle3.exibirInfo();
    }
}


```

**Saída esperada:**

```bash
---Parte 1---
Nome: Pessoa | Idade: 25 | Altura: 1.72 m
---Parte 2---
Canal atual: 1 | Volume atual: 50
Canal atual: 1 | Volume atual: 50
Canal atual: 1 | Volume atual: 50
Canal atual: 1 | Volume atual: 53
Canal atual: 8 | Volume atual: 49
Canal atual: 8 | Volume atual: 49

```

</details>
