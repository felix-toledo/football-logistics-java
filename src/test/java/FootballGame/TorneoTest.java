package FootballGame;

import org.junit.Test;
import static org.junit.Assert.*;

public class TorneoTest {
    @Test
    public void create_new_tournament_with_two_teams(){
        Torneo lpf = new Torneo("Liga profesional de Futbol");
        assertEquals("Liga profesional de Futbol", lpf.getName());
    }

}
