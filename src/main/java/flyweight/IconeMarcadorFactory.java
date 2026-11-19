package main.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconeMarcadorFactory {
    private static Map<String, IconeMarcador> icones = new HashMap<>();

    public static IconeMarcador getIcone(String nome, String cor) {
        IconeMarcador icone = icones.get(nome);
        if (icone == null) {
            icone = new IconeMarcador(nome, cor);
            icones.put(nome, icone);
        }
        return icone;
    }

    public static int getTotalIcones() {
        return icones.size();
    }

}
