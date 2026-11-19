package test.java.flyweight;

import main.java.flyweight.IconeMarcadorFactory;
import main.java.flyweight.Mapa;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapaTest {

    @Test
    void deveRetornarMarcadores() {
        Mapa mapa = new Mapa();
        mapa.marcar("Hospital Central", "Hospital", "Vermelho");
        mapa.marcar("Hospital Regional", "Hospital", "Vermelho");
        mapa.marcar("Santa Casa", "Hospital", "Vermelho");
        mapa.marcar("Farmacia Popular", "Farmacia", "Verde");

        List<String> saida = Arrays.asList(
                "Marcador{nome='Hospital Central', icone='Hospital', cor='Vermelho'}",
                "Marcador{nome='Hospital Regional', icone='Hospital', cor='Vermelho'}",
                "Marcador{nome='Santa Casa', icone='Hospital', cor='Vermelho'}",
                "Marcador{nome='Farmacia Popular', icone='Farmacia', cor='Verde'}");

        assertEquals(saida, mapa.obterMarcadores());
    }

    @Test
    void deveRetornarTotalIcones() {
        Mapa mapa = new Mapa();
        mapa.marcar("Hospital Central", "Hospital", "Vermelho");
        mapa.marcar("Hospital Regional", "Hospital", "Vermelho");
        mapa.marcar("Santa Casa", "Hospital", "Vermelho");
        mapa.marcar("Farmacia Popular", "Farmacia", "Verde");

        assertEquals(2, IconeMarcadorFactory.getTotalIcones());
    }

}
