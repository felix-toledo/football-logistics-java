package FootballGame;

import FootballGame.Interfaces.IImprimible;
import FootballGame.Interfaces.IJugador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Equipo implements IImprimible {
    private String nombre;
    private ArrayList<IJugador> jugadores = new ArrayList<>();
    private String abreviatura;

    public Equipo(String name, String abreviatura){
        setName(name);
        setAbreviatura(abreviatura);
    }

    public void agregar(IJugador jugador){
        jugadores.add(jugador);
    }

    public int jugadoresCantidad(){
        return jugadores.size();
    }

    public IJugador obtenerJugador(int num){
        IJugador encontrado = jugadores.stream()
                                      .filter(jugador -> jugador.getNumero() == num)
                                      .findFirst()
                                      .orElse(null);
        return encontrado;
    }

    public void setName(String nombre){
        this.nombre = nombre;
    }

    public String getName(){
        return nombre;
    }

    public void setAbreviatura(String abreviatura){
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura(){
        return abreviatura;
    }

    public String imprimirPlantel(){
        // sort jugadores by numero
        // [%s] %s (%s),... .format(numero, nombre, posicion)
        ArrayList<IJugador> jugadores = this.jugadores;
        Comparator<IJugador> byNumero = Comparator.comparing(IJugador::getNumero);
        Collections.sort(jugadores, byNumero);
        String plantel = "";
        for (IJugador jugador : jugadores) {
            if (!plantel.isEmpty()){
                plantel = plantel.concat(", ");
            }
            plantel = plantel.concat("[" + jugador.getNumero() + "] " +
                    jugador.getName() + " (" + jugador.getPosicion() +")"
            );
        }

        return plantel;
    }

    @Override
    public String impresion() {
        return "[Equipo] " + nombre + " > " + abreviatura;
    }
}
