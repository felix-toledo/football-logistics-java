package FootballGame;
import FootballGame.Interfaces.IImprimible;
import FootballGame.Interfaces.IJugador;
import org.junit.Test;
import static org.junit.Assert.*;


public class PantallasLedTest {
    @Test
    public void pantallas_estadio_parcial_ejercicio_ejemplo_10()
    {
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        jugadorBoca6.setPosicion("Defensor");


        Equipo boca = new Equipo("Boca Juniors", "BOC");

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");



        PantallaLed pantallaLed = new PantallaLed();



        assertEquals("[Jugador 6] Marcos Rojo > Defensor", pantallaLed.imprimir((IImprimible)jugadorBoca6));
        assertEquals("[Equipo] Boca Juniors > BOC", pantallaLed.imprimir((IImprimible)boca));
        assertEquals("[Estadio] La Bombonera (Buenos Aires - Argentina)", pantallaLed.imprimir((IImprimible)estadioBombonera));
    }

}
