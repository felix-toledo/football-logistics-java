package FootballGame;
import FootballGame.Interfaces.IJugador;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class ArbitrosVarTest {
    @Test
    public void CantidadDeTartjetasEnPartidoTest() throws Exception {
        Estadio estadio = new Estadio("nombre estadio", "nombre ciudad", "nombre pais");
        Equipo equipoLocal = new Equipo("equipo local", "LOC") ;
        Equipo equipoVisitante = new Equipo("equipo visitante", "VIS") ;
        Arbitro arbitro = new Arbitro("arbitro");
        Arbitro arbitroLinea1 = new Arbitro("arbitro linea 1");
        Arbitro arbitroLinea2 = new Arbitro("arbitro linea 2");
        Arbitro arbitroAsistente = new Arbitro("arbitro asistente");
        Partido partido = new Partido(estadio, equipoLocal, equipoVisitante, "nombre partido", arbitro, arbitroLinea1, arbitroLinea2, arbitroAsistente);

        assertEquals(estadio, partido.getEstadio());
        assertEquals(equipoLocal, partido.getLocal());
        assertEquals(equipoVisitante, partido.getVisitante());
        assertEquals(arbitro, partido.getArbitro());
        ArrayList<Arbitro> arbitrosLinea = new ArrayList<>();
        arbitrosLinea.add(arbitroLinea1);
        arbitrosLinea.add(arbitroLinea2);
        assertEquals(arbitrosLinea, partido.getArbitroLinea());
        assertEquals(arbitroAsistente, partido.getArbitroAsistente());

        AsistenteDeVideo asistenteDeVideo = new AsistenteDeVideo("asistente de video");
        AVAR aVar1 = new AVAR("aVAR1");
        AVAR aVar2 = new AVAR("aVAR2");
        AVAR aVar3 = new AVAR("aVAR3");
        Var var = new Var(partido, asistenteDeVideo, aVar1, aVar2, aVar3);


        IJugador jugador = new Jugador("jugador", 1);
        equipoLocal.agregar(jugador);
        TarjetaAmarilla tarjetaAmarilla1 = new TarjetaAmarilla(jugador);
        TarjetaAmarilla tarjetaAmarilla2 = new TarjetaAmarilla(jugador);
        TarjetaRoja tarjetaRoja = new TarjetaRoja(jugador);
        partido.agregar(tarjetaAmarilla1);
        partido.agregar(tarjetaAmarilla2);
        partido.agregar(tarjetaRoja);

        assertEquals(2, var.cantidadTarjetasAmarillas());
        assertEquals(1, var.cantidadTarjetasRojas());
        assertEquals(3, var.cantidadTarjetas(equipoLocal));
    }
}