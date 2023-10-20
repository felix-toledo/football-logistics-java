package FootballGame;

import java.util.ArrayList;

public class Torneo {
    private String nombre;
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();
    private Equipo ganador;

    
    public Torneo(String nombre){
        this.setName(nombre);
    }

    public int equiposCantidad(){
        return equipos.size();
    }
    public int partidosCantidad(){
        return partidos.size();
    }
    
    public void agregar(Equipo equipoParaAgregar){
        equipos.add(equipoParaAgregar);
    }
    public void agregar(Partido partidoParaAgregar){
        partidos.add(partidoParaAgregar);
    }


    public String getName() {
         return nombre;
    }

    public void setName(String nombre) {
         this.nombre = nombre;
    }
}
