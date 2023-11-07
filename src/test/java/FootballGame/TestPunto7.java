package FootballGame;
import FootballGame.Interfaces.IJugador;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPunto7 {
    @Test
    public void partido_con_fecha_ejercicio_ejemplo_11()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo sanLorenzo = new Equipo("San Lorenzo", "SAL");

        Estadio estadioBombonera = new Estadio("Estadio Pedro Bidegain (El Nuevo Gasometro)", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, sanLorenzo, boca, "Primera Division 2023 | Fecha 12");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, 10, 8); //Mes 10 = Noviembre (comienza en 0)
        Date fecha = calendar.getTime();
        partido.setFecha(fecha);

        assertEquals(fecha, partido.getFecha());

    }
}
