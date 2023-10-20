package FootballGame;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private String abreviatura;

    public Equipo(String name, String abreviatura){
        setName(name);
        setAbreviatura(abreviatura);
    }

    public void agregar(Jugador jugador){
        jugadores.add(jugador);
    }

    public int jugadoresCantidad(){
        return jugadores.size();
    }

    public Jugador obtenerJugador(int num){
        Jugador encontrado = jugadores.stream()
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
        String plantel = "";
        for (Jugador jugador:
             jugadores) {
            if (plantel == ""){
                plantel = plantel + "[" +jugador.getNumero() + "] " +jugador.getName() + " (" + jugador.getPosicion() + ")";
            }
            else{
                plantel = plantel + ", [" +jugador.getNumero() + "] " +jugador.getName() + " (" + jugador.getPosicion() + ")";
            }
        }
        return plantel;
    }

}
