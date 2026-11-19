package main.java.flyweight;

public class IconeMarcador {

    private String nome;
    private String cor;

    public IconeMarcador(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}
