package FootballGame;

import org.junit.Test;
import static org.junit.Assert.*;
public class VarTest {
    @Test
    public void el_var_obtiene_solo_tarjetas_amarillas_del_partido_parcial_ejercicio_ejemplo_07()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");

        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);

        boca.agregar(jugadorBoca6);
        boca.agregar(jugadorBoca10);
        boca.agregar(jugadorBoca19);

        Jugador jugadorPalmeiras10 = new Jugador("Rony", 10);

        palmeiras.agregar(jugadorPalmeiras10);

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");

        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);

        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);

        Var elVar  = new Var(partido);
        assertEquals(3, partido.tarjetasCantidad());
        assertEquals(1, elVar.cantidadTarjetasRojas());
        assertEquals(2, elVar.cantidadTarjetasAmarillas());
    }
}
