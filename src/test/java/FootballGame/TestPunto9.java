package FootballGame;

import FootballGame.Interfaces.IJugador;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPunto9 {
    @Test
    public void jugadores_ejercicio_ejemplo()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");

        for (int i=1; i<=5; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Defensor");
            boca.agregar(jugador);
        }

        for (int i=6; i<=10; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Mediocampo");
            boca.agregar(jugador);
        }

        for (int i=11; i<=15; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Delantero");
            boca.agregar(jugador);
        }


        assertEquals(3, boca.cantidadMediocampoConNumerosMayorQue7());

    }

}
