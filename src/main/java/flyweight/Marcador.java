package main.java.flyweight;

public class Marcador {

    private String nome;
    private IconeMarcador icone;

    public Marcador(String nome, IconeMarcador icone) {
        this.nome = nome;
        this.icone = icone;
    }

    public String obterMarcador() {
        return "Marcador{" +
                "nome='" + this.nome + '\'' +
                ", icone='" + icone.getNome() + '\'' +
                ", cor='" + icone.getCor() + '\'' +
                '}';
    }
}
