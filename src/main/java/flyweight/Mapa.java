package main.java.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private List<Marcador> marcadores = new ArrayList<>();

    public void marcar(String nomeMarcador, String nomeIcone, String cor) {
        IconeMarcador icone = IconeMarcadorFactory.getIcone(nomeIcone, cor);
        Marcador marcador = new Marcador(nomeMarcador, icone);
        marcadores.add(marcador);
    }

    public List<String> obterMarcadores() {
        List<String> saida = new ArrayList<String>();
        for (Marcador marcador : this.marcadores) {
            saida.add(marcador.obterMarcador());
        }
        return saida;
    }


}
